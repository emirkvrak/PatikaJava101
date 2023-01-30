package ortalamahesaplama;

import java.util.Scanner;


public class OrtalamaHesaplama {

    
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        int matematik,turkce,muzik,fizik,kimya,tarih;
        float ortalama;
        
        System.out.print("Matematik notunu gir : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunu gir : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu gir : ");
        kimya = input.nextInt();
        System.out.print("Turkce notunu gir : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunu gir : ");
        tarih= input.nextInt();
        System.out.print("Muzik notunu gir : ");
        muzik= input.nextInt();
        
        ortalama = (float)(matematik+turkce+fizik+muzik+tarih+kimya)/6;
        
        String durum = ortalama>60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        
        System.out.println("Basari puani :"+ortalama);
        System.out.println("Basari durumu :"+durum);
        
        
    }
    
}
