package com.merve.marketalisveris.view;

import com.merve.marketalisveris.model.Adres;
import com.merve.marketalisveris.model.Kullanici;
import com.merve.marketalisveris.controller.AdresController;
import com.merve.marketalisveris.controller.KullaniciController;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

public class AdresAyarlar extends javax.swing.JFrame {

    private AdresController adresController = new AdresController();

    private Kullanici kullanici;

    public AdresAyarlar(Kullanici kullanici) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.kullanici = kullanici;
        loadAddresses();
    }
   // bütün adresleri foreach ile gezerek adres başlığını item olarak combo box a ekler
    private void loadAddresses() {
        cmb_adresler.removeAllItems();
        kullanici = new KullaniciController().get(kullanici.getKullaniciId());
        List<Adres> adresler = kullanici.getAdresler();
        for (Adres adres : adresler) {
            cmb_adresler.addItem(adres.getAdresBaslik());
        }
    }
    // seçilen adresi alır
    private Adres getAdres(String name) {
        Adres adres = adresController.getByName(name);
        return adres;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb_adresler = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_yeniAdres = new javax.swing.JButton();
        btn_adresDetaylari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adresler");

        btn_delete.setText("Sil");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_yeniAdres.setText("Yeni Adres Ekle");
        btn_yeniAdres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeniAdresActionPerformed(evt);
            }
        });

        btn_adresDetaylari.setText("Adres Detayları");
        btn_adresDetaylari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adresDetaylariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cmb_adresler, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_yeniAdres)
                    .addComponent(btn_adresDetaylari)
                    .addComponent(btn_delete))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(cmb_adresler, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_yeniAdres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_adresDetaylari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // butona tıklayınca AdresBilgileri Frame ini açarak orada girdiğin bilgilerin kaydedilmesini sağlar
    private void btn_yeniAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yeniAdresActionPerformed
        new AdresEkle(kullanici).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_yeniAdresActionPerformed

    // butona tıklayınca seçilen adresin silinmesini sağlar eğr silinecek ades yoksa kullanıcıya hata verir
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            Adres adres = getAdres(String.valueOf(cmb_adresler.getSelectedItem()));
            adres.setKullanici(null);
            adresController.remove(adres);
            loadAddresses();
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "Adres bulunamadı adres ekleyiniz.");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    // butona tıklayınca AdresBilgileri Frame ine gider ve önceden kullanıcının girdiği gibi değiştirilemeyecek şekilde ekranda gözükür,
    //eğer adres yoksa kullanıcıya hata verir
    private void btn_adresDetaylariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adresDetaylariActionPerformed
        try {
            Adres adres = getAdres(String.valueOf(cmb_adresler.getSelectedItem()));
            new AdresBilgileri(adres).setVisible(true);
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "Adres bulunamadı adres ekleyiniz.");
        }
    }//GEN-LAST:event_btn_adresDetaylariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adresDetaylari;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_yeniAdres;
    private javax.swing.JComboBox<String> cmb_adresler;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
