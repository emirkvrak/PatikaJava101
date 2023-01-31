package burcbulanprogram;

import java.util.Scanner;


public class BurcBulanProgram {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        String month;
        int day;
        
        System.out.println("Dogdugnuz ay tarihi : ");
        month = input.next();
        System.out.println("Dogdugunuz gun tarihi : ");
        day = input.nextInt();
        
        if (month.equals("1")) {
            if (day < 22) {
               System.out.println("Ogalak Burcu");
            }else
                System.out.println("Kova Burcu");
        }else if (month.equals("2")) {
            if (day < 20) {
               System.out.println("Kova Burcu");
            }else
                System.out.println("Balik Burcu");
        }else if (month.equals("3")) {
            if (day < 21) {
               System.out.println("Balik Burcu");
            }else
                System.out.println("Koc Burcu");
        }else if (month.equals("4")) {
            if (day < 21) {
               System.out.println("Koc Burcu");
            }else
                System.out.println("Boga Burcu");
        }else if (month.equals("5")) {
            if (day < 22) {
               System.out.println("Boga Burcu");
            }else
                System.out.println("Ikizler Burcu");
        }else if (month.equals("6")) {
            if (day < 23) {
               System.out.println("Ikizler Burcu");
            }else
                System.out.println("Yengec Burcu");
        }else if (month.equals("7")) {
            if (day < 23) {
               System.out.println("Yengec Burcu");
            }else
                System.out.println("Aslan Burcu");
        }else if (month.equals("8")) {
            if (day < 23) {
               System.out.println("Aslan Burcu");
            }else
                System.out.println("Basak Burcu");
        }else if (month.equals("9")) {
            if (day < 23) {
               System.out.println("Basak Burcu");
            }else
                System.out.println("Terazi Burcu");
        }else if (month.equals("10")) {
            if (day < 23) {
               System.out.println("Terazi Burcu");
            }else
                System.out.println("Akrep Burcu");
        }else if (month.equals("11")) {
            if (day < 22) {
               System.out.println("Akrep Burcu");
            }else
                System.out.println("Yay Burcu");
        }else if (month.equals("12")) {
            if (day < 22) {
               System.out.println("Yay Burcu");
            }else
                System.out.println("Oglak Burcu");
        }
    
    }
    
}
