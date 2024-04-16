package reviewSortingDansearch.latihanSearch;

import java.util.Scanner;

public class MainMhs {
    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
        Scanner String = new Scanner(System.in);

        // buat objek untuk akses pencarianMhs
        pencarianMhs cari = new pencarianMhs();

        int jumlah = 2;

        System.out.println("Masukkan data mahasiswa");
        System.out.println("=======================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nim\t : ");
            int nim = data.nextInt();
            System.out.print("Masukkan nama\t : ");
            String nama = String.nextLine();
            System.out.print("Masukkan umur\t : ");
            int umur = data.nextInt();
            System.out.print("Masukkan ipk\t : ");
            double ipk = data.nextDouble();

            System.out.println("------------------------------------");
            // object
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            cari.tambahMhs(m);
        }
        System.out.println("======================================");

        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("data keseluruhan mahasiswa : ");
        System.out.println("---------------------------------");
        cari.tampilDataMhs();

        // pencarian mahasiswa
        System.out.println("=================================");
        System.out.println("Pencarian mahasiswa : ");
        System.out.println("=================================");

        System.out.println("pencarian data");
        System.out.print("Masukkan nim mahasiswa dari daftar yang ingin dicari : ");
        int cariNim = data.nextInt();

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Menggunakan sequential search : ");
        int posisi = cari.findSequentialSearch(cariNim);

        System.out.println("----------------------------");
        System.out.println("tampilkan posisi : ");
        cari.tampilPosisi(cariNim, posisi);

        System.out.println("--------------------------------");
        System.out.println("Tampilkan data : ");
        cari.tampilData(cariNim, posisi);
        System.out.println("-------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++");



        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Menggunakan binary search : ");
        posisi = cari.binarySearchMhs(cariNim, 0, jumlah);

        System.out.println("----------------------------");
        System.out.println("tampilkan posisi : ");
        cari.tampilPosisi(cariNim, posisi);

        System.out.println("--------------------------------");
        System.out.println("Tampilkan data : ");
        cari.tampilData(cariNim, posisi);
        System.out.println("-------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++");


        System.out.println("---------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cariNama = String.nextLine();


        // panggil main untuk method binary algorithm
        System.out.println("======================================");
        System.out.println("Menggunakan Binary Search");
        posisi = cari.FindBinarySearchNama(cariNama, 0, jumlah - 1, 0);
        cari.tampilPosisiNama(cariNama, posisi);
        cari.tampilDataNama(cariNama, posisi);
    }
}
