package dizininelemanlarinisiralama;

import java.util.Arrays;
import java.util.Scanner;


public class DizininElemanlariniSiralama {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Dizi boyutu n : ");
        n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < n; i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i] = input.nextInt();
        }
        
        Arrays.sort(list);
        System.out.println("Sıralama : "+Arrays.toString(list));

    }
}   
    