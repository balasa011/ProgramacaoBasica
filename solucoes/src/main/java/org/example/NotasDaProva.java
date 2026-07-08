package org.example;

import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int N = sci.nextInt();

        if (N == 0){
            System.out.println("E");
        } else if (N <=35) {
            System.out.println("D");
        } else if (N <=60 ) {
            System.out.println("C");
        } else if (N <=85) {
            System.out.println("B");
        }else{
            System.out.println("A");
        }

    }
}
