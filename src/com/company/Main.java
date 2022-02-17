package com.company;

import java.util.Scanner;

public class Main {
    public static int cikarma (int a , int b ){

       return (a - b);
    }
    public static double bolme (int a , int b ){

        return ((double) a/b);
    }
    public static int toplama (int a , int b){

        return (a +b);
    }
    public static int toplama (int a , int b, int c ){

        return (a + b + c );
    }
    public static int carpma (int a , int b){

        return (a * b);
    }
    public static int carpma (int a , int b , int c) {

        return (a * b * c);
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	String islemler = "1. Toplama İşlemi\n"
                      +"2. Çıkarma İşlemi\n"
                      +"3. Çarpma İşlemi\n"
                      +"4. Bölme İşlemi\n"
                      +"5. Çıkış İçin 'q'a basınız...";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while (true){

            System.out.println("İşlemi Seçiniz...");
            String islem= scanner. nextLine();


            if (islem.equals("q")){

                System.out.println("Programdan Çıkış Yapılıyor...");

                break;
            }
            else if (islem.equals("1")){

                System.out.println("Kaç değer toplayacaksınız? (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi==2){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İki sayının toplamları = " + toplama(a,b));
                }
                else if (kacsayi==3){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Üç sayının toplamları = " + toplama(a,b,c));


                }
                else{

                    System.out.println("Bu işlem için uygun metod bulunmamaktadır..");
                }
            }
            else if (islem.equals("2")) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("Girilen sayıların farkı = " + cikarma(a, b));
            }
            else if (islem.equals("3")){

                System.out.println("Kaç değeri çarpacaksınız? (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi==2){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İki sayının çarpımları = " + carpma(a,b));
                }
                else if (kacsayi==3){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Üç sayının çarpımları = " + carpma(a,b,c));
            }

        }
        else if (islem.equals("4")){
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("İki sayının bölümünün sonucu = " + bolme(a,b));

            }
        else {

                System.out.println("Hatalı işlem yaptınız...");
            }






    }


   }
}
