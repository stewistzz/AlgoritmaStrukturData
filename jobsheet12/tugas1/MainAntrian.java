package jobsheet12.tugas1;

import java.util.Scanner;

public class MainAntrian {
    public static void daftarMenuVaksin() {
        System.out.println("+++++++++++++++++++++++++++++++++++ ");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA 08 ");
        System.out.println("+++++++++++++++++++++++++++++++++++ ");
        System.out.println();
        System.out.println("1. Tammbah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++++++ ");
    }
    public static void main(String[] args) throws Exception {
        Scanner input08 = new Scanner(System.in);

        DoubleLinkedListAntrian pasien = new DoubleLinkedListAntrian();

        
        int pilihMenu;
        System.out.print("Masukkan pilihan menu anda : ");
        
        do {
            daftarMenuVaksin();
            pilihMenu = input08.nextInt();
            switch (pilihMenu) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Masukkan data pnenerima vaksinasi");
                    System.out.println("=================================");
                    System.out.print("Masukkan nomor antrian\t: ");
                    int nomorAntri = input08.nextInt();
                    System.out.print("Masukkan nama penerima\t: ");
                    String namaPenerima = input08.next();
                    // buat object
                    penerimaVaksin p = new penerimaVaksin(nomorAntri, namaPenerima);
                    pasien.addLastVaksin(p);
                    break;
                case 2: 
                    penerimaVaksin hapusPenerima = pasien.getFirst();
                    System.out.println(hapusPenerima.nama + " telah selesain divaksinasi.");
                    pasien.removeFirstVaksin();
                    break;
                case 3:
                    System.out.println("======Daftar Antrian Vaksin======");
                    pasien.printVaksin();
                    System.out.print("Sisa antrian adalah\t: " + pasien.sizeVaksin());
                    System.out.println();
                    break;
                case 4: 
                    return;
            }
        } while (pilihMenu == 1 || pilihMenu == 2 || pilihMenu == 3 || pilihMenu == 4);
    }
}
