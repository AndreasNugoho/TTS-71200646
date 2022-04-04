package com.rplbo.utsnota;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatorString) {
        String strLower = operatorString.toLowerCase();
        if (strLower == "kali") {
            operatorSimbol = "*";
        }
        if (strLower == "bagi") {
            operatorSimbol = "/";
        }
        if (strLower == "tambah") {
            operatorSimbol = "+";
        }
        if (strLower == "kurang") {
            operatorSimbol = "-";
        }if (strLower == "pangkat") {
            operatorSimbol = "^";
        } else {
            System.out.println("inputan salah");
        }
    }
    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}