package org.example;

import java.util.Scanner;

public class AndandoNoTempo {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);

        int a = sci.nextInt();
        int b = sci.nextInt();
        int c = sci.nextInt();
        if (a - b == 0) {
            System.out.print("S");
        } else if (a - c == 0) {
            System.out.print("S");
        } else if (b - c == 0) {
            System.out.println("S");
        } else if (a + b == 0) {
            System.out.print("S");
        } else if (a + c == 0) {
            System.out.print("S");
        } else if (b + c == 0) {
            System.out.println("S");
        } else if (a - b - c == 0) {
            System.out.print("S");
        } else if (a - b + c == 0) {
            System.out.print("S");
        } else if (a + b - c == 0) {
            System.out.print("S");
        } else if (a + b + c == 0) {
            System.out.print("S");
        } else if (a - b < 0 || a - b > 0) {
            System.out.print("N");
        } else if (a - c < 0 || a - c > 0) {
            System.out.print("N");
        } else if (b - c < 0 || b - c > 0) {
            System.out.print("N");
        } else if (b + c < 0 || b + c > 0) {
            System.out.print("N");
        } else if (a + b < 0 || a + b > 0) {
            System.out.print("N");
        } else if (a + c < 0 || a + c > 0) {
            System.out.print("N");
        } else if (a - b - c < 0 || a - b - c > 0) {
            System.out.print("N");
        } else if (a - b + c < 0 || a - b + c > 0) {
            System.out.print("N");
        } else if (a + b - c < 0 || a + b - c > 0) {
            System.out.print("N");
        } else if (a + b + c < 0 || a + b + c > 0) {
            System.out.print("N");
        }
    }
}
