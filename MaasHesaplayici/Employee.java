package maashesaplayici;


public class Employee {
    
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    
    //Vergi Hesabı:
    double tax(){
        double tax=0;
        if(this.salary<=1000){
            System.out.println("Vergi alinmiyor.");
            return 0;

        }
        else{
            tax=this.salary*0.03;
        }
        return tax;
    }
    
    //Bonusu hesaplaniyor:
    double bonus(){
        int bonus = 0;
        if(this.workHours>40){
            bonus += (workHours-40)*30;

        }
        return bonus;
    }
    
    //Çalışanın işe başlangıç yılına göre maaş artışı
    double raiseSalary(){
        int toplamYil=2021-this.hireYear;
        double zam=0;
        if (toplamYil<9){
            zam=this.salary*0.05;
        }
        else if (toplamYil>=9 && toplamYil<19){
            zam=this.salary*0.10;
        }
        else if (toplamYil>=19){
            zam=this.salary*0.15;
        }
        return zam;
    }
    
    
    public String toString(){
        
        String metin =
        "Adi \t\t\t\t : "+this.name+"\n"+
        "Maasi \t\t\t\t : "+this.salary+"\n"+
        "Calisma saati \t\t\t : "+this.workHours+"\n"+
        "Baslangic yili \t\t\t : "+this.hireYear+"\n"+
        "Vergi \t\t\t\t : "+tax()+"\n"+
        "Bonus \t\t\t\t : "+bonus()+"\n"+
        "Maas artisi \t\t\t : "+raiseSalary()+"\n"+       
        "Vergi+Bonuslar ile birlikte maas : "+(this.salary-tax()+bonus())+"\n"+ 
        "Toplam Maas \t\t\t : "+(this.salary+raiseSalary())+"\n";
        
        return metin; 

    }
}
