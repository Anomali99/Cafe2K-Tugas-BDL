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
import model.ModelMenu;
import servis.ServisBahan;
import servis.ServisMenu;

/**
 *
 * @author fatiq
 */
public class DaoMenu implements ServisMenu {

    private Connection conn;
    private ServisBahan servis = new DaoBahan();

    public DaoMenu() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelMenu mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO menu (kode_menu, nama, harga, stok) VALUES (?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getKode());
            st.setString(2, mod.getNama());
            st.setLong(3, mod.getHarga());
            st.setInt(4, mod.getStok());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (mod.getBahan() != null) {
            tambahBahan(mod);
        }
    }

    @Override
    public void ubahData(ModelMenu mod) {
        PreparedStatement st = null;
        String sql = "UPDATE menu SET nama = ?, harga = ?, stok = ? WHERE kode_menu = ?; "
                + "DELETE FROM detail_bahan WHERE kode_menu = ?;";
        try {
            st = conn.prepareStatement(sql);
            st.setString(5, mod.getKode());
            st.setString(1, mod.getNama());
            st.setLong(2, mod.getHarga());
            st.setInt(3, mod.getStok());
            st.setString(4, mod.getKode());
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (mod.getBahan() != null) {
            tambahBahan(mod);
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM detail_bahan WHERE kode_menu = ?; "
                + "DELETE FROM menu WHERE kode_menu = ?; ";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
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
    public List<ModelMenu> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM menu ORDER BY kode_menu";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMenu mod = new ModelMenu();
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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
    public List<ModelMenu> getTerlaris() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT m.*\n"
                + "FROM menu m\n"
                + "JOIN (\n"
                + "    SELECT kode_menu, SUM(jumlah) AS jml\n"
                + "    FROM detail_pembelian\n"
                + "    GROUP BY kode_menu\n"
                + "    ORDER BY jml DESC\n"
                + "    LIMIT 6\n"
                + ") AS baru ON m.kode_menu = baru.kode_menu;";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMenu mod = new ModelMenu();
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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
    public List<ModelMenu> getByKODE(String kode) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM menu WHERE kode_menu ILIKE ? ORDER BY kode_menu";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + kode + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMenu mod = new ModelMenu();
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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
    public List<ModelMenu> getByNama(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM menu WHERE nama ILIKE ? ORDER BY kode_menu";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + nama + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMenu mod = new ModelMenu();
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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
    public List<ModelMenu> getByBahan(String bahan) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM menu WHERE kode_menu =ANY("
                + "SELECT db.kode_menu FROM detail_bahan db RIGHT JOIN bahan b "
                + "ON b.kode_bahan = db.kode_bahan WHERE b.nama ILIKE ?"
                + ") ORDER BY kode_menu";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%" + bahan + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelMenu mod = new ModelMenu();
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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
    public ModelMenu getByKode(String kode) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM menu WHERE kode_menu = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, kode);
            rs = st.executeQuery();
            ModelMenu mod = new ModelMenu();
            if (rs.next()) {
                mod.setKode(rs.getString("kode_menu"));
                mod.setNama(rs.getString("nama"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                list.add(setDetail(mod));
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

        String sql = "SELECT RIGHT (kode_menu, 3) AS nomor "
                + "FROM menu "
                + "WHERE kode_menu LIKE 'MN%' "
                + "ORDER BY kode_menu DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "MN" + String.format("%03d", nomor1);
            } else {
                urutan = "MN001";
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

    private void tambahBahan(ModelMenu mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_bahan (kode_menu, kode_bahan, jumlah_menu, jumlah_bahan) VALUES (?,?,?,?)";
        try {
            for (int i = 0; i < mod.getBahan().size(); i++) {
                st = conn.prepareStatement(sql);
                st.setString(1, mod.getKode());
                st.setString(2, mod.getBahan().get(i).getKode());
                st.setLong(3, mod.getJmlMenu());
                st.setInt(4, mod.getJmlBahan().get(i));
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoMenu.class.getName()).log(Level.SEVERE, null, ex);
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

    private ModelMenu setDetail(ModelMenu mod) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        List list1 = new ArrayList();
        String sql = "SELECT * FROM detail_bahan WHERE kode_menu = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getKode());
            rs = st.executeQuery();
            while (rs.next()) {
                mod.setJmlMenu(rs.getInt("jumlah_menu"));
                list1.add(rs.getInt("jumlah_bahan"));
                list.add(servis.getByKode(rs.getString("kode_bahan")));
            }
            mod.setBahan(list);
            mod.setJmlBahan(list1);
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

}
