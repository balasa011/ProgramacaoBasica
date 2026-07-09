package org.example;

import java.util.Scanner;

public class CachorroQuente {
    public static void main(String[] args) {

        Scanner sci = new Scanner(System.in);

        System.out.println("HotDog");
        float h = sci.nextFloat();

        System.out.println("People");
        float p = sci.nextFloat();

        float m = h/p;

        System.out.println("A media: " + m);

    }
}


