package com.uts.prakrplbo;

public class Buah {
    private String nama;
    private int jumlah;
    private int harga;

    public String toString() {
        String s = this.nama + ":";
        s = s + this.jumlah + "\n";
        return s;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
