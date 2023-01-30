package manavkasaprogrami;

import java.util.Scanner;


public class ManavKasaProgrami {

    
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        
        int armut,elma,domates,muz,patlican;
        double toplam = 0.0;
        
        
        System.out.print("Armut kac kilo? : ");
        armut = input.nextInt();
        
        System.out.print("Elma kac kilo? : ");
        elma = input.nextInt();
        
        System.out.print("Domates kac kilo? : ");
        domates = input.nextInt();
        
        System.out.print("Muz kac kilo? : ");
        muz = input.nextInt();
        
        System.out.print("Patlican kac kilo? : ");
        patlican = input.nextInt();
        
        toplam += armut*2.14;
        toplam += elma*3.67;
        toplam += domates*1.11;
        toplam += muz *0.95;
        toplam += patlican*5.0;
        
        System.out.println("Toplam tutar : " + toplam);
        
        
    }
    
}
