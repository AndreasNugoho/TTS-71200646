package com.uts.prakrplbo;

public class Apel extends Buah{
    private int harga=2000;

    public Apel(){
        setNama("Apel");
        setHarga(this.harga);
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }

}
