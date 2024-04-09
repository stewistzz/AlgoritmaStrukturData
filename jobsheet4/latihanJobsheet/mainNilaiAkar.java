package jobsheet4.latihanJobsheet;

import java.util.Scanner;

public class mainNilaiAkar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang anda ingin hitung akarnya : ");
        double angka = input.nextInt();

        nilaiAkar akar = new nilaiAkar();
        System.out.println("=================================================");
        System.out.println("nilai akar dengan metode brute force");
        System.out.println(angka + " adalah " + akar.akarBF(angka));

        System.out.println("=================================================");
        System.out.println("nilai akar dengan metode brute force");
        System.out.println(angka + " adalah " + akar.akarDC(angka, 0, angka));
    }
}
