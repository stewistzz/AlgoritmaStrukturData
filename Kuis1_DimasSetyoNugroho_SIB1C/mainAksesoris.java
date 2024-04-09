package Kuis1_DimasSetyoNugroho_SIB1C;

import java.util.Scanner;

public class mainAksesoris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aksesoris[] aksesoris = new Aksesoris[5];
        // Input data aksesoris dari pengguna
        for (int i = 0; i < aksesoris.length; i++) {
            System.out.println("Masukkan data Aksesoris ke-" + (i + 1));
            aksesoris[i] = new Aksesoris();
            aksesoris[i].inputAksesoris();
        }
        // perulangan tampil aksesoris
        for (int i = 0; i < aksesoris.length; i++) {
            System.out.println("========================");
            aksesoris[i].tampil();
            System.out.println("========================");
        }

        // cetak total penjualaan yang didapat
        int totalPenjualan = 0;
        for (Aksesoris a : aksesoris) {
            totalPenjualan += a.hitungTotalPenjualan();
        }
        System.out.println("Total Penjualan: " + totalPenjualan);


        // cetak stock update
        for (int i = 0; i < aksesoris.length; i++) {
            aksesoris[i].cekStock();
        }
    }
}