package praktikum06;

import java.util.Scanner;

import jobsheet5.mainMahasiswa;

public class MahasiswaMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Msukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        // pencarian dta object
        PencarianMahasiswa08 data = new PencarianMahasiswa08(jumMhs);

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan Data Mahwasiswa secara urut dari nim teks");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Nim\t: ");
            int Nim = s.nextInt();
            System.out.print("Nama\t: ");
            String Nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("Ipk\t: ");
            double Ipk = s.nextDouble();

            Mahasiswa08 m = new Mahasiswa08(Nim, Nama, umur, Ipk);
            data.tambahMhs(m);
        }

        System.out.println("=====================================");
        System.out.println("data keseluruhan mahasiswa : ");
        System.out.println("=====================================");
        data.tampil();

        // System.out.println("---------------------------------------------");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        // System.out.print("NIM : ");
        // int cari = s.nextInt();

        // System.out.println();
        // System.out.println("menggunakan sequential Search");
        // int posisi = data.findSearch(cari);

        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        // // panggil main untuk method binary algorithm
        // System.out.println("======================================");
        // System.out.println("Menggunakan Binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        System.out.println("---------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cariNama = sl.nextLine();


        // panggil main untuk method binary algorithm
        System.out.println("======================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearchNama(cariNama, 0, jumMhs - 1, 0);
        data.tampilPosisiNama(cariNama, posisi);
        data.tampilDataNama(cariNama, posisi);
    }
}