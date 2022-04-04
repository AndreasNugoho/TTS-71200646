package com.uts.prakrplbo;

public class Mangga extends Buah{
    private int harga=3000;
    Mangga(){
        setNama("Mangga");
        setHarga(this.harga);
        setJumlah(getJumlah());
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }
    public void setJumlah(int jumlah) {
        super.setJumlah(jumlah);
    }
}
