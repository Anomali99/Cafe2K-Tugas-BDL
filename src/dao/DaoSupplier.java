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
import model.ModelSupplier;
import servis.ServisSupplier;

/**
 *
 * @author fatiq
 */
public class DaoSupplier implements ServisSupplier {

    private Connection conn;

    public DaoSupplier() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelSupplier mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO supplier (id_supplier, nama, alamat, telephone) VALUES (?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getId());
            st.setString(2, mod.getNama());
            st.setString(3, mod.getAlamat());
            st.setString(4, mod.getTlp());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahData(ModelSupplier mod) {
        PreparedStatement st = null;
        String sql = "UPDATE supplier SET nama = ?, alamat = ?, telephone = ? WHERE id_supplier = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(4, mod.getId());
            st.setString(1, mod.getNama());
            st.setString(2, mod.getAlamat());
            st.setString(3, mod.getTlp());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM supplier WHERE id_supplier = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupplier> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier ORDER BY id_supplier";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupplier mod = new ModelSupplier();
                mod.setId(rs.getString("id_supplier"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupplier> getByID(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier WHERE id_supplier ILIKE ? ORDER BY id_supplier";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + id + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupplier mod = new ModelSupplier();
                mod.setId(rs.getString("id_supplier"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupplier> getByNama(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier WHERE nama ILIKE ? ORDER BY id_supplier";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupplier mod = new ModelSupplier();
                mod.setId(rs.getString("id_supplier"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelSupplier> getByAlamat(String alamat) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier WHERE alamat ILIKE ? ORDER BY id_supplier";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + alamat + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelSupplier mod = new ModelSupplier();
                mod.setId(rs.getString("id_supplier"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelSupplier getById(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier WHERE id_supplier = ? ORDER BY id_supplier";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            ModelSupplier mod = new ModelSupplier();
            if (rs.next()) {
                mod.setId(rs.getString("id_supplier"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
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
        String tgl = tanggal.format(now);
        String no = nonformat.format(now);

        String sql = "SELECT RIGHT (id_supplier, 3) AS nomor "
                + "FROM supplier "
                + "WHERE id_supplier LIKE 'S%' "
                + "ORDER BY id_supplier DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "S" + no + String.format("%03d", nomor1);
            } else {
                urutan = "S" + no + "001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

}
