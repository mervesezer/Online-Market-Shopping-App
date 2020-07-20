package com.merve.marketalisveris.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class OdemeTableModel extends AbstractTableModel {

    private List<Urun> urunler = new ArrayList<>();
    private String[] columnNames = {"No", "Urun Ismi", "Fiyat"};

    @Override
    public int getRowCount() {
        return urunler.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    // Belli bir satır ve sütundaki değeri geri döndüren method
    @Override
    public Object getValueAt(int row, int col) {
        Urun urun = urunler.get(row);
        Object value = null;
        switch (col) {
            case 0:
                value = (row + 1);
                break;
            case 1:
                value = urun.getUrunIsim();
                break;
            case 2:
                value = urun.getSatisMiktar();
                break;
        }
        return value;
    }

    //Gönderilen ürünü tabloya ekler
    public void addProduct(Urun urun) {
        urunler.add(urun);
        this.fireTableDataChanged();
    }

    //Gönderilen nodaki ürünü  tablodan siler
    public void removeProduct(int no) {
        urunler.remove(no - 1);
        this.fireTableDataChanged();
    }

    //Tüm ürünleri tablodan siler
    public void clearProduct() {
        urunler.clear();
        this.fireTableDataChanged();
    }

    //Tablodaki ürünlerin toplam ücretini geri döndürür
    public float totalFee() {
        float toplam = 0;
        for (Urun urun : urunler) {
            toplam += urun.getSatisMiktar();
        }
        return toplam;
    }

    //Toplam indirim miktarını geri döndürür
    public int totalDiscount() {
        int toplam = 0;
        for (Urun urun : urunler) {
            toplam += urun.getIndirimMiktar();
        }
        return toplam;
    }

}
