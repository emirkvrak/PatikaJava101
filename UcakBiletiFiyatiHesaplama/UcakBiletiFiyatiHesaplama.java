
package ucakbiletifiyatihesaplama;

import java.util.Scanner;


public class UcakBiletiFiyatiHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int mesafe, yas, yolTipi;
        double biletFiyati, kmbasi = 0.10;

        System.out.println("Mesafeyi(KM) gir: ");
        mesafe = input.nextInt();
        
        System.out.println("Yasini gir : ");
        yas = input.nextInt();
        
        System.out.println("Yolculuk tipini gir (1 => Tek Yon , 2 => Gidis Donus) : ");
        yolTipi = input.nextInt();
        
        if( yas > 0 && mesafe > 0 && ( yolTipi==1 || yolTipi == 2 ) )
        {    
            biletFiyati = mesafe * 0.10;
        
            if (yas > 0 && yas <= 12) {
                biletFiyati -= (biletFiyati*0.50);
            }
            else if (yas > 12 && yas <= 24) {
                biletFiyati -= (biletFiyati*0.10);
            }
            else if (yas >= 65) {
                biletFiyati -= (biletFiyati*0.30);
            }
            
            
            if (yolTipi == 2 ) {
               biletFiyati -= (biletFiyati*0.20);
               biletFiyati *= 2;
            }
            
            System.out.println("Toplam Tutar = "+biletFiyati+" TL");
            
        }else
            System.out.println("Hatali Veri Girdiniz !!!");
        
    }
    
}
