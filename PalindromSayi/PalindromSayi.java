package palindromsayi;

import java.util.Scanner;


public class PalindromSayi {

    
    static boolean isPalindrom(int number){
    
        int temp = number,reverseNumber = 0,lastNumber;
        
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        
        return number!=reverseNumber ? false:true;
    
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int sayi;
        
        while (true) {            
            System.out.print("Bir sayi gir : ");
            sayi = input.nextInt();
            
            if (isPalindrom(sayi)) {
                System.out.println("Sayi Polindrom Sayidir");
            }else{
                System.out.println("Sayi Polindrom Sayi Degildir");
            }
        }
        
    }
    
}
