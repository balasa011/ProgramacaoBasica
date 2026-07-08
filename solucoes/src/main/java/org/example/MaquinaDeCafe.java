package org.example;

import java.util.Scanner;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int a1 = sci.nextInt();
        int a2 = sci.nextInt();
        int a3 = sci.nextInt();
        int a = 0;
        int a4 = 0;
        int a5 = 0;

        int b = 0;
        int b4 = 0;
        int b5 = 0;

        int c = 0;
        int c4 = 0;
        int c5 = 0;

        int resultado = 0;
        a = (a1 * 2) + (a2 * 2);
        a4 = (a1 * 2) + (a2 * 4);
        a5 = (a1 * 4) + (a2 * 2);

        b = (a1 * 2) + (a3 * 2);
        b4 = (a1 * 2) + (a2 * 4);
        b5 = (a1 * 4) + (a2 * 2);

        c = (a2 * 2) + (a3 * 2);
        c4 = (a1 * 2) + (a2 * 4);
        c5 = (a1 * 4) + (a2 * 2);

        if (a < b && a < c) {
            a3 = 0;
        } else if (b < a && b < c) {
            a2 = 0;
        } else if (c < a && c < b) {
            a1 = 0;
        }
        if (a3 == 0) {
            a2 = a2 * 2;
            a1 = a1 * 2;
            resultado = a2 + a1;
        }
        if (a2 == 0) {
            a1 = a1 * 2;
            a3 = a3 * 2;
            resultado = a1 + a3;
        }
        if (a3 == 0) {
            a2 = a2 * 2;
            a1 = a1 * 2;
            resultado = a2 + a1;
        }
        System.out.println(resultado);
    }
}

