package recursiveusluhesaplama;

import java.util.Scanner;


public class RecursiveUsluHesaplama {

    static int usFonk(int taban,int us){
        
        if (us==0) {
            return 1;
        }
        
    return taban*usFonk(taban,us-1);
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int taban,us;
        while(true){
        
            System.out.println("Taban degeri giriniz : ");
            taban=input.nextInt();
            System.out.println("Us degeri giriniz : ");
            us=input.nextInt();
            
            System.out.println(taban+"^"+us+"="+usFonk(taban,us));
        }
        
        
    }
    
}
