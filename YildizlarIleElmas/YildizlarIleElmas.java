package yildizlarıleelmas;

import java.util.Scanner;


public class YildizlarIleElmas {

    
    public static void main(String[] args) {
    
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Bir sayi gir : ");
        int sayi = inp.nextInt();
        
        for (int i=1;i<=sayi;i++){
            for (int j = 1 ; j <=(sayi-i);j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        for (int i =sayi-1 ;i>=1 ;i--){
            for (int j =(sayi-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int j =1 ; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
}
