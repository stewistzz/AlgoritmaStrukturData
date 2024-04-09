package jobsheet4.minggu5;

import java.util.Scanner;

public class mainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // komunikasi dengan user untuk menginputkan jumlah angka yang akan dicari nilai
        // faktorialnya
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = input.nextInt();

        // pembuatan array
        pangkat[] png = new pangkat[elemen];

        // obuat object
        for (int i = 0; i < elemen; i++) {
            // png[i] = new pangkat();
            // System.out.print("Masukkan nnilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            // png[i].nilai = input.nextInt();
            // System.out.print("Masukkan pangkat ke-" + (i + 1) + " : ");
            // png[i].pangkat = input.nextInt();

            png[i] = new pangkat();
            System.out.print("Masukkan nnilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = input.nextInt();
            System.out.print("Masukkan pangkat ke-" + (i + 1) + " : ");
            int pangkat = input.nextInt();

            // constructor
            png[i] = new pangkat(nilai, pangkat);
        }


        // menu hitung pilihan brute force atau divide conquer
        System.out.println("===========================================");
        System.out.println("Pilih menu untuk menghitung : ");
        System.out.println("1. brute force");
        System.out.println("2. divide conquer");
        System.out.println("===========================================");

        System.out.print("input pilihan : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            
            // cetak array brute force
            System.out.println("===========================================");
            System.out.println("Hasil faktorial dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            System.out.println("===========================================");
        } else {

            // cetak array divide conquer
            System.out.println("===========================================");
            System.out.println("Hasil faktorial dengan divide conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            System.out.println("===========================================");
        }
    }
}
