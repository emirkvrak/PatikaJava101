package teksayigirilenekadarhesaplama;

import java.util.Scanner;


public class TekSayiGirileneKadarHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sayi,toplam = 0;
        
        do {
            
            System.out.print("Bir sayi gir :");
            sayi = input.nextInt();
            
            if (sayi%4==0){
                toplam+=sayi;
            }
            
        }while(sayi%2==0);
        System.out.println("toplam : "+toplam);
        
        
    }
    
}
