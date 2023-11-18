/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelDetailS;
import model.ModelSupply;
import servis.ServisBahan;
import servis.ServisPetugas;
import servis.ServisSupplier;
import servis.ServisSupply;

/**
 *
 * @author fatiq
 */
public class DaoSupply implements ServisSupply {

    private Connection conn = null;
    private ServisSupplier servisSup = new DaoSupplier();
    private ServisPetugas servisPet = new DaoPetugas();
    private ServisBahan servisB = new DaoBahan();

    public DaoSupply() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelSupply mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO supply (no_supply, id_supplier, id_pegawai, tanggal, total) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(mod.getTgl());
            Timestamp timestamp = new Timestamp(parsedDate.getTime());
            st.setString(1, mod.getNoSupply());
            st.setString(2, mod.getSupplier().getId());
            st.setString(3, mod.getPegawai().getId());
            st.setTimestamp(4, timestamp);
            st.setLong(5, mod.getTotal());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (!mod.getDetail().isEmpty()) {
            tambahDetail(mod);
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM detail_supply WHERE no_supply = ?; "
                + "DELETE FROM supply WHERE no_supply = ?; ";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupply> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply ORDER BY no_supply";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupply mod = new ModelSupply();
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupply> getByNO(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply WHERE no_supply ILIKE ? ORDER BY no_supply";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + no + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupply mod = new ModelSupply();
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupply> getByTanggal(String tanggal) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply WHERE  CAST(tanggal AS text) LIKE ? ORDER BY no_supply";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + tanggal + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupply mod = new ModelSupply();
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupply> getByPetugas(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply WHERE id_pegawai = ANY( "
                + "SELECT  id_pegawai FROM pegawai WHERE nama ILIKE ? )"
                + "ORDER BY no_supply";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupply mod = new ModelSupply();
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupply> getBySupplier(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply WHERE id_supplier = ANY( "
                + "SELECT  id_supplier FROM supplier WHERE nama ILIKE ? )"
                + "ORDER BY no_supply";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupply mod = new ModelSupply();
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }


    @Override
    public ModelSupply getByNo(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supply WHERE no_supply = ? ";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, no);
            rs = st.executeQuery();
            ModelSupply mod = new ModelSupply();
            if (rs.next()) {
                mod.setNoSupply(rs.getString("no_supply"));
                mod.setSupplier(servisSup.getById(rs.getString("id_supplier")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public String getNomer() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nonformat = new SimpleDateFormat("yyMMdd");
        String no = nonformat.format(now);
        String sql = "SELECT RIGHT (no_supply, 3) AS nomor "
                + "FROM supply "
                + "WHERE no_supply LIKE 'R%' "
                + "ORDER BY no_supply DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "R" + no + String.format("%03d", nomor1);
            } else {
                urutan = "R"+no+"001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

    private void tambahDetail(ModelSupply mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_supply "
                + "(no_supply, id_supplier, id_pegawai, kode_bahan, jumlah, subtotal, keterangan) "
                + "VALUES (?,?,?,?,?,?,?); "
                + "UPDATE bahan SET stok = stok + ? WHERE kode_bahan = ?;";
        try {
            for (ModelDetailS p : mod.getDetail()) {
                st = conn.prepareStatement(sql);
                st.setString(1, mod.getNoSupply());
                st.setString(2, mod.getSupplier().getId());
                st.setString(3, mod.getPegawai().getId());
                st.setString(4, p.getBahan().getKode());
                st.setInt(5, p.getJml());
                st.setLong(6, p.getSubtotal());
                st.setString(7, p.getKeterangan());
                st.setInt(8, p.getJml());
                st.setString(9, p.getBahan().getKode());
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private List<ModelDetailS> ambilDetail(ModelSupply mod) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_supply WHERE no_supply = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getNoSupply());
            rs = st.executeQuery();
            while (rs.next()) {
                ModelDetailS modp = new ModelDetailS();
                modp.setSupply(mod);
                modp.setPegawai(mod.getPegawai());
                modp.setSupplier(mod.getSupplier());
                modp.setBahan(servisB.getByKode(rs.getString("kode_bahan")));
                modp.setJml(rs.getInt("jumlah"));
                modp.setKeterangan(rs.getString("keterangan"));
                modp.setSubtotal(rs.getLong("subtotal"));
                list.add(modp);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
