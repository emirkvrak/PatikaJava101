package maashesaplayici;

import java.util.Scanner;


public class MaasHesaplayici {

    
    public static void main(String[] args) {
        
        Employee employee =new Employee("Null",0,0,0);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ad ve soyad gir : ");
        employee.name = input.nextLine();
        System.out.println("Calisanin maasini gir : ");
        employee.salary = input.nextDouble();
        System.out.println("Haftalik calisma saati gir : ");
        employee.workHours = input.nextInt();
        System.out.println("İse baslangic yilini gir : ");
        employee.hireYear = input.nextInt();
        
        System.out.println(employee.toString());
        
    }
    
}
