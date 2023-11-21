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
public class TambahPetugas extends javax.swing.JPanel {

    /**
     * Creates new form MenuPetugas
     */
    private JPanel pn;
    private ModelPegawai mod = new ModelPegawai();
    private ServisPetugas servis = new DaoPetugas();
    
    public TambahPetugas(JPanel pn) {
        initComponents();
        this.pn = pn;
        pass.setEchoChar('*');
        hide.setVisible(false);
        unhide.setVisible(true);
        tfId.setText(servis.getNomer());
    }
    
    public TambahPetugas(JPanel pn, ModelPegawai mod) {
        initComponents();
        this.pn = pn;
        this.mod = mod;
        pass.setVisible(false);
        btnTambah.setVisible(false);
        tfFoto.setVisible(false);
        jLabel9.setVisible(false);
        tfId.setEditable(false);
        tfNama.setEditable(false);
        tfAlamat.setEditable(false);
        tfEmail.setEditable(false);
        tfUser.setEditable(false);
        tfTlp.setEditable(false);
        show.setVisible(false);
        jLabel3.setText("Perbarui Data Petugas");
        
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
        btnTambah = new javax.swing.JButton();
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
        jLabel9 = new javax.swing.JLabel();
        lbFoto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxLevel = new javax.swing.JComboBox<>();
        tfFoto = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        show = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        unhide = new javax.swing.JLabel();

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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/petugas1.png"))); // NOI18N
        jLabel3.setText("Tambah Data Petugas");

        btnBatal.setBackground(new java.awt.Color(0, 0, 200));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(0, 0, 200));
        btnBatal.setText("BATAL");
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(79, 42, 24));
        jLabel9.setText("Password");

        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 42, 24)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(79, 42, 24));
        jLabel11.setText("Level");

        cbxLevel.setForeground(new java.awt.Color(79, 42, 24));
        cbxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Level--", "Admin", "Kasir", "Koki", "Gudang" }));
        cbxLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 42, 24)));

        tfFoto.setEditable(false);
        tfFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        btnSimpan.setBackground(new java.awt.Color(0, 200, 0));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(0, 200, 0));
        btnSimpan.setText("SIMPAN");
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

        pass.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(79, 42, 24));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unhide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        show.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        unhide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide.png"))); // NOI18N
        unhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unhideMouseClicked(evt);
            }
        });
        show.add(unhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

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
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfTlp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfId, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxLevel, 0, 157, Short.MAX_VALUE))
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
                                                    .addComponent(jLabel9)
                                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSimpan)))
                                .addGap(30, 30, 30)
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addComponent(tfFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnTambahLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
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
                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTambahLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFoto)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTambahLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnTambahLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnSimpan))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
        back();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTambahMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseMoved
        btnTambah.setForeground(Color.WHITE);
        btnTambah.setIcon(new ImageIcon(getClass().getResource("/img/tambah.png")));
    }//GEN-LAST:event_btnTambahMouseMoved

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setForeground(new Color(79, 42, 24));
        btnTambah.setIcon(new ImageIcon(getClass().getResource("/img/tambah1.png")));
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fi = file.getSelectedFile();
            String path = fi.getAbsolutePath();
            tfFoto.setText(path);
            try {
                byte[] img = Files.readAllBytes(fi.toPath());
                mod.setFoto(img);
                ImageIcon imgIcon = new ImageIcon(img);
                double lbW = lbFoto.getWidth();
                double lbH = lbFoto.getHeight();
                double imgW = imgIcon.getIconWidth();
                double imgH = imgIcon.getIconHeight();
                double scaleX = (double) lbW / (double) imgW;
                double scaleY = (double) lbH / (double) imgH;
                double scale = Math.min(scaleX, scaleY);
                Image scaleImg = imgIcon.getImage().getScaledInstance((int) (scale * imgW), (int) (scale * imgH), Image.SCALE_SMOOTH);
                
                lbFoto.setIcon(new ImageIcon(scaleImg));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        jLabel1.requestFocus();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseMoved
        btnSimpan.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSimpanMouseMoved

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        btnSimpan.setForeground(new Color(0, 200, 0));
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (validData()) {
            if (jLabel3.getText().equalsIgnoreCase("Perbarui Data Petugas")) {
                mod.setLevel(cbxLevel.getSelectedItem().toString());
                mod.setPass(null);
                servis.ubahData(mod);
                back();
            } else {
                if (cbxLevel.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Masukkan level petugas terlebih dahulu");
                } else {
                    mod.setId(tfId.getText());
                    mod.setNama(tfNama.getText());
                    mod.setAlamat(tfAlamat.getText());
                    mod.setTlp(tfTlp.getText());
                    mod.setEmail(tfEmail.getText());
                    mod.setUsername(tfUser.getText());
                    mod.setPass(pass.getText());
                    mod.setLevel(cbxLevel.getSelectedItem().toString());
                    servis.tambahData(mod);
                    back();
                }
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        pass.setEchoChar('*');
        hide.setVisible(false);
        unhide.setVisible(true);
    }//GEN-LAST:event_hideMouseClicked

    private void unhideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unhideMouseClicked
        pass.setEchoChar((char) 0);
        hide.setVisible(true);
        unhide.setVisible(false);
    }//GEN-LAST:event_unhideMouseClicked

    private void tfTlpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTlpKeyTyped
        char a = evt.getKeyChar();
        if(!Character.isDigit(a)||tfTlp.getText().length()>12)
            evt.consume();
    }//GEN-LAST:event_tfTlpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbxLevel;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JPasswordField pass;
    private custom.JPanelCustom pnTambah;
    private javax.swing.JPanel show;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFoto;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTlp;
    private javax.swing.JTextField tfUser;
    private javax.swing.JLabel unhide;
    // End of variables declaration//GEN-END:variables

    private void back() {
        MenuUtama.setAktif(true);
        pn.removeAll();
        pn.add(new MenuPetugas(pn));
        pn.repaint();
        pn.revalidate();
    }
    
    private void loadData() {
        tfId.setText(mod.getId());
        tfNama.setText(mod.getNama());
        tfAlamat.setText(mod.getAlamat());
        tfEmail.setText(mod.getEmail());
        tfUser.setText(mod.getUsername());
        tfTlp.setText(mod.getTlp());
        cbxLevel.setSelectedItem(mod.getLevel());
        
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
        } else if (pass.getText().equals("")) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Masukkan password terlebih dahulu");
        }
        return valid;
    }
}
