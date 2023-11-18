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
import model.ModelBahan;
import model.ModelMasakan;
import model.ModelMenu;
import servis.ServisMasak;
import servis.ServisMenu;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class DaoMasak implements ServisMasak {

    private Connection conn = null;
    private ServisMenu servisM = new DaoMenu();
    private ServisPetugas servisPet = new DaoPetugas();

    public DaoMasak() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelMasakan mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO memasak (no_masak, kode_menu, id_pegawai, tanggal, keterangan) VALUES (?,?,?,?,?); "
                + "UPDATE menu SET stok = stok + ? WHERE kode_menu = ? ; ";
        try {
            st = conn.prepareStatement(sql);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate = dateFormat.parse(mod.getTgl());
            Timestamp timestamp = new Timestamp(parsedDate.getTime());
            st.setString(1, mod.getNoMasak());
            st.setString(2, mod.getMenu().getKode());
            st.setString(3, mod.getPegawai().getId());
            st.setTimestamp(4, timestamp);
            st.setString(5, mod.getKeterangan());
            st.setInt(6, mod.getMenu().getJmlMenu());
            st.setString(7, mod.getMenu().getKode());
            st.executeUpdate();
            minBahan(mod.getMenu());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoSupply.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM memasak WHERE no_masak = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelMasakan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak ORDER BY no_masak";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMasakan mod = new ModelMasakan();
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelMasakan> getByNO(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak WHERE no_masak ILIKE ? ORDER BY no_masak";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + no + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMasakan mod = new ModelMasakan();
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelMasakan> getByTanggal(String tanggal) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak WHERE CAST(tanggal AS text) LIKE ? ORDER BY no_masak";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + tanggal + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMasakan mod = new ModelMasakan();
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelMasakan> getByPetugas(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak WHERE id_pegawai = ANY ("
                + "SELECT id_pegawai FROM pegawai WHERE nama ILIKE ?"
                + ") ORDER BY no_masak";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMasakan mod = new ModelMasakan();
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelMasakan> getByMenu(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak WHERE kode_menu = ANY ("
                + "SELECT kode_menu FROM menu WHERE nama ILIKE ?"
                + ") ORDER BY no_masak";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMasakan mod = new ModelMasakan();
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelMasakan getByNo(String no) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM memasak WHERE no_masak = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, no);
            rs = st.executeQuery();
            ModelMasakan mod = new ModelMasakan();
            while (rs.next()) {
                mod.setNoMasak(rs.getString("no_masak"));
                mod.setMenu(servisM.getByKode(rs.getString("kode_menu")));
                mod.setPegawai(servisPet.getById(rs.getString("id_pegawai")));
                mod.setKeterangan(rs.getString("keterangan"));
                mod.setTgl(rs.getString("tanggal"));
                list.add(mod);
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
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
        String sql = "SELECT RIGHT (no_masak, 3) AS nomor "
                + "FROM memasak "
                + "WHERE no_masak LIKE 'M%' "
                + "ORDER BY no_masak DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "M" + no + String.format("%03d", nomor1);
            } else {
                urutan = "M" + no + "001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

    private void minBahan(ModelMenu mn) {
        PreparedStatement st = null;
        String sql = "UPDATE bahan SET stok = stok - ? WHERE kode_bahan = ? ; ";
        try {
            for (int i = 0; i < mn.getJmlBahan().size(); i++) {
                st = conn.prepareStatement(sql);
                st.setInt(1, mn.getJmlBahan().get(i));
                st.setString(2, mn.getBahan().get(i).getKode());
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMasak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
