package sayilarikucuktenbuyugesiralama;

import java.util.Scanner;


public class SayilariKucuktenBuyugeSiralama {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("1. sayi : ");
        a = input.nextInt();
        System.out.println("2. sayi : ");
        b = input.nextInt();
        System.out.println("3. sayi : ");
        c = input.nextInt();
        
        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println(c+"<"+b+"<"+a);
            }
            else {
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else if ((b>a) && (b>c)){
            if (a>b){
                System.out.println(c+"<"+a+"<"+b);
            }
            else {

                System.out.println(a+"<"+c+"<"+b);
            }
        }
        else {
            if(b>a){
                System.out.println(a+"<"+b+"<"+c);
            }
            else {
                System.out.println(b+"<"+a+"<"+c);
            }
        }
    }
}
