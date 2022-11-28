import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fiyat, kdv18, kdv8, kdvliFiyat;
        kdv18 = 0.18;
        kdv8 = 0.08;

        System.out.print("fiyatı giriniz:");
        fiyat = scanner.nextInt();

        if (fiyat <= 0) {
            System.out.println("Fİyat 0'dan büyük olmalı");
        } else if (fiyat < 1000) {
            kdvliFiyat = fiyat + (fiyat * kdv18);
            System.out.println("KDV'siz Fiyat: " + fiyat);
            System.out.println("KDV Oranı: %18");
            System.out.println("KDV Tutarı: " + (fiyat * kdv18));
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        } else {
            kdvliFiyat = fiyat + (fiyat * kdv8);
            System.out.println("KDV'siz Fiyat: " + fiyat);
            System.out.println("KDV Oranı: %8");
            System.out.println("KDV Tutarı: " + (fiyat * kdv8));
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        }
    }
}