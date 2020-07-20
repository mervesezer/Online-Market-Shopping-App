
package com.merve.marketalisveris.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "kullanici")
public class Kullanici {
    @Id
    private int kullaniciId;
    private String kullaniciAdi;
    private String sifre;
    //foreign key
    @OneToMany(mappedBy = "kullanici", fetch = FetchType.EAGER)
    private List<Adres> adresler;

    public List<Adres> getAdresler() {
        return adresler;
    }

    public void setAdresler(List<Adres> adresler) {
        this.adresler = adresler;
    }
   
    public Kullanici() {
    }
    
    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
}
