package com.merve.marketalisveris.view;

import com.merve.marketalisveris.model.Kullanici;
import com.merve.marketalisveris.controller.KullaniciController;
import javax.swing.JOptionPane;

public class KullaniciAdiAyar extends javax.swing.JFrame {

    private KullaniciController kullaniciController = new KullaniciController();

    public KullaniciAdiAyar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_mevcutKullaniciAdi = new javax.swing.JTextField();
        txt_yeniKullaniciAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        pwd_kullaniciSifre = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_kullaniciAdiSil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_kullaniciAdiGuncelle = new javax.swing.JButton();
        btn_kullaniciEkle = new javax.swing.JButton();
        btn_kullaniciSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mevcut Kullanıcı Adı");

        jLabel2.setText("Yeni Kullanıcı Adı");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add user.png"))); // NOI18N
        jLabel3.setText("Yeni Kullanıcı Ekle");

        jLabel4.setText("Kullanıcı Adı");

        jLabel5.setText("şifre");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete user.png"))); // NOI18N
        jLabel6.setText("Kullanıcı Sil");

        jLabel8.setText("Kullanıcı Adı");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user update.png"))); // NOI18N
        jLabel9.setText("Kullanıcı Adı Güncelle");

        btn_kullaniciAdiGuncelle.setText("Güncelle");
        btn_kullaniciAdiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciAdiGuncelleActionPerformed(evt);
            }
        });

        btn_kullaniciEkle.setText("Ekle");
        btn_kullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciEkleActionPerformed(evt);
            }
        });

        btn_kullaniciSil.setText("Sil");
        btn_kullaniciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwd_kullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_mevcutKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_yeniKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_kullaniciAdiGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_kullaniciEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_kullaniciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kullaniciAdiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mevcutKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_yeniKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kullaniciAdiGuncelle))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd_kullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kullaniciEkle))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciAdiSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kullaniciSil))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// gerekli metodu çalıştırarak yeni bir Kullanıcı eklememi sağlar,eğer boş ise kullanıcıya hata gösterir
    private void btn_kullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciEkleActionPerformed
        String sifre = new String(pwd_kullaniciSifre.getPassword());
        if (txt_kullaniciAdi.getText().isEmpty() || sifre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen kullanıcı adı ve şifre giriniz");
        } else {
            Kullanici kullanici = new Kullanici(txt_kullaniciAdi.getText(), sifre);
            kullaniciController.saveOrUpdate(kullanici);
        }

    }//GEN-LAST:event_btn_kullaniciEkleActionPerformed
// gerekli metodu çalıştırarak kullanıcıyı silmemi sağlar,eğer boş ise hatayı kullanıcıya verir
    private void btn_kullaniciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciSilActionPerformed
        if (txt_kullaniciAdiSil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen silinecek kullanıcı adı giriniz.");
        } else {
            Kullanici kullanici = kullaniciController.getByUserName(txt_kullaniciAdiSil.getText());
            kullaniciController.remove(kullanici);
        }
    }//GEN-LAST:event_btn_kullaniciSilActionPerformed
// kullanıcı adı güncellemek için kullanılır, eğer boş ise kullanıcıya hatayı gösterir
    private void btn_kullaniciAdiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciAdiGuncelleActionPerformed
        if (txt_mevcutKullaniciAdi.getText().isEmpty() || txt_yeniKullaniciAdi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen mevcu kullanıcı adı ve yeni kullanıcı adı giriniz.");
        } else {
            Kullanici kullanici = kullaniciController.getByUserName(txt_mevcutKullaniciAdi.getText());
            kullanici.setKullaniciAdi(txt_yeniKullaniciAdi.getText());
            kullaniciController.saveOrUpdate(kullanici);
        }
    }//GEN-LAST:event_btn_kullaniciAdiGuncelleActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kullaniciAdiGuncelle;
    private javax.swing.JButton btn_kullaniciEkle;
    private javax.swing.JButton btn_kullaniciSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pwd_kullaniciSifre;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JTextField txt_kullaniciAdiSil;
    private javax.swing.JTextField txt_mevcutKullaniciAdi;
    private javax.swing.JTextField txt_yeniKullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
