package mayintarlasioyunu;

import java.util.Scanner;


public class MayinTarlasiOyunu {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int secim;
        int index=0;
        boolean kontrol = true;
        
        System.out.println("Oyunun zorluk derecesi ne olsun : ");
        System.out.println("Kolay : 1\nOrta : 2\nZor : 3");
        
        
        do{
            System.out.print("Secim : ");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    index=3;
                    kontrol = true;
                    break ;
                case 2:
                    index=6;
                    kontrol = true;
                    break ;
                case 3:
                    index=10;
                    kontrol = true;
                    break ;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar giris yapiniz !!!");
                    kontrol=false;
            }
        }while(!kontrol);  
        
        MineSweeper mine = new MineSweeper(index,index);
        mine.run();
        
        
    }
    
}
