package fibonacciserisi;

import java.util.Scanner;

public class FibonacciSerisi {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        int f1=0,f2=1,temp;
        
        System.out.print("Eleman sayisini gir : ");
        n = input.nextInt();
        
        for (int i = 1; i<=n;i++){
           System.out.print(f1 + " ");
           temp = f1;
           f1 = f2;
           f2 = f2 + temp; 
           
        }
        
    }
    
}
