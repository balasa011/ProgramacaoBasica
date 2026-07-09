package medalhas;

import java.util.Scanner;

public class Medalhas {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);

        System.out.print("segundos: ");
        int TN1 = sci.nextInt();
        System.out.print("segundos: ");
        int TN2 = sci.nextInt();
        System.out.print("segundos: ");
        int TN3 = sci.nextInt();

        if (TN1 <TN2 && TN1 <TN3){
            System.out.println("TN1: 1L");
        }
        if (TN2 <TN1 && TN2 <TN3){
            System.out.println("TN2: 1L");
        }
        if (TN3 <TN1 && TN3 <TN2){
            System.out.println("TN3: 1L");
        }
        if(TN1 <TN2 && TN1 >TN3) {
            System.out.println("TN1: 2L");
        }
        if (TN1 <TN3 && TN1 >TN2){
            System.out.println("TN1: 2L");
        }
        if(TN2 <TN1 && TN2 >TN3){
            System.out.println("TN2: 2L");
        }
        if (TN2 <TN3 && TN2 >TN1){
            System.out.println("TN2: 2L");
        }
        if(TN3 <TN2 && TN3 >TN1){
            System.out.println("TN3: 2L");
        }
        if (TN3 <TN1 && TN3 >TN2){
            System.out.println("TN3: 2L");
        }
        if (TN1 >TN2 && TN1 >TN3){
            System.out.println("TN1: 3L");
        }
        if (TN2 >TN1 && TN2 >TN3){
            System.out.println("TN2: 3L");
        }
        if (TN3 >TN2 && TN3 >TN1){
            System.out.println("TN3: 3L");
        }







    }
}
