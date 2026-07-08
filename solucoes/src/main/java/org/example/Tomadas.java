package org.example;

import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int T1 = sci.nextInt();
        T1 = T1 - 1;
        int T2 = sci.nextInt();
        T2 = T2 - 1;
        int T3 = sci.nextInt();
        T3 = T3 - 1;
        int T4 = sci.nextInt();
        int total = T1 + T2 + T3 + T4;
        System.out.println(total);

    }
}
