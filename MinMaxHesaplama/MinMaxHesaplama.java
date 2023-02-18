package minmaxhesaplama;

import java.util.Scanner;


public class MinMaxHesaplama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int n,sayi = 0,min,max;
        
        System.out.println("Kaç tane sayi gireceksiniz ? : ");
        n = input.nextInt();
        
        if (n>0) {
            System.out.print("1.sayiyi girin : ");
            sayi = input.nextInt();
        }
            max = sayi;
            min = sayi;
        
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ".sayiyi girin : ");
            sayi = input.nextInt();
            
            if (sayi<min) {
                min = sayi;
            }
            if (sayi>max) {
                max = sayi;
            }
        }
        System.out.println("En buyuk sayi : "+max );
        System.out.println("En kucuk sayi : "+min );
    
    }
    
}
