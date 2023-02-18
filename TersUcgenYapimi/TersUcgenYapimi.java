package tersucgenyapimi;

import java.util.Scanner;


public class TersUcgenYapimi {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Basamak sayisi : ");
        int sayi = input.nextInt();
        
        for (int i =sayi ; i>=1;i--){
            for (int k =(sayi-i);k>=1;k--){
                System.out.print(" ");
            }
            for (int k =1 ; k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
