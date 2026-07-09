package org.example;

import java.util.Scanner;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int a1 = sci.nextInt();
        int a2 = sci.nextInt();
        int a3 = sci.nextInt();

        int b1 = 0;
        int b2 = 0;
        int b3 = 0;

        int melhor = 0;

        b1 = (a2 * 2) + (a3 * 4);
        b2 = (a1 * 2) + (a3 * 2);
        b3 = (a2 * 2) + (a1 * 4);

        if (b1 <= b2 && b1 <= b3) {
            melhor = b1;
        } else if (b2 <= b1 && b2 <= b3) {
            melhor = b2;
        }else {
            melhor = b3;
        }
        System.out.println(melhor);
    }
}

