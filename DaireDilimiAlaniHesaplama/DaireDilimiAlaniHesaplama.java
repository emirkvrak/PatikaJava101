package dairedilimialanihesaplama;

import java.util.Scanner;


public class DaireDilimiAlaniHesaplama {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        double aci, r, alan, pi=3.14;
        
        System.out.println("Merkez aci olcusunu gir : ");
        aci = input.nextDouble();
        
        System.out.println("Yaricap uzunlugunu gir : ");
        r = input.nextDouble();
        
        alan = (pi*(r*r)*aci)/360;
        System.out.println("Daire diliminin alani : "+ alan);
        
    }
    
}