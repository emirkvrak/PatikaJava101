package ogrencibilgisistemi;


public class Student {
    
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matSozlu, int matYazili, int fizikSozlu, int fizikYazili, int kimyaSozlu, int kimyaYazili) {
        
        double sozluYuzde=0.20, yaziliYuzde=0.80;
        if (matSozlu>=0 && matSozlu<=100 && matYazili>=0 && matYazili<=100) {

            this.mat.note = (int) (matSozlu*sozluYuzde+matYazili*yaziliYuzde);

        }

        if (fizikSozlu>=0 && fizikSozlu<=100 && fizikYazili>=0 && fizikYazili<=100) {

            this.fizik.note = (int) (fizikSozlu*sozluYuzde+fizikYazili*yaziliYuzde);

        }

        if (kimyaSozlu>=0 && kimyaSozlu<=100 && kimyaYazili>=0 && kimyaYazili<=100) {

            this.kimya.note = (int) (kimyaSozlu*sozluYuzde+kimyaYazili*yaziliYuzde);

        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Sinifi : " + this.classes);
        System.out.println("Öğrenci numarası: "+ this.stuNo);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
    
}
