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
import model.ModelDetailP;
import model.ModelPembelian;
import servis.ServisMenu;
import servis.ServisPelanggan;
import servis.ServisPembelian;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class DaoPembelian implements ServisPembelian {

    private Connection conn = null;
    private ServisPelanggan servisPel = new DaoPelanggan();
    private ServisPetugas servisPet = new DaoPetugas();
    private ServisMenu servisM = new DaoMenu();

    public DaoPembelian() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelPembelian mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pembelian (no_pembelian, id_pelanggan, id_pegawai, tanggal, total) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(mod.getTgl());
            Timestamp timestamp = new Timestamp(parsedDate.getTime());
            st.setString(1, mod.getNoPembelian());
            st.setString(2, mod.getPelanggan().getId());
            st.setString(3, mod.getPegawai().getId());
            st.setTimestamp(4, timestamp);
            st.setLong(5, mod.getTotal());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (mod.getDetail().isEmpty()) {
            tambahDetail(mod);
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM detail_pembelian WHERE no_pembelian = ?; "
                + "DELETE FROM pembelian WHERE no_pembelian = ?; ";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPembelian> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pembelian ORDER BY no_pembelian";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPembelian mod = new ModelPembelian();
                mod.setNoPembelian(rs.getString("no_pembelian"));
                mod.setPelanggan(servisPel.getById(rs.getString("id_pelanggan")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPembelian> getByNO(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pembelian WHERE no_pembelian ILIKE ? ORDER BY no_pembelian";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + no + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPembelian mod = new ModelPembelian();
                mod.setNoPembelian(rs.getString("no_pembelian"));
                mod.setPelanggan(servisPel.getById(rs.getString("id_pelanggan")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPembelian> getByTanggal(String tanggal) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pembelian WHERE tanggal ILIKE ? ORDER BY no_pembelian";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + tanggal + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPembelian mod = new ModelPembelian();
                mod.setNoPembelian(rs.getString("no_pembelian"));
                mod.setPelanggan(servisPel.getById(rs.getString("id_pelanggan")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelPembelian getByNo(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pembelian WHERE no_pembelian = ? ORDER BY no_pembelian";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, no);
            rs = st.executeQuery();
            ModelPembelian mod = new ModelPembelian();
            if (rs.next()) {
                mod.setNoPembelian(rs.getString("no_pembelian"));
                mod.setPelanggan(servisPel.getById(rs.getString("id_pelanggan")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setTotal(rs.getLong("total"));
                mod.setTgl(rs.getString("tanggal"));
                mod.setDetail(ambilDetail(mod));
                list.add(mod);
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
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
        String sql = "SELECT RIGHT (no_pembelian, 3) AS nomor "
                + "FROM pembelian "
                + "WHERE no_pembelian LIKE 'T%' "
                + "ORDER BY no_pembelian DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "T" + no + String.format("%03d", nomor1);
            } else {
                urutan = "T"+no+"001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

    private void tambahDetail(ModelPembelian mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_pembelian "
                + "(no_pembelian, id_pelanggan, id_pegawai, kode_menu, jumlah, subtotal, keterangan) "
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            for (ModelDetailP p : mod.getDetail()) {
                st = conn.prepareStatement(sql);
                st.setString(1, mod.getNoPembelian());
                st.setString(2, mod.getPelanggan().getId());
                st.setString(3, mod.getPegawai().getId());
                st.setString(4, p.getMenu().getKode());
                st.setInt(5, p.getJml());
                st.setLong(6, p.getSubtotal());
                st.setString(7, p.getKeterangan());
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPembelian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private List<ModelDetailP> ambilDetail(ModelPembelian mod) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_pembelian WHERE no_pembelian = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getNoPembelian());
            rs = st.executeQuery();
            while (rs.next()) {
                ModelDetailP modp = new ModelDetailP();
                modp.setPembelian(mod);
                modp.setPegawai(mod.getPegawai());
                modp.setPelanggan(mod.getPelanggan());
                modp.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                modp.setJml(rs.getInt("jumlah"));
                modp.setKeterangan(rs.getString("keterangan"));
                modp.setSubtotal(rs.getLong("subtotal"));
                list.add(modp);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
