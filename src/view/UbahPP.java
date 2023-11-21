/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
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
import javax.swing.filechooser.FileNameExtensionFilter;
import model.ModelPegawai;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class UbahPP extends javax.swing.JDialog {

    /**
     * Creates new form TambahPelanggan
     */
    int xx, xy;
    private ServisPetugas servis = new DaoPetugas();
    private ModelPegawai mod = new ModelPegawai();

    public UbahPP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mod = MenuUtama.mod;
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCustom1 = new custom.JPanelCustom();
        jLabel1 = new javax.swing.JLabel();
        jPanelCustom2 = new custom.JPanelCustom();
        btnSimpan = new custom.JPanelCustom();
        jLabel2 = new javax.swing.JLabel();
        btnBatal = new custom.JPanelCustom();
        jLabel7 = new javax.swing.JLabel();
        tfFoto = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        lbFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanelCustom1.setBackground(new java.awt.Color(79, 42, 24));
        jPanelCustom1.setKananAtas(20);
        jPanelCustom1.setKananBawah(20);
        jPanelCustom1.setKiriAtas(20);
        jPanelCustom1.setKiriBawah(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ubah Foto Profil");

        jPanelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCustom2.setKananAtas(20);
        jPanelCustom2.setKananBawah(20);
        jPanelCustom2.setKiriAtas(20);
        jPanelCustom2.setKiriBawah(20);

        btnSimpan.setBackground(new java.awt.Color(0, 200, 0));
        btnSimpan.setKananAtas(20);
        btnSimpan.setKananBawah(20);
        btnSimpan.setKiriAtas(20);
        btnSimpan.setKiriBawah(20);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIMPAN");

        javax.swing.GroupLayout btnSimpanLayout = new javax.swing.GroupLayout(btnSimpan);
        btnSimpan.setLayout(btnSimpanLayout);
        btnSimpanLayout.setHorizontalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSimpanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnSimpanLayout.setVerticalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSimpanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnBatal.setBackground(new java.awt.Color(200, 0, 0));
        btnBatal.setKananAtas(20);
        btnBatal.setKananBawah(20);
        btnBatal.setKiriAtas(20);
        btnBatal.setKiriBawah(20);
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BATAL");

        javax.swing.GroupLayout btnBatalLayout = new javax.swing.GroupLayout(btnBatal);
        btnBatal.setLayout(btnBatalLayout);
        btnBatalLayout.setHorizontalGroup(
            btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBatalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnBatalLayout.setVerticalGroup(
            btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBatalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tfFoto.setEditable(false);
        tfFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(79, 42, 24)));

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

        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 42, 24)));

        javax.swing.GroupLayout jPanelCustom2Layout = new javax.swing.GroupLayout(jPanelCustom2);
        jPanelCustom2.setLayout(jPanelCustom2Layout);
        jPanelCustom2Layout.setHorizontalGroup(
            jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustom2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCustom2Layout.createSequentialGroup()
                        .addComponent(tfFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanelCustom2Layout.setVerticalGroup(
            jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustom2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfFoto)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCustom1Layout = new javax.swing.GroupLayout(jPanelCustom1);
        jPanelCustom1.setLayout(jPanelCustom1Layout);
        jPanelCustom1Layout.setHorizontalGroup(
            jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustom1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelCustom1Layout.setVerticalGroup(
            jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustom1Layout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(jPanelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        dispose();
    }//GEN-LAST:event_btnBatalMouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        if (validData()) {
            servis.ubahFoto(mod);
            dispose();
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UbahPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UbahPP dialog = new UbahPP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.JPanelCustom btnBatal;
    private custom.JPanelCustom btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private custom.JPanelCustom jPanelCustom1;
    private custom.JPanelCustom jPanelCustom2;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JTextField tfFoto;
    // End of variables declaration//GEN-END:variables

    private boolean validData() {
        boolean valid = true;
        if (tfFoto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih foto terlebih dahulu");
            valid = false;
        }
        return valid;
    }
}
