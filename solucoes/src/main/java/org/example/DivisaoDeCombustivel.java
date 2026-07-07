package org.example;


import java.util.Scanner;

public class DivisaoDeCombustivel {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        float al = sci.nextInt();
        float bm = sci.nextInt();
        float c = al/bm;
        System.out.printf("%.2f\n", c);
    }
}
