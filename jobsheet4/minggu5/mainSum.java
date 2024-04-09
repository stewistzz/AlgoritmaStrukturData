package jobsheet4.minggu5;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {

        // scanner 04
        Scanner input = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("program menghitung keuntungan total(satuan juta. Misal 5.9)");

        // banyak perusahaan
        System.out.print("masukkan jumlah perusahaan : ");
        int jumlahPerusahaan = input.nextInt();

        // buat array untuk simpan companies
        sum[] perusahaan = new sum[jumlahPerusahaan]; // buat array untuk menyimpan banyak perusahaan

        for (int i = 0; i < jumlahPerusahaan; i++) { // lakukan perulangan dengan kondisi i < jumlahPerusahaan yang
                                                     // diinput
            System.out.println("==========================================================");
            System.out.println("Persuahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = input.nextInt(); // variabel elm untuk menjadi isian array perusahaan per indeks i nya
            // membuat object
            // sum sm = new sum(elm);
            perusahaan[i] = new sum(elm); // memiliki isisan didalam array perusahaan per indeks berupa elm untuk jumlah
                                          // bulan

            System.out.println("===========================================================");
            for (int j = 0; j < perusahaan[i].element; j++) { // perulangan dengan kondisi perusahaan per indeks untk
                                                              // setiap element
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                perusahaan[i].keuntungan[j] = input.nextDouble(); // menginputkan keuntungan per bulan (secara tidak
                                                                  // langsung kita memiliki array 2 dimensi)
            }
        }

        // cetak hasil bf dan dc
        System.out.println("===========================================================");
        for (int j = 0; j < jumlahPerusahaan; j++) {
            System.out.println("+\tPerusahaan ke-" + (j + 1));
            System.out.println("+\tAlgoritms Brute Force");
            System.out.println("+\tIotal keumcungan perusahaan selama " + perusahaan[j].element + " bulan adalah = "
                    + String.format("%.2f", perusahaan[j].totalBF(perusahaan[j].keuntungan)));
            System.out.println("+");
            System.out.println("+\tAlgoritms Divide Conquer");
            System.out.println(
                    "+\tIotal keumcungan perusahaan selama " + perusahaan[j].element + " bulan adalah = " + String.format(
                            "%.2f", perusahaan[j].totalDC(perusahaan[j].keuntungan, 0, perusahaan[j].element - 1)));
            System.out.println("===========================================================");
        }
    }
}
