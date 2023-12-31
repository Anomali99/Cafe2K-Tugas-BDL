/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DaoPetugas;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.ModelPegawai;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class MenuProfil extends javax.swing.JPanel {

    /**
     * Creates new form MenuPetugas
     */
    private JPanel pn;
    private ModelPegawai mod = new ModelPegawai();
    private ServisPetugas servis = new DaoPetugas();

    public MenuProfil() {
        initComponents();
        this.mod = MenuUtama.mod;
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTambah = new custom.JPanelCustom();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfTlp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        lbFoto = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfLevel = new javax.swing.JTextField();
        btnUbahPass = new javax.swing.JButton();
        btnUbahPP = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        pnTambah.setBackground(new java.awt.Color(255, 255, 255));
        pnTambah.setKananAtas(20);
        pnTambah.setKananBawah(20);
        pnTambah.setKiriAtas(20);
        pnTambah.setKiriBawah(20);

        jSeparator3.setBackground(new java.awt.Color(79, 42, 24));
        jSeparator3.setForeground(new java.awt.Color(79, 42, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(79, 42, 24));
        jLabel4.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(79, 42, 24));
        jLabel3.setText("Profil Petugas");

        btnBatal.setBackground(new java.awt.Color(0, 0, 200));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(0, 0, 200));
        btnBatal.setText("RESET");
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 42, 24));
        jLabel2.setText("ID Petugas");

        tfId.setEditable(false);
        tfId.setForeground(new java.awt.Color(79, 42, 24));
        tfId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        tfNama.setForeground(new java.awt.Color(79, 42, 24));
        tfNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        tfTlp.setForeground(new java.awt.Color(79, 42, 24));
        tfTlp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTlp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));
        tfTlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTlpKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(79, 42, 24));
        jLabel5.setText("Telephone");

        tfAlamat.setForeground(new java.awt.Color(79, 42, 24));
        tfAlamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(79, 42, 24));
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(79, 42, 24));
        jLabel7.setText("Email");

        tfEmail.setForeground(new java.awt.Color(79, 42, 24));
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(79, 42, 24));
        jLabel8.setText("Username");

        tfUser.setForeground(new java.awt.Color(79, 42, 24));
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 42, 24)));

        btnSimpan.setBackground(new java.awt.Color(0, 200, 0));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(0, 200, 0));
        btnSimpan.setText("SIMPAN PEMBARUAN");
        btnSimpan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSimpanMouseMoved(evt);
            }
        });
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpanMouseExited(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cafe2K.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(79, 42, 24));
        jLabel10.setText("Level");

        tfLevel.setEditable(false);
        tfLevel.setForeground(new java.awt.Color(79, 42, 24));
        tfLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLevel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        btnUbahPass.setBackground(new java.awt.Color(255, 153, 0));
        btnUbahPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUbahPass.setForeground(new java.awt.Color(255, 153, 0));
        btnUbahPass.setText("UBAH PASSWORD");
        btnUbahPass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnUbahPassMouseMoved(evt);
            }
        });
        btnUbahPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahPassMouseExited(evt);
            }
        });
        btnUbahPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPassActionPerformed(evt);
            }
        });

        btnUbahPP.setBackground(new java.awt.Color(166, 145, 138));
        btnUbahPP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUbahPP.setForeground(new java.awt.Color(166, 145, 138));
        btnUbahPP.setText("UBAH FOTO");
        btnUbahPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnUbahPPMouseMoved(evt);
            }
        });
        btnUbahPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahPPMouseExited(evt);
            }
        });
        btnUbahPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahPPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTambahLayout = new javax.swing.GroupLayout(pnTambah);
        pnTambah.setLayout(pnTambahLayout);
        pnTambahLayout.setHorizontalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(pnTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTambahLayout.createSequentialGroup()
                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTambahLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addGroup(pnTambahLayout.createSequentialGroup()
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(tfTlp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfId, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNama)
                                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addGroup(pnTambahLayout.createSequentialGroup()
                                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUbahPass)))
                                .addGap(30, 30, 30)
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUbahPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTambahLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        pnTambahLayout.setVerticalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnTambahLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTambahLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnTambahLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnTambahLayout.createSequentialGroup()
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnSimpan)
                            .addComponent(btnUbahPass))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(pnTambah, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseMoved
        btnBatal.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBatalMouseMoved

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        btnBatal.setForeground(new Color(0, 0, 200));
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        loadData();
        jLabel1.requestFocus();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseMoved
        btnSimpan.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSimpanMouseMoved

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        btnSimpan.setForeground(new Color(0, 200, 0));
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        mod.setId(tfId.getText());
        mod.setNama(tfNama.getText());
        mod.setAlamat(tfAlamat.getText());
        mod.setTlp(tfTlp.getText());
        mod.setEmail(tfEmail.getText());
        mod.setUsername(tfUser.getText());
        mod.setPass(null);
        servis.ubahData(mod);
        jLabel1.requestFocus();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tfTlpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTlpKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a) || tfTlp.getText().length() > 12)
            evt.consume();
    }//GEN-LAST:event_tfTlpKeyTyped

    private void btnUbahPassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahPassMouseMoved
        btnUbahPass.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnUbahPassMouseMoved

    private void btnUbahPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahPassMouseExited
        btnUbahPass.setForeground(new Color(255,153,0));
    }//GEN-LAST:event_btnUbahPassMouseExited

    private void btnUbahPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPassActionPerformed
        new UbahPassword(null,true).setVisible(true);
        this.mod = servis.getById(mod.getId());
        MenuUtama.mod = mod;
        jLabel1.requestFocus();
    }//GEN-LAST:event_btnUbahPassActionPerformed

    private void btnUbahPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahPPMouseMoved
        btnUbahPP.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnUbahPPMouseMoved

    private void btnUbahPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahPPMouseExited
        btnUbahPP.setForeground(new Color(166,145,138));
    }//GEN-LAST:event_btnUbahPPMouseExited

    private void btnUbahPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahPPActionPerformed
        new UbahPP(null,true).setVisible(true);
        this.mod = servis.getById(mod.getId());
        MenuUtama.mod = mod;
        if (mod.getFoto() != null) {
            ImageIcon imgIcon = new ImageIcon(mod.getFoto());
            double lbW = lbFoto.getWidth();
            double lbH = lbFoto.getHeight();
            double imgW = imgIcon.getIconWidth();
            double imgH = imgIcon.getIconHeight();
            double scaleX = (double) lbW / (double) imgW;
            double scaleY = (double) lbH / (double) imgH;
            double scale = Math.min(scaleX, scaleY);
            Image scaleImg = imgIcon.getImage().getScaledInstance((int) (scale * imgW), (int) (scale * imgH), Image.SCALE_SMOOTH);

            lbFoto.setIcon(new ImageIcon(scaleImg));
        }
        jLabel1.requestFocus();
    }//GEN-LAST:event_btnUbahPPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbahPP;
    private javax.swing.JButton btnUbahPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbFoto;
    private custom.JPanelCustom pnTambah;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTlp;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables


    private void loadData() {
        tfId.setText(mod.getId());
        tfNama.setText(mod.getNama());
        tfAlamat.setText(mod.getAlamat());
        tfEmail.setText(mod.getEmail());
        tfUser.setText(mod.getUsername());
        tfTlp.setText(mod.getTlp());
        tfLevel.setText(mod.getLevel());

        if (mod.getFoto() != null) {
            byte[] img = mod.getFoto();
            ImageIcon imgIcon = new ImageIcon(img);
            double lbW = 196;//lbFoto.getWidth();
            double lbH = 236;//lbFoto.getHeight();
            double imgW = imgIcon.getIconWidth();
            double imgH = imgIcon.getIconHeight();
            double scaleX = (double) lbW / (double) imgW;
            double scaleY = (double) lbH / (double) imgH;
            double scale = Math.min(scaleX, scaleY);
            Image scaleImg = imgIcon.getImage().getScaledInstance((int) (scale * imgW), (int) (scale * imgH), Image.SCALE_SMOOTH);

            lbFoto.setIcon(new ImageIcon(scaleImg));
        }
    }

    private boolean validData() {
        boolean valid = true;
        if (tfNama.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan nama terlebih dahulu");
        } else if (tfTlp.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan nomor telephone terlebih dahulu");
        } else if (tfAlamat.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan alamat terlebih dahulu");
        } else if (tfEmail.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan email terlebih dahulu");
        } else if (tfUser.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan username terlebih dahulu");
        } 
        return valid;
    }
}
