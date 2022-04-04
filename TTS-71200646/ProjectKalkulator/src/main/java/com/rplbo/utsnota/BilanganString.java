package com.rplbo.utsnota;

import java.util.Locale;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring){
        String strLower = bilanganstring.toString().toLowerCase();

        if(strLower == "satu"){
            bilangan = 1;
        }if(strLower == "dua"){
            bilangan = 2;
        }if(strLower == "tiga"){
            bilangan = 3;
        }if(strLower == "empat"){
            bilangan = 4;
        }if(strLower == "lima"){
            bilangan = 5;
        }if(strLower == "enam"){
            bilangan = 6;
        }if(strLower == "tujuh"){
            bilangan = 7;
        }if(strLower == "delapan"){
            bilangan = 8;
        }if(strLower == "sembilan"){
            bilangan = 9;
        }if(strLower == "sepuluh"){
            bilangan = 10;
        }if(strLower == "sebelas"){
            bilangan = 11;
        }if(strLower == "dua belas"){
            bilangan = 12;
        }if(strLower == "tiga belas"){
            bilangan = 13;
        }if(strLower == "empat belas"){
            bilangan = 14;
        }if(strLower == "lima belas"){
            bilangan = 15;
        }if(strLower == "enam belas"){
            bilangan = 16;
        }if(strLower == "tujuh belas"){
            bilangan = 17;
        }if(strLower == "delapan belas"){
            bilangan = 18;
        }if(strLower == "sembilan belas"){
            bilangan = 19;
        }if(strLower == "dua puluh") {
            bilangan = 20;
        }
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        if(bilangan > 9 && bilangan < 100){
            return true;
        }else {
           return false;
        }
    }
    public boolean apakahLebihDari10(){
        if(bilangan > 10) {
            return true;
        }else {
            return false;
        }
    }
}
