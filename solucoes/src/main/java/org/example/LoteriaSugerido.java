package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoteriaSugerido {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int a3 = s.nextInt();
        int a4 = s.nextInt();
        int a5 = s.nextInt();
        int a6 = s.nextInt();

        int b1 = s.nextInt();
        int b2 = s.nextInt();
        int b3 = s.nextInt();
        int b4 = s.nextInt();
        int b5 = s.nextInt();
        int b6 = s.nextInt();

        int a = 0;

        if (b1 == a1 || b1 == a2 || b1 == a3 || b1 == a4 || b1 == a5 || b1 == a6) a++;
        if (b2 == a1 || b2 == a2 || b2 == a3 || b2 == a4 || b2 == a5 || b2 == a6) a++;
        if (b3 == a1 || b3 == a2 || b3 == a3 || b3 == a4 || b3 == a5 || b3 == a6) a++;
        if (b4 == a1 || b4 == a2 || b4 == a3 || b4 == a4 || b4 == a5 || b4 == a6) a++;
        if (b5 == a1 || b5 == a2 || b5 == a3 || b5 == a4 || b5 == a5 || b5 == a6) a++;
        if (b6 == a1 || b6 == a2 || b6 == a3 || b6 == a4 || b6 == a5 || b6 == a6) a++;

        if (a == 6) {
            System.out.println("sena");
        } else if (a == 5) {
            System.out.println("quina");
        } else if (a == 4) {
            System.out.println("quadra");
        } else if (a == 3) {
            System.out.println("terno");
        } else {
            System.out.println("azar");
        }
    }
}
