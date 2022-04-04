package com.uts.prakrplbo;

import java.text.NumberFormat;
import java.util.Locale;

public class App
{
    public static void main( String[] args )
    {
        Keranjang keranjangKu = new Keranjang();
        Mangga manggaKu = new Mangga();
        Apel apelKu = new Apel();
        System.out.println("\n========== TESTCASE #1 ==========");
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);

        System.out.println("\n========== TESTCASE #2 ==========");
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);

        System.out.println("\n========== TESTCASE #3 ==========");
        keranjangKu.hapusProduk(apelKu);
        keranjangKu.hapusProduk(apelKu);


        System.out.println("\n========== TESTCASE #4 ==========");
        keranjangKu.getKeranjang();

    }
}
