package com.merve.marketalisveris.view;

import com.merve.marketalisveris.model.Kullanici;
import com.merve.marketalisveris.controller.KullaniciController;
import java.util.List;
import javax.swing.JOptionPane;

public class SifreAyar extends javax.swing.JFrame {

    private final Kullanici kullanici;
    KullaniciController kullaniciKontrol = new KullaniciController();

    public SifreAyar(Kullanici kullanici) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.kullanici = kullanici;
    }
   // Girdiğim şifrenin doğruluğunu kontrol eder bütün Kullanıcıları gezerek
    private boolean isPasswordValid() {
        String mevcutSifre = new String(pwd_mevcut.getPassword());
        List<Kullanici> kullanicilar = kullaniciKontrol.getAll();
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(this.kullanici.getKullaniciAdi())) {
                if(kullanici.getSifre().equals(mevcutSifre)){
                    return true;
                }
            }
        }
        
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_sifreGuncelle = new javax.swing.JButton();
        pwd_mevcut = new javax.swing.JPasswordField();
        pwd_yeniSifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Mevcut Şifre");

        jLabel2.setText("Yeni Şifre");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordupdate.png"))); // NOI18N
        jLabel3.setText("Şifre Güncelle");

        btn_sifreGuncelle.setText("Güncelle");
        btn_sifreGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifreGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pwd_mevcut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 94, Short.MAX_VALUE)
                                .addComponent(pwd_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sifreGuncelle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sifreGuncelle)
                    .addComponent(pwd_mevcut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 // butona bastıktan sonra mevcut şifremi yeni girdiğim şifre ile değiştirir
    private void btn_sifreGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifreGuncelleActionPerformed
        if(isPasswordValid()){
            String yeniSifre = new String(pwd_yeniSifre.getPassword());
            kullanici.setSifre(yeniSifre);
            kullaniciKontrol.saveOrUpdate(kullanici);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Mevcut şifreniz yanlış");
        }
    }//GEN-LAST:event_btn_sifreGuncelleActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sifreGuncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pwd_mevcut;
    private javax.swing.JPasswordField pwd_yeniSifre;
    // End of variables declaration//GEN-END:variables
}
