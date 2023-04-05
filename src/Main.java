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
        
    }
}