package uslusayihesaplama;

import java.util.Scanner;


public class UsluSayiHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int x,y,sonuc=1;
        
        System.out.print("Ussu alinacak sayi : ");
        x = input.nextInt();
        
        System.out.print("Us olacak sayi : ");
        y = input.nextInt();
        
        for (int i = 1 ; i <= y ; i++ ){
            sonuc *= x;
        }
        
        System.out.println("Sonuc : " + sonuc);
        
        
    }
    
}

