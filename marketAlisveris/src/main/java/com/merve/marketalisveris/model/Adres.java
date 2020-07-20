
package com.merve.marketalisveris.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adres")
public class Adres {
    @Id
    private int adresId;
    private String semt;
    private String sehir;
    private String adresBaslik;
    private String adresAciklama;
    private String telNo;

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    // foreign key
    @ManyToOne(cascade = CascadeType.REMOVE ,fetch = FetchType.EAGER)
    @JoinColumn(name = "kullaniciId")
    private Kullanici kullanici;

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getAdresBaslik() {
        return adresBaslik;
    }

    public void setAdresBaslik(String adresBaslik) {
        this.adresBaslik = adresBaslik;
    }

    public String getAdresAciklama() {
        return adresAciklama;
    }

    public void setAdresAciklama(String adresAciklama) {
        this.adresAciklama = adresAciklama;
    }
    
}
