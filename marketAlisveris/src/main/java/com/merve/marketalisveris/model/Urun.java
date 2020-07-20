
package com.merve.marketalisveris.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "urun")
public class Urun {
    @Id
    private int urunId;
    private float alisMiktar;
    private float satisMiktar;
    private int indirimMiktar;
    private String stokDurum;
    private int urunAdet;
    private String urunIsim;
    
    // foreign key
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kategoriId")
    private Kategori kategori;

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public float getAlisMiktar() {
        return alisMiktar;
    }

    public void setAlisMiktar(float alisMiktar) {
        this.alisMiktar = alisMiktar;
    }

    public float getSatisMiktar() {
        return satisMiktar;
    }

    public void setSatisMiktar(float satisMiktar) {
        this.satisMiktar = satisMiktar;
    }

    public int getIndirimMiktar() {
        return indirimMiktar;
    }

    public void setIndirimMiktar(int indirimMiktar) {
        this.indirimMiktar = indirimMiktar;
    }

    public String getStokDurum() {
        return stokDurum;
    }

    public void setStokDurum(String stokDurum) {
        this.stokDurum = stokDurum;
    }

    public int getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(int urunAdet) {
        this.urunAdet = urunAdet;
    }

    public String getUrunIsim() {
        return urunIsim;
    }

    public void setUrunIsim(String urunIsim) {
        this.urunIsim = urunIsim;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    
}
