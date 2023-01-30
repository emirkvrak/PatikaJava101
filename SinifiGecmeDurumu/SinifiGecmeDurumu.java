package sinifigecmedurumu;

import java.util.Scanner;


public class SinifiGecmeDurumu {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int mat,fizik,turkce,kimya,muzik;
        double avarage=0;
        
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();
        
        if ((mat>=0 && mat<=100)&&(turkce>=0 && turkce<=100)&&(fizik>=0 && fizik<=100)&&(muzik>=0 && muzik<=100)&&(kimya>=0 && kimya<=100)) {
            avarage = (double)(mat+turkce+kimya+fizik+muzik)/5;
            
            if (avarage <= 55) {
                System.out.println("Sinifta kaldiniz :(");
            }else{
                System.out.println("Tebrikler sinifi gectiniz :)");       
            }
            System.out.println("Ortalamaniz : " + avarage);
        }else{
            System.out.println("Hatali not girdiniz 'notlar 0 ve 100 arasinda olamli !!!' ");
        }
      
    }
    
}