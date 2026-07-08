package org.example;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int a1 = sci.nextInt();
        int a2 = sci.nextInt();
        int a3 = sci.nextInt();
        int a4 = sci.nextInt();
        int a5 = sci.nextInt();
        int a6 = sci.nextInt();
        int b1 = sci.nextInt();
        int b2 = sci.nextInt();
        int b3 = sci.nextInt();
        int b4 = sci.nextInt();
        int b5 = sci.nextInt();
        int b6 = sci.nextInt();
        int c = 0;
        if (b1 == a1 || b1 == a2 || b1 == a3 || b1 == a4 || b1 == a5 || b1 == a6) {
            c = c + 1;
        }
        if (b2 == a1 || b2 == a2 || b2 == a3 || b2 == a4 || b2 == a5 || b2 == a6) {
            c = c + 1;
        }
        if (b3 == a1 || b3 == a2 || b3 == a3 || b3 == a4 || b3 == a5 || b3 == a6) {
            c = c + 1;
        }
        if (b4 == a1 || b4 == a2 || b4 == a3 || b4 == a4 || b4 == a5 || b4 == a6) {
            c = c + 1;
        }
        if (b5 == a1 || b5 == a2 || b5 == a3 || b5 == a4 || b5 == a5 || b5 == a6) {
            c = c + 1;
        }
        if (b6 == a1 || b6 == a2 || b6 == a3 || b6 == a4 || b6 == a5 || b6 == a6) {
            c = c + 1;
        }

        if (c == 3) {
            System.out.println("terno");
        } else if (c == 4) {
            System.out.println("quadra");
        } else if (c == 5) {
            System.out.println("quina");
        } else if (c == 6) {
            System.out.println("sena");
        } else {
            System.out.println("azar");
        }

    }
}