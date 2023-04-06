import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Merhaba Etiya");
        System.out.println("1");
        // integer
        System.out.println(1);
        // değişkenler
        // operatörler
        // döngüler
        // karar yapıları

        // String => metinsel ifadeler
        // reusability
        // tip degiskenIsmi = başlangıçDeğeri


        String merhaba = "Merhaba Etiya, hoş geldiniz";
        System.out.println(merhaba);
        System.out.println(merhaba);
        System.out.println(merhaba);
        System.out.println(merhaba);

        // int,integer => tam sayı değerler
        int numberOfStudents = 26;
        System.out.println(numberOfStudents);

        // double,decimal,float => ondalıklı sayı
        double average = 10.5;
        System.out.println(average);

        // Operatörler
        // Matematiksel Operatörler
        System.out.println(numberOfStudents + 5 - 10 + (25 * 5));
        System.out.println(numberOfStudents - 5 + 60 + 25);
        System.out.println(average / 5);
        System.out.println(average * 5);
        // % => mod operatör
        System.out.println(numberOfStudents % 3);

        // bool, boolean => true - false
        boolean isVerified = false;

        boolean studentsNumberMoreThanTwenty = numberOfStudents > 20;
        // Operatörler -> Mantık Operatörleri
        System.out.println(numberOfStudents > 20);
        System.out.println(numberOfStudents < 20);
        System.out.println(numberOfStudents >= 20);
        System.out.println(numberOfStudents <= 20);

        System.out.println(numberOfStudents == 26);
        System.out.println(numberOfStudents != 26);


        String greetingsMessage = "Merhaba";
        String studentName = "Şura";

        // String Interpolation
        System.out.println(greetingsMessage + " " + studentName);

        // String Interpolation
        // Format
        String text = String.format("%s ortalama not: %s",greetingsMessage, average);
        System.out.println(text);

        // Karar Yapıları
        int ortalamaNot = 51; //DB'den okundu.
        int devamsizlik = 11;
        //scope

        //condition => şart
        // || => veya operatörü sağ veya solda bir adet true olması durumunda operatörüm true döndürür.
        if(ortalamaNot < 50 || devamsizlik > 10){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
        // && => and (ve) operatörü => iki şartın da true olma durumunu kontrol eder
        if(ortalamaNot > 80 && devamsizlik < 5){
            System.out.println("Pekiyi geçtiniz");
        }

        // true || false => true
        // false || true => true
        // false || false => false

        // true && false => false
        // false && true => false
        // true && true => true

        // switch-case yapısı

        // 0=Sipariş Alındı
        // 1=Hazırlanıyor
        // 2=Kargoda
        // 3=Teslim edildi
        int status = 5;

        switch(status)
        {
            case 0:
                System.out.println("Sipariş Alındı");
                break;
            case 1:
                System.out.println("Hazırlanıyor");
                break;
            case 2:
                System.out.println("Kargoda");
                break;
            case 3:
                System.out.println("Teslim edildi");
                break;
            default: // caselerin hiç birisi condition'ı sağlamadığında çalıştırılır.
                System.out.println("Hatalı sipariş durumu.");
                break;
        }


        // Döngüler
        // Iteration, Iterasyon
        // Collection

        // for, while
        // index
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        List<String> students = new ArrayList<>();
        students.add("Can Gire");
        students.add("Ahmet Çalık");
        students.add("İbrahim Yıldırım");

       /* for(int i=0; i<students.size(); i++){
            String student = students.get(i);
            System.out.println(student);
        } */

        for(String student:students){
            System.out.println(student);
        }
        int i = 0;
        while(i < 10) // Infinite Loop => Sonsuz Döngü
        {
            System.out.println(i);
            i = i+1;
        }

        // Infinite Loop
        /* while(true){
            System.out.println("Merhaba");
        } */

        // do-while
        System.out.println("**************");
        int sayi = 11;
        do{
            System.out.println(sayi);
            sayi += 1;
        }while(sayi < 10);

    }
}