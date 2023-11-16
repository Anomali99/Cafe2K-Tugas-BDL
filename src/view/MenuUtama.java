/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import custom.MenuCustom;
import dao.DaoPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.ModelPegawai;
import servis.ServisPetugas;

/**
 *
 * @author fatiq
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public static boolean aktif = true;
    public static ModelPegawai mod = new ModelPegawai();
    private ServisPetugas servis = new DaoPetugas();

    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ModelPegawai mod = servis.getById("PT001");
        this.mod = mod;
        setEvent();
        btn_dasbor.tekan();
    }
    public MenuUtama(ModelPegawai mod) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.mod = mod;
        setEvent();
        btn_dasbor.tekan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_menu = new custom.MenuCustom();
        btn_dasbor = new custom.MenuCustom();
        btn_bahan = new custom.MenuCustom();
        btn_pembelian = new custom.MenuCustom();
        btn_supply = new custom.MenuCustom();
        btn_supplier = new custom.MenuCustom();
        btn_pelanggan = new custom.MenuCustom();
        btn_petugas = new custom.MenuCustom();
        btn_laporan = new custom.MenuCustom();
        btn_memasak = new custom.MenuCustom();
        jPanelGradient1 = new custom.JPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pn_main = new custom.JPanelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe2K");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/iconCafe2K.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_menu.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_menu.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btn_menu.setaSelect(new java.awt.Color(79, 42, 24));

        btn_dasbor.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_dasbor.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monitor.png"))); // NOI18N
        btn_dasbor.setaLebel("Dasbord");
        btn_dasbor.setaSelect(new java.awt.Color(79, 42, 24));

        btn_bahan.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_bahan.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bahan.png"))); // NOI18N
        btn_bahan.setaLebel("Bahan");
        btn_bahan.setaSelect(new java.awt.Color(79, 42, 24));

        btn_pembelian.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_pembelian.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembelian.png"))); // NOI18N
        btn_pembelian.setaLebel("Pembelian");
        btn_pembelian.setaSelect(new java.awt.Color(79, 42, 24));

        btn_supply.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_supply.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/supply.png"))); // NOI18N
        btn_supply.setaLebel("Supply");
        btn_supply.setaSelect(new java.awt.Color(79, 42, 24));

        btn_supplier.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_supplier.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/supplier.png"))); // NOI18N
        btn_supplier.setaLebel("Supplier");
        btn_supplier.setaSelect(new java.awt.Color(79, 42, 24));

        btn_pelanggan.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_pelanggan.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        btn_pelanggan.setaLebel("Pelanggan");
        btn_pelanggan.setaSelect(new java.awt.Color(79, 42, 24));

        btn_petugas.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_petugas.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/petugas.png"))); // NOI18N
        btn_petugas.setaLebel("Petugas");
        btn_petugas.setaSelect(new java.awt.Color(79, 42, 24));

        btn_laporan.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_laporan.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporan.png"))); // NOI18N
        btn_laporan.setaLebel("Laporan");
        btn_laporan.setaSelect(new java.awt.Color(79, 42, 24));

        btn_memasak.setaBacground3(new java.awt.Color(166, 145, 138));
        btn_memasak.setaIcon(new javax.swing.ImageIcon(getClass().getResource("/img/masak.png"))); // NOI18N
        btn_memasak.setaLebel("Memasak");
        btn_memasak.setaSelect(new java.awt.Color(79, 42, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dasbor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_memasak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_dasbor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_supply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_memasak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanelGradient1.setCEnd(new java.awt.Color(79, 42, 24));
        jPanelGradient1.setCStart(new java.awt.Color(166, 145, 138));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cafe2K.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(864, Short.MAX_VALUE))
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelGradient1, java.awt.BorderLayout.PAGE_START);

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setKananAtas(20);
        pn_main.setKiriAtas(20);
        pn_main.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.MenuCustom btn_bahan;
    private custom.MenuCustom btn_dasbor;
    private custom.MenuCustom btn_laporan;
    private custom.MenuCustom btn_memasak;
    private custom.MenuCustom btn_menu;
    private custom.MenuCustom btn_pelanggan;
    private custom.MenuCustom btn_pembelian;
    private custom.MenuCustom btn_petugas;
    private custom.MenuCustom btn_supplier;
    private custom.MenuCustom btn_supply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private custom.JPanelGradient jPanelGradient1;
    private custom.JPanelCustom pn_main;
    // End of variables declaration//GEN-END:variables

    public static void setAktif(boolean bol) {
        MenuUtama.aktif = bol;
        MenuCustom.setAktif(bol);
    }

    private void setEvent() {
        btn_dasbor.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuDasbor());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_menu.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuMenu());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_bahan.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuBahan());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_pembelian.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuPembelian(pn_main));
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_supply.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
//                pn_main.add(new MenuPetugas());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_supplier.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuSupplier());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_pelanggan.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_petugas.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuPelanggan());
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_petugas.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_memasak.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
                pn_main.add(new MenuPetugas(pn_main));
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_memasak.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_petugas.reset();
                btn_laporan.reset();
                
                pn_main.removeAll();
//                pn_main.add(new MenuPetugas(pn_main));
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
        btn_laporan.setAct(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_dasbor.reset();
                btn_menu.reset();
                btn_bahan.reset();
                btn_pembelian.reset();
                btn_supply.reset();
                btn_petugas.reset();
                btn_supplier.reset();
                btn_pelanggan.reset();
                btn_memasak.reset();
                
                pn_main.removeAll();
//                pn_main.add(new MenuPetugas(pn_main));
                pn_main.repaint();
                pn_main.revalidate();
            }
        });
    }
}
