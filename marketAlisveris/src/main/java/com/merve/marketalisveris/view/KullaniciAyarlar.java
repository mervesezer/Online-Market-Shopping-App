
package com.merve.marketalisveris.view;

import com.merve.marketalisveris.model.Kullanici;


public class KullaniciAyarlar extends javax.swing.JFrame {
    private Kullanici kullanici;
   
    public KullaniciAyarlar(Kullanici kullanici) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.kullanici = kullanici;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_kullaniciAyarGit = new javax.swing.JButton();
        btn_sifreAyarGit = new javax.swing.JButton();
        btn_adresAyarGit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user settings.png"))); // NOI18N
        jLabel1.setText("KULLANICI AYARLARI");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/name change.png"))); // NOI18N
        jLabel2.setText("Kullanıcı Adı Ayarları");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password change.png"))); // NOI18N
        jLabel3.setText("Şifre Ayarları");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/address setting.png"))); // NOI18N
        jLabel4.setText("Adres Ayarları");

        btn_kullaniciAyarGit.setText("Güncelle");
        btn_kullaniciAyarGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciAyarGitActionPerformed(evt);
            }
        });

        btn_sifreAyarGit.setText("Güncelle");
        btn_sifreAyarGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifreAyarGitActionPerformed(evt);
            }
        });

        btn_adresAyarGit.setText("Güncelle");
        btn_adresAyarGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adresAyarGitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_adresAyarGit)
                            .addComponent(btn_sifreAyarGit)
                            .addComponent(btn_kullaniciAyarGit))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_kullaniciAyarGit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_sifreAyarGit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_adresAyarGit))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// buradaki butona bastıktan sonra bulunduğu Frame kapanır KullaniciAdiAyar Frame ini açar
    private void btn_kullaniciAyarGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciAyarGitActionPerformed
        this.dispose();
        new KullaniciAdiAyar().setVisible(true);
        
    }//GEN-LAST:event_btn_kullaniciAyarGitActionPerformed
//buradaki butona bastıktan sonra bulunduğu Frame kapanır SifreAyar Frame ini açar
    private void btn_sifreAyarGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifreAyarGitActionPerformed
        this.dispose();
        new SifreAyar(kullanici).setVisible(true);
    }//GEN-LAST:event_btn_sifreAyarGitActionPerformed
//buradaki butona bastıktan sonra bulunduğu Frame kapanır AdresAyarlar Frame ini açar
    private void btn_adresAyarGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adresAyarGitActionPerformed
        this.dispose();
        new AdresAyarlar(kullanici).setVisible(true);
                
    }//GEN-LAST:event_btn_adresAyarGitActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adresAyarGit;
    private javax.swing.JButton btn_kullaniciAyarGit;
    private javax.swing.JButton btn_sifreAyarGit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
