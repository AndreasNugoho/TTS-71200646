package com.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString tes1,BilanganString tes2,Operator op){
        bil1 = tes1.getBilangan();
        bil2 = tes2.getBilangan();
        this.op = op.getOperatorSimbol();
    }
    public void hitung(){
        if(op == "+"){
            System.out.print("Hasil: ");
            System.out.println(bil1+bil2);
        }if(op == "-"){
            System.out.print("Hasil: ");
            System.out.println(bil1-bil2);
        }if(op == "*"){
            System.out.print("Hasil: ");
            System.out.println(bil1*bil2);
        }if(op == "/"){
            System.out.print("Hasil: ");
            System.out.println(bil1/bil2);
        }if(op == "^"){
            System.out.print("Hasil: ");
            System.out.println(Math.pow(bil1,bil2));
        }
    }
}
