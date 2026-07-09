package org.example;

import java.util.Scanner;

public class ZerinhoOuUm {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int A = sci.nextInt();
        int B = sci.nextInt();
        int C = sci.nextInt();
        if (A != B && A != C) {
            System.out.println("A");
        } else if (B != A && B != C) {
            System.out.println("B");
        } else if (C != B && C != A) {
            System.out.println("C");
        } else {
            System.out.println("*");
        }


    }
}
