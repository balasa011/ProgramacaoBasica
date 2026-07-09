package org.example;

import java.util.Scanner;

public class MaquinaCafeSugerido {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int um = sci.nextInt();
        int dois = sci.nextInt();
        int tres = sci.nextInt();

        int andar1 = (dois + tres*2)*2;
        int andar2 = (tres+um)*2;
        int andar3 = (um*2+dois)*2;

        if(andar1<=andar2 && andar1<=andar3){
            System.out.println(andar1);
        }else if(andar2<=andar1 && andar2<=andar3){
            System.out.println(andar2);
        }else{
            System.out.println(andar3);
        }
    }
}
