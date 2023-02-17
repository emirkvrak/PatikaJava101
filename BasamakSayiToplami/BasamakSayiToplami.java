package basamaksayitoplami;

import java.util.Scanner;


public class BasamakSayiToplami {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sayi , toplam=0;
        
        System.out.print("Bir sayi gir :");
        sayi = input.nextInt();
        
        while (sayi!=0){
            
            toplam += (sayi%10);
            sayi  = sayi/10;
            
        }
        
        System.out.println("Basamak sayi toplamlari : "+toplam);

    }
    
}
