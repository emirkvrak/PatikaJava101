package harmoniksayihesaplama;

import java.util.Scanner;


public class HarmonikSayiHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sayi;
        double sonuc = 0.0;
        
        System.out.println("Bir sayi gir : ");
        sayi = input.nextInt();
        
        for (int i = 1 ; i<=sayi; i++){
            sonuc += (double)1/i;
        }
        
        System.out.println("sonuc : "+sonuc);
    
    }
    
}
