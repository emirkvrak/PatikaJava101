package kdvtutarihesaplama;

import java.util.Scanner;


public class KdvTutariHesaplama {

    
    public static void main(String[] args) {
    
        
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ucret Tutarini Gir : ");
        tutar = input.nextDouble();
        
        if (tutar <= 1000) {
            kdvOran = 0.18;
        }else{
            kdvOran = 0.08;
        }
        
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
        
        
    }
    
}
