package kombinasyonhesaplama;

import java.util.Scanner;


public class KombinasyonHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int n ,r,C;
        
        System.out.print("C(n,r) icin n = ");
        n = input.nextInt();
        
        System.out.print("C(n,r) icin r = ");
        r = input.nextInt();
        
        C = Faktoriyel(n) / (Faktoriyel(r) * Faktoriyel((n-r)));
        System.out.println("Kombinasyon sonucu : " + C);
    }
    
    public static int Faktoriyel(int sayi){
        int fakt = 1;
        for (int i = sayi; i > 1; i--){
            
            fakt = fakt*i;
            
        }
        return fakt;
    } 
    
    
}
