package vucutkitleındeksiprogrami;

import java.util.Scanner;


public class VucutKitleIndeksiProgrami {

    
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        
        double m,kg,indeks;
        
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        m = input.nextDouble();
        
        System.out.print("Lutfen kilonuzu giriniz : ");
        kg = input.nextDouble();
    
        indeks = kg/(m*m);
        
        System.out.println("Vucut Kitle Indeksiniz : " +indeks);
        
        
    }
    
}
