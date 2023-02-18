package desenegoremetotolusturma;

import java.util.Scanner;


public class DeseneGoreMetotOlusturma {

    
    static int desen(int sayi, int i ,boolean is){
    
    
    
    if(i>0&&is){
        System.out.print(i+ " ");
        i-=5;
        
    }else{
        System.out.print(i+ " ");
        is = false;
        i+=5;
        
        if (sayi==i) {
            System.out.print(i+ " ");
            return 0;
        }
    }
        
    return desen(sayi,i,is);
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        boolean isContinue = true;
        
        while (true) {            
            
            System.out.println("Bir sayi giriniz : ");
            sayi = input.nextInt();
            
            desen(sayi,sayi,isContinue);
            System.out.println("");
            
        }
        
    }
    
}
