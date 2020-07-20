package com.merve.marketalisveris.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "kategori")
public class Kategori {
    @Id
    int kategoriId;
    String kategoriIsim;
    //foreign key
    @OneToMany(mappedBy = "kategori",fetch = FetchType.EAGER)
    private List<Urun> urunler;

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriIsim() {
        return kategoriIsim;
    }

    public void setKategoriIsim(String kategoriIsim) {
        this.kategoriIsim = kategoriIsim;
    }

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

}
