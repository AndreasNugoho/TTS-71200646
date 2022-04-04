package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Keranjang {
    private ArrayList<Buah> buah;
    Keranjang(){
        this.buah = new ArrayList<Buah>();
    }
    public void tambahProduk(Buah buah){
        this.buah.add(buah);
        System.out.println(buah.getNama()+" "+"Berhasil di tambahkan di keranjang");
    }

    public void hapusProduk(Buah b) {
        ListIterator<Buah> it1 = buah.listIterator();
        while (it1.hasNext()){
            Buah buah2 = it1.next();
            if(buah2.getNama().equals(b.getNama())){
                this.buah.remove(b);
                System.out.println(b.getNama()+" "+"berhasil di hapus");
                break;
            }
        }
    }
    public void getKeranjang() {
        ListIterator<Buah> iterator3 = buah.listIterator();
        int total = 0;
        while(iterator3.hasNext()) {
            Buah buah4 = iterator3.next();
            System.out.print(buah4.getNama() + "\t"+ "\t"+ "\t"+ "\t"+ "\t");
            System.out.println(buah4.getHarga());
            total = total+ buah4.getHarga();

        }
        System.out.println("Total Harga"+"            "+total);





    }
}
