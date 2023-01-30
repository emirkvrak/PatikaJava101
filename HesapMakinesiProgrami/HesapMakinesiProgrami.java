package hesapmakinesiprogrami;

import java.util.Scanner;


public class HesapMakinesiProgrami {

    
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        
        double x,y;
        String islem;
        
        System.out.println("Ilk sayiyi gir : ");
        x = input.nextDouble();
        
        System.out.println("Ikinci sayiyi gir :");
        y = input.nextDouble();
        
        System.out.println("Toplama = +\nCikarma = -\nCarpma = *\nBolme = /");
        System.out.println("Islemi gir : ");
        islem = input.next();
        
        switch (islem) {
            case "+":
                System.out.println("Toplam : " + (x+y));
                break;
            case "-":
                System.out.println("Cikarma : " + (x-y));
                break;
            case "*":
                System.out.println("Carpma : " + (x*y));
                break;    
            case "/":
                if (y != 0) {
                    System.out.println("Bolme : " + (x/y));
                }else
                    System.out.println("Bir sayi 0'a bolunemez !!!");
                break; 
                
            default:
                System.out.println("Yanlis bir islem girdiniz !!!");
        }
    
    }
    
}
