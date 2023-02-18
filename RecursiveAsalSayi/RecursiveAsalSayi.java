package recursiveasalsayi;

import java.util.Scanner;


public class RecursiveAsalSayi {

    static int isAsal(int sayi,int i){
    
    if (sayi < 2)
        return 0;
    if (i == 1)
        return 1;
    if (sayi % i == 0)
        return 0;
    return isAsal(sayi, i - 1);
        
   
    }
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int sayi;
        
        while(true){
        
            System.out.println("Sayiyi giriniz :");
            sayi = input.nextInt();
        
            if (isAsal(sayi,sayi/2)!=0) {
                System.out.println(sayi+" sayisi ASALDIR !");
            }else
                System.out.println(sayi+" sayisi ASAL degildir ! ");
        }
        
        
        
    }
    
}
