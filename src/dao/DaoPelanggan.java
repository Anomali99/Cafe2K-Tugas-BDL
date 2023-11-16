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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import model.ModelPelanggan;
import servis.ServisPelanggan;

/**
 *
 * @author fatiq
 */
public class DaoPelanggan implements ServisPelanggan {

    private Connection conn;

    public DaoPelanggan() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelPelanggan mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pelanggan (id_pelanggan, nama, alamat, telephone) VALUES (?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getId());
            st.setString(2, mod.getNama());
            st.setString(3, mod.getAlamat());
            st.setString(4, mod.getTlp());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahData(ModelPelanggan mod) {
        PreparedStatement st = null;
        String sql = "UPDATE pelanggan SET nama = ?, alamat = ?, telephone = ? WHERE id_pelanggan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(4, mod.getId());
            st.setString(1, mod.getNama());
            st.setString(2, mod.getAlamat());
            st.setString(3, mod.getTlp());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pelanggan WHERE id_pelanggan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPelanggan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan ORDER BY id_pelanggan";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPelanggan mod = new ModelPelanggan();
                mod.setId(rs.getString("id_pelanggan"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPelanggan> getByID(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan ILIKE ? ORDER BY id_pelanggan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + id + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPelanggan mod = new ModelPelanggan();
                mod.setId(rs.getString("id_pelanggan"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPelanggan> getByNama(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan WHERE nama ILIKE ? ORDER BY id_pelanggan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPelanggan mod = new ModelPelanggan();
                mod.setId(rs.getString("id_pelanggan"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPelanggan> getByAlamat(String alamat) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan WHERE alamat ILIKE ? ORDER BY id_pelanggan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + alamat + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPelanggan mod = new ModelPelanggan();
                mod.setId(rs.getString("id_pelanggan"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelPelanggan getById(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan WHERE id_pelanggan = ? ORDER BY id_pelanggan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            ModelPelanggan mod = new ModelPelanggan();
            if (rs.next()) {
                mod.setId(rs.getString("id_pelanggan"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
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
        SimpleDateFormat nonformat = new SimpleDateFormat("yyMMdd");
        String no = nonformat.format(now);

        String sql = "SELECT RIGHT (id_pelanggan, 3) AS nomor "
                + "FROM pelanggan "
                + "WHERE id_pelanggan LIKE 'P%' "
                + "ORDER BY id_pelanggan DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "P" + no + String.format("%03d", nomor1);
            } else {
                urutan = "P" + no + "001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPelanggan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

}
