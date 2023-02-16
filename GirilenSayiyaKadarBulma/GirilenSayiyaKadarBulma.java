package girilensayiyakadarbulma;

import java.util.Scanner;


public class GirilenSayiyaKadarBulma {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        int k,sayac = 0;
        double top=0.0,ort;
        
        System.out.println("Sayi gir : ");
        k = input.nextInt();
        
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                top += i;
                sayac++;
            }
        }
        
        ort = top/sayac;
        
        System.out.println("3 ve 4'e tam bölünen sayıların ortalamasın : " + ort);
        
    }
    
}
