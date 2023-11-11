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
import model.ModelPegawai;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class DaoPetugas implements ServisPetugas {

    private Connection conn;

    public DaoPetugas() {
        this.conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelPegawai mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pegawai (id_pegawai, nama, alamat, telephone, email, level, username) VALUES (?,?,?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod.getId());
            st.setString(2, mod.getNama());
            st.setString(3, mod.getAlamat());
            st.setString(4, mod.getTlp());
            st.setString(5, mod.getEmail());
            st.setString(6, mod.getLevel());
            st.setString(7, mod.getUsername());
            st.executeUpdate();

            ubahPassword(mod);
            if (mod.getFoto() != null) {
                ubahFoto(mod);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahData(ModelPegawai mod) {
        PreparedStatement st = null;
        String sql = "UPDATE pegawai SET nama = ?, alamat = ?, telephone = ?, email = ?, level = ?, username = ? WHERE id_pegawai = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(7, mod.getId());
            st.setString(1, mod.getNama());
            st.setString(2, mod.getAlamat());
            st.setString(3, mod.getTlp());
            st.setString(4, mod.getEmail());
            st.setString(5, mod.getLevel());
            st.setString(6, mod.getUsername());
            st.executeUpdate();
            if (!mod.getPass().isEmpty()) {
                ubahPassword(mod);
            }
            if (mod.getFoto() != null) {
                ubahFoto(mod);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(String id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pegawai WHERE id_pegawai = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahPassword(ModelPegawai mod) {
        PreparedStatement st = null;
        String sql = "UPDATE pegawai SET password = ? WHERE id_pegawai = ?";
        try {
            st = conn.prepareStatement(sql);

            st.setString(1, Encrypt.getmd5java(mod.getPass()));
            st.setString(2, mod.getId());

            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void ubahFoto(ModelPegawai mod) {
        PreparedStatement st = null;
        String sql = "UPDATE pegawai SET foto = ? WHERE id_pegawai = ?";
        try {
            st = conn.prepareStatement(sql);

            st.setBytes(1, mod.getFoto());
            st.setString(2, mod.getId());

            st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPegawai> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pegawai ORDER BY id_pegawai";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPegawai mod = new ModelPegawai();
                mod.setId(rs.getString("id_pegawai"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                mod.setEmail(rs.getString("email"));
                mod.setLevel(rs.getString("level"));
                mod.setUsername(rs.getString("username"));
                mod.setPass(rs.getString("password"));
                mod.setFoto(rs.getBytes("foto"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPegawai> getByID(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pegawai WHERE id_pegawai ILIKE ? ORDER BY id_pegawai";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%"+id+"%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPegawai mod = new ModelPegawai();
                mod.setId(rs.getString("id_pegawai"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                mod.setEmail(rs.getString("email"));
                mod.setLevel(rs.getString("level"));
                mod.setUsername(rs.getString("username"));
                mod.setPass(rs.getString("password"));
                mod.setFoto(rs.getBytes("foto"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPegawai> getByNama(String nama) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pegawai WHERE nama ILIKE ? ORDER BY id_pegawai";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%"+nama+"%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPegawai mod = new ModelPegawai();
                mod.setId(rs.getString("id_pegawai"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                mod.setEmail(rs.getString("email"));
                mod.setLevel(rs.getString("level"));
                mod.setUsername(rs.getString("username"));
                mod.setPass(rs.getString("password"));
                mod.setFoto(rs.getBytes("foto"));
                list.add(mod);
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<ModelPegawai> getByAlamat(String alamat) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pegawai WHERE alamat ILIKE ? ORDER BY id_pegawai";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, "%"+alamat+"%");
            rs = st.executeQuery();
            while (rs.next()) {
                ModelPegawai mod = new ModelPegawai();
                mod.setId(rs.getString("id_pegawai"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                mod.setEmail(rs.getString("email"));
                mod.setLevel(rs.getString("level"));
                mod.setUsername(rs.getString("username"));
                mod.setPass(rs.getString("password"));
                mod.setFoto(rs.getBytes("foto"));
                list.add(mod);
            } 
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ModelPegawai getById(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM pegawai WHERE id_pegawai = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            ModelPegawai mod = new ModelPegawai();
            if (rs.next()) {
                mod.setId(rs.getString("id_pegawai"));
                mod.setNama(rs.getString("nama"));
                mod.setAlamat(rs.getString("alamat"));
                mod.setTlp(rs.getString("telephone"));
                mod.setEmail(rs.getString("email"));
                mod.setLevel(rs.getString("level"));
                mod.setUsername(rs.getString("username"));
                mod.setPass(rs.getString("password"));
                mod.setFoto(rs.getBytes("foto"));
            }
            return mod;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public String getNomer() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;

        String sql = "SELECT RIGHT (id_pegawai, 3) AS nomor "
                + "FROM pegawai "
                + "WHERE id_pegawai LIKE 'PT%' "
                + "ORDER BY id_pegawai DESC LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "PT" + String.format("%03d", nomor1);
            } else {
                urutan = "PT001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DaoPetugas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return urutan;
    }

}
