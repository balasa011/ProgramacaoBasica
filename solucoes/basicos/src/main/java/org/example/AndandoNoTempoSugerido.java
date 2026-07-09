package org.example;

import java.util.Scanner;

public class AndandoNoTempoSugerido {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int a = sci.nextInt();
        int b = sci.nextInt();
        int c = sci.nextInt();


        if (a == b || a == c || b == c) { //PARA DUAS VIAGENS
            System.out.print("S");
        } else if (a + b == c || a + c == b || b + c == a) { //PARA TRES VIAGENS
            System.out.print("S");
        } else {
            System.out.print("N");
        }

    }
}
