package dortvebeskuvvetleri;

import java.util.Scanner;


public class DortVeBesKuvvetleri {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sayi;
        
        System.out.print("Bir sayi gir : ");
        sayi = input.nextInt();
        
        System.out.println("4 ve 5'in kuvvetleri : ");
        
        for (int i = 4, j = 5 ; i <= sayi && j <= sayi ; i *= 4, j *= 5){

            System.out.println( i + " : " + j );
        }
        
    }
    
}
