package ebobveekok;

import java.util.Scanner;


public class EbobVeEkok {

   
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sayi1,sayi2,ebob=0,ekok,sayac=1;
        
        System.out.print("Birinci sayiyi gir : ");
        sayi1 = input.nextInt();
        
        System.out.print("Ikinci sayiyi gir : ");
        sayi2 = input.nextInt();
        
        while (sayac<=sayi1 || sayac<=sayi2){
            if (sayi1%sayac==0 && sayi2%sayac==0){
                if (sayac>ebob){
                    ebob=sayac;
                }
            }
            sayac++;
        }
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("ebob = "+ebob);
        System.out.println("ekok = "+ekok);
        
        
        
    }
    
}
