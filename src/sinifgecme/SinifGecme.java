package sinifgecme;

import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Matematik Notunuzu Girin : ");
        double matematikNotGir = scanner.nextDouble();
        if(matematikNotGir<0 || matematikNotGir>100){
            System.out.println("Geçersiz Not! ");
            matematikNotGir = 0;
        }

        
        
        System.out.print("Lütfen Türkçe Notunuzu Girin : ");
        double turkceNotGir = scanner.nextDouble();        
        if(turkceNotGir<0 || turkceNotGir>100){
            System.out.println("Geçersiz Not! ");
            turkceNotGir = 0;
        }

        
        
        System.out.print("Lütfen Fizik Notunuzu Girin : ");
        double fizikNotGir = scanner.nextDouble();
        if(fizikNotGir<0 || fizikNotGir>100){
            System.out.println("Geçersiz Not! ");
            fizikNotGir = 0;
        }

        
        
        System.out.print("Lütfen Kimya Notunuzu Girin : ");
        double kimyaNotGir = scanner.nextDouble();
        if(kimyaNotGir<0 || kimyaNotGir>100){
            System.out.println("Geçersiz Not! ");
            kimyaNotGir = 0;
        }

        
        System.out.print("Lütfen Müzik Notunuzu Girin : ");
        double muzikNotGir = scanner.nextDouble();
        if(muzikNotGir<0 || muzikNotGir>100){
            System.out.println("Geçersiz Not! ");
            muzikNotGir = 0;
        }

        
        double ortalama = (matematikNotGir + turkceNotGir + fizikNotGir + kimyaNotGir + muzikNotGir) / 5;
        
        if(ortalama >= 55){
            System.out.println("Sınıfı Geçtiniz. Tebrikler... \n"
                    + "Ortalama : " + ortalama);
        }
        else{
            System.out.println("Sınıfı Geçemediniz. Malesef... \n"
                    + "Ortalama : " + ortalama);
        }

        
        
    }
    
}
