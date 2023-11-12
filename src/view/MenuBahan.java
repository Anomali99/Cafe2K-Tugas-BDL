/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DaoBahan;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import servis.ServisBahan;
import tabel.TabelBahan;

/**
 *
 * @author fatiq
 */
public class MenuBahan extends javax.swing.JPanel {

    /**
     * Creates new form MenuPetugas
     */
    private final TabelBahan tbl = new TabelBahan();
    private ServisBahan servis = new DaoBahan();

    public MenuBahan() {
        initComponents();
        tblConten.setModel(tbl);
        resetData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new custom.JPanelCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConten = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        tf_cari = new javax.swing.JTextField();
        cbx_cari = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setKananAtas(20);
        pnMain.setKiriAtas(20);

        tblConten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblConten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConten);

        btnTambah.setBackground(new java.awt.Color(79, 42, 24));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(79, 42, 24));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambah1.png"))); // NOI18N
        btnTambah.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTambahMouseMoved(evt);
            }
        });
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(200, 0, 0));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(200, 0, 0));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus1.png"))); // NOI18N
        btnHapus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnHapusMouseMoved(evt);
            }
        });
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(0, 0, 200));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(0, 0, 200));
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal1.png"))); // NOI18N
        btnBatal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBatalMouseMoved(evt);
            }
        });
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatalMouseExited(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(79, 42, 24));
        jSeparator1.setForeground(new java.awt.Color(79, 42, 24));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 42, 24));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bahan1.png"))); // NOI18N
        jLabel1.setText("Data Bahan");

        btn_cari.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cari.png"))); // NOI18N
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        tf_cari.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_cari.setForeground(new java.awt.Color(204, 204, 204));
        tf_cari.setText("Cari");
        tf_cari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        tf_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cariFocusLost(evt);
            }
        });

        cbx_cari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbx_cari.setForeground(new java.awt.Color(204, 204, 204));
        cbx_cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KODE", "NAMA" }));
        cbx_cari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbx_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBatal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(pnMain, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setForeground(new Color(79, 42, 24));
        Icon tambah = new ImageIcon(getClass().getResource("/img/tambah1.png"));
        Icon ubah = new ImageIcon(getClass().getResource("/img/edit1.png"));
        if (!btnBatal.isVisible())
            btnTambah.setIcon(tambah);
        else
            btnTambah.setIcon(ubah);
    }//GEN-LAST:event_btnTambahMouseExited

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String sc = tf_cari.getText();
        List list = new ArrayList();
        switch (cbx_cari.getSelectedIndex()) {
            case 0:
                list = servis.getByKODE(sc);
                break;
            case 1:
                list = servis.getByNama(sc);
                break;
        }
        tbl.setData(list);
    }//GEN-LAST:event_btn_cariActionPerformed

    private void tf_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusGained
        if (tf_cari.getText().equals("Cari") || tf_cari.getText().equalsIgnoreCase(""))
            tf_cari.setText("");
    }//GEN-LAST:event_tf_cariFocusGained

    private void tf_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusLost
        if (tf_cari.getText().equals("Cari") || tf_cari.getText().equalsIgnoreCase(""))
            tf_cari.setText("Cari");
    }//GEN-LAST:event_tf_cariFocusLost

    private void btnTambahMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseMoved
        btnTambah.setForeground(Color.WHITE);
        Icon tambah = new ImageIcon(getClass().getResource("/img/tambah.png"));
        Icon ubah = new ImageIcon(getClass().getResource("/img/edit.png"));
        if (!btnBatal.isVisible())
            btnTambah.setIcon(tambah);
        else
            btnTambah.setIcon(ubah);
    }//GEN-LAST:event_btnTambahMouseMoved

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setForeground(new Color(200, 0, 0));
        btnHapus.setIcon(new ImageIcon(getClass().getResource("/img/hapus1.png")));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        btnBatal.setForeground(new Color(0, 0, 200));
        btnBatal.setIcon(new ImageIcon(getClass().getResource("/img/batal1.png")));
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnHapusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseMoved
        btnHapus.setForeground(Color.WHITE);
        btnHapus.setIcon(new ImageIcon(getClass().getResource("/img/hapus.png")));
    }//GEN-LAST:event_btnHapusMouseMoved

    private void btnBatalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseMoved
        btnBatal.setForeground(Color.WHITE);
        btnBatal.setIcon(new ImageIcon(getClass().getResource("/img/batal.png")));
    }//GEN-LAST:event_btnBatalMouseMoved

    private void tblContenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContenMouseClicked
        btnBatal.setVisible(true);
        btnHapus.setVisible(true);
        btnTambah.setIcon(new ImageIcon(getClass().getResource("/img/edit1.png")));
    }//GEN-LAST:event_tblContenMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        resetData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (!btnHapus.isVisible()) {
            new TambahBahan(null, true).setVisible(true);
        } else {
            String s = (String) tblConten.getValueAt(tblConten.getSelectedRow(), 1);
            new TambahBahan(null, true, s).setVisible(true);
        }
        resetData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String s = (String) tblConten.getValueAt(tblConten.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/hapus1.png"));
        if (JOptionPane.showConfirmDialog(null, "Menghapus pelanggan dengan ID " + s, "Apakah anda yakin", 0, 0, icon) == 0) {
            servis.hapusData(s);
        }
        resetData();
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btn_cari;
    private javax.swing.JComboBox<String> cbx_cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private custom.JPanelCustom pnMain;
    private javax.swing.JTable tblConten;
    private javax.swing.JTextField tf_cari;
    // End of variables declaration//GEN-END:variables

    private void resetData() {
        tbl.setData(servis.ambilData());
        btnBatal.setVisible(false);
        btnHapus.setVisible(false);
        btnTambah.setIcon(new ImageIcon(getClass().getResource("/img/tambah1.png")));
        btnTambah.setVisible(true);
        jLabel1.requestFocus();
    }
}
