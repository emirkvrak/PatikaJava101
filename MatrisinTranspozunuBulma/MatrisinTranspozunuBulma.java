package matrisintranspozunubulma;

import java.util.Scanner;


public class MatrisinTranspozunuBulma {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satir sayisi : ");
        int k = input.nextInt();
        System.out.print("Matrisin sütun sayisi : ");
        int m = input.nextInt();
        
        int eleman;
        int[][] dizi = new int[k][m];
        int[][] tdizi = new int[m][k];
        
        System.out.println("Matrisin elemanlarini giriniz : ");
         
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("dizi["+i+"]["+j+"] = ");          
                dizi[i][j] = input.nextInt();
            }
        }
        System.out.println("*****************");
        

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                tdizi[j][i] = dizi[i][j];
            }
        }
        
        System.out.println("Matris : ");
        for (int[] is : dizi) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpoze : ");
        for (int[] is : tdizi) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    
}
