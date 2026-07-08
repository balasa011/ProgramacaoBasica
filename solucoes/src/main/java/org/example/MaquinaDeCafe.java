package org.example;

import java.util.Scanner;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int a1 = sci.nextInt();
        int a2 = sci.nextInt();
        int a3 = sci.nextInt();
        int b = 0;
        int c = 0;
        int d = 0;

        if (a1 < a2 || a1 < a3) {
            b = b + a1;
        }
        if (a2 < a1 || a2 < a3) {
            c = c + a2;
        }
        if (a3 < a1 || a3 < a2) {
            d = d + a3;
        }
        if (b == 0){
            c= c *2;
            d= d*4;
        }
        if (c == 0){
            b= b*2;
            d= d*2;
        }
        if (d == 0){
            c= c*2;
            b= b*4;
        }
        int e = (b + c + d);
        System.out.println(e);
    }
}
