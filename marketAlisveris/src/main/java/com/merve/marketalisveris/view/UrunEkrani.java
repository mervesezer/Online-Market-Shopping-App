package com.merve.marketalisveris.view;

import com.merve.marketalisveris.model.Adres;
import com.merve.marketalisveris.model.Kategori;
import com.merve.marketalisveris.model.Kullanici;
import com.merve.marketalisveris.model.OdemeTableModel;
import com.merve.marketalisveris.model.Urun;
import com.merve.marketalisveris.controller.AdresController;
import com.merve.marketalisveris.controller.KategoriController;
import com.merve.marketalisveris.controller.UrunController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class UrunEkrani extends javax.swing.JFrame {
    
    private final KategoriController kategoriController = new KategoriController();
    private final UrunController urunController = new UrunController();
    private final Kullanici kullanici;
    
    public UrunEkrani(Kullanici kullanici) {
        initComponents();
        this.setLocationRelativeTo(null);
        createTab();
        createTable();
        this.kullanici = kullanici;
    }

    // bütün kategorileri gezerek tab ismini oluşturuyor
    private void createTab() {
        List<Kategori> kategoriler = kategoriController.getAll();
        for (Kategori kategori : kategoriler) {
            jTabbedPane1.addTab(kategori.getKategoriIsim(), createTabPanel(kategori.getUrunler(),
                    kategori.getKategoriIsim()));
        }
    }

    // Table ı oluşturur gerekli methodları çağırarak
    private void createTable() {
        OdemeTableModel model = new OdemeTableModel();
        productTable.setModel(model);
    }

    //seçtiğim ürünü tabloya ekler
    private void tableAddProduct(Urun urun) {
        OdemeTableModel model = (OdemeTableModel) productTable.getModel();
        model.addProduct(urun);
    }

    //Ürün panelini oluşturur
    private JScrollPane createTabPanel(List<Urun> urunler, String tabName) {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(2, 3);
        panel.setLayout(layout);
        // bütün ürünleri gezer ve her ürünü button olarak panele ekler
        for (Urun urun : urunler) {
            if (urun.getStokDurum().equals("var")) {
                ImageIcon icon = new ImageIcon(this.getClass().getResource("/images/" + tabName + ".png"));
                JButton button = new JButton(urun.getUrunIsim(), icon);
                button.addActionListener(new ActionListener() {
                    @Override
                    //Butona basılınca Tabloya O ürünü Ekleyen Action methodu
                    public void actionPerformed(ActionEvent evt) {
                        JButton button = (JButton) evt.getSource();
                        Urun urun = urunController.getByName(button.getText());
                        tableAddProduct(urun);
                        OdemeTableModel model = (OdemeTableModel) productTable.getModel();
                        lbl_toplamTutar.setText(String.valueOf(model.totalFee()));
                    }
                });
                panel.add(button);
                
            }
            
        }
        JScrollPane pane = new JScrollPane(panel);
        pane.createHorizontalScrollBar();
        return pane;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_urunSil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_toplamTutar = new javax.swing.JLabel();
        btn_ode = new javax.swing.JButton();
        btn_kullaniciAyarlari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));
        getContentPane().add(jTabbedPane1);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(32767, 250));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 250));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productTable);

        getContentPane().add(jScrollPane1);

        btn_urunSil.setText("ürünü sil");
        btn_urunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunSilActionPerformed(evt);
            }
        });
        jPanel1.add(btn_urunSil);

        jLabel1.setText("Toplam Tutar:");
        jPanel1.add(jLabel1);

        lbl_toplamTutar.setText("0.0");
        jPanel1.add(lbl_toplamTutar);

        btn_ode.setText("Öde");
        btn_ode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_odeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ode);

        btn_kullaniciAyarlari.setText("Kullanıcı Ayarları");
        btn_kullaniciAyarlari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciAyarlariActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kullaniciAyarlari);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ürün sil butonuna bastıktan sonra tablodan o ürünü silen method
    private void btn_urunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunSilActionPerformed
        if (productTable.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ürün seçin");
        } else {
            String no = String.valueOf(productTable.getValueAt(productTable.getSelectedRow(), 0));
            OdemeTableModel model = (OdemeTableModel) productTable.getModel();
            model.removeProduct(Integer.parseInt(no));
            lbl_toplamTutar.setText(String.valueOf(model.totalFee()));            
        }
    }//GEN-LAST:event_btn_urunSilActionPerformed
    // öde butonuna bastıktan sonra eğer adres yoksa gerekli hatayı verir ve eğer adres varsa ödemek ekranına gider
    private void btn_odeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_odeActionPerformed
        OdemeTableModel model = (OdemeTableModel) productTable.getModel();
        if (model.totalFee() != 0) {
            List<Adres> adresler = new AdresController().getAll();
            if (adresler.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Kayıtlı adresiniz bulunmamaktadır adres ekleme sayfasına yönlendiriliyorsunuz");
                new AdresEkle(kullanici).setVisible(true);
            } else {
                new OdemeEkran(model.totalDiscount(), model.totalFee(), kullanici).setVisible(true);
                model.clearProduct();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ürün ekleyin");
        }
    }//GEN-LAST:event_btn_odeActionPerformed
    // kullanıcı Ayarları butonuna bastıktan sonra o Frame e gider
    private void btn_kullaniciAyarlariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciAyarlariActionPerformed
        new KullaniciAyarlar(kullanici).setVisible(true);
    }//GEN-LAST:event_btn_kullaniciAyarlariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kullaniciAyarlari;
    private javax.swing.JButton btn_ode;
    private javax.swing.JButton btn_urunSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_toplamTutar;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
