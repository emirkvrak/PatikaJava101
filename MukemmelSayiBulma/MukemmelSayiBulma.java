package mukemmelsayibulma;

import java.util.Scanner;


public class MukemmelSayiBulma {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int sayi,top=0 ;
        
        while(true){
            System.out.print("Bir sayi gir: ");
            sayi = input.nextInt();
            
            for (int i = 1 ; i<sayi;i++){
                if (sayi%i==0){
                    top += i;
                }
            }
        
            if (sayi!=top){
                System.out.println(sayi+" Mukemmel sayi degildir !!");
            }
            else {
                System.out.println(sayi+" Mukemmel sayidir. ");
            }
            top=0;
        }
    }
    
}
