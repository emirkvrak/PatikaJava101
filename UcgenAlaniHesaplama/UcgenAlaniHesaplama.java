package ucgenalanihesaplama;

import java.util.Scanner;


public class UcgenAlaniHesaplama {

    
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        double  cevre,alan,kenarBir,kenarIki,kenarUc,u;

        System.out.print("1.kenar : ");
        kenarBir = input.nextDouble();
        
        System.out.print("2.kenar : ");
        kenarIki = input.nextDouble();
        
        System.out.print("3.kenar : ");
        kenarUc = input.nextDouble();
        
        u = (kenarBir+kenarIki+kenarUc)/2;
        
        alan =  u*(u-kenarBir)*(u-kenarIki)*(u-kenarUc);
        alan = Math.sqrt(alan);
        
        cevre = 2*u;
        
        System.out.println("Ucgen Alani : " + alan);
        System.out.println("Ucgen Cevresi : "+ cevre);
        
        
    }
    
}
