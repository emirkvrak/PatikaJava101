package kullanicigirisiprogrami;

import java.util.Scanner;


public class KullaniciGirisiProgrami {

    
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        
        String user1 = "patika", password1 = "java123";
        String userName,password;
        String islem,ypassword;
        
        System.out.println("Kullanici adiniz : ");
        userName = input.nextLine();
        
        System.out.println("Sifreniz : ");
        password = input.nextLine();
        
        if (userName.equals(user1) && password.equals(password1)) {
            System.out.println("Giris yaptiniz :)");
        }else{
            System.out.println("Hatali giris yaptiniz sifrenizi degistirmek istermisiniz (Y/N) : ");
            islem = input.nextLine();
            
            if ((islem.equals("Y")) || (islem.equals("y"))) {
                
                while(true){
                    System.out.println("Yeni sifreni gir : ");
                    ypassword = input.nextLine();
                    
                    if (password1.equals(ypassword)) {
                        System.out.println("Sifre olustirilamadi !!!, lütfen baska sifre giriniz");
                    }else{
                        System.out.println("Sifre olusturuldu :)");
                        break;
                    }
                }    
            }else
                System.out.println("Yanlis sifre cikis yapildi :(");
        }
   
             
        
        
    }
    
}
