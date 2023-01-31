package havasicakliginagoreetkinlik;

import java.util.Scanner;


public class HavaSicakliginaGoreEtkinlik {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int heat;
        
        System.out.println("Sicakligi gir : ");
        heat = input.nextInt();
        
        if (heat < 5) {
            System.out.println("Kayak yapabilirsin. ");
        }
        else if((heat >= 5) && (heat <= 15)){
            System.out.println("Sinemaya gidebilirsin. ");
        }
        else if((heat > 15) && (heat <= 25)){
            System.out.println("Piknige gidebilirsin. ");
        }else
            System.out.println("Yuzmege gidebilirsin. ");
        
    }
    
}
