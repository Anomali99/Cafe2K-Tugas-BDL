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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.ModelBahan;
import servis.ServisBahan;

/**
 *
 * @author fatiq
 */
public class DaoBahan implements ServisBahan {

    private Connection conn;

    public DaoBahan() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelBahan mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO bahan (kode_bahan, nama, harga, stok) VALUES (?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getKode());
            st.setString(2, mod.getNama());
            st.setLong(3, mod.getHarga());
            st.setInt(4, mod.getStok());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahData(ModelBahan mod) {
        PreparedStatement st = null;
        String sql = "UPDATE bahan SET nama = ?, harga = ?, stok = ? WHERE kode_bahan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(4, mod.getKode());
            st.setString(1, mod.getNama());
            st.setLong(2, mod.getHarga());
            st.setInt(3, mod.getStok());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(String kode) {
        PreparedStatement st = null;
        String sql = "DELETE FROM bahan WHERE kode_bahan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, kode);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelBahan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM bahan ORDER BY kode_bahan";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelBahan mod = new ModelBahan();
                mod.setKode(rs.getString("kode_bahan"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelBahan> getByKODE(String kode) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM bahan WHERE kode_bahan ILIKE ? ORDER BY kode_bahan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + kode + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelBahan mod = new ModelBahan();
                mod.setKode(rs.getString("kode_bahan"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelBahan> getByNama(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM bahan WHERE nama ILIKE ? ORDER BY kode_bahan";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelBahan mod = new ModelBahan();
                mod.setKode(rs.getString("kode_bahan"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelBahan getByKode(String kode) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM bahan WHERE kode_bahan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, kode);
            rs = st.executeQuery();
            ModelBahan mod = new ModelBahan();
            if (rs.next()) {
                mod.setKode(rs.getString("kode_bahan"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(mod);
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public String getNomer() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;

        String sql = "SELECT RIGHT (kode_bahan, 3) AS nomor "
                + "FROM bahan "
                + "WHERE kode_bahan LIKE 'BN%' "
                + "ORDER BY kode_bahan DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "BN" + String.format("%03d", nomor1);
            } else {
                urutan = "BN001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoBahan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

}
