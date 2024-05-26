package Kuis02_Dimas08;

import java.util.Scanner;

import Praktikum07.Pakaian;
import Praktikum07.StackPakaian;

public class Main08 {
    static int harga08;
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        AntrianLinkedList_08 stk = new AntrianLinkedList_08();
        // scanner

        while (true) {
            // menu untuk push, pop, peek, print
            System.out.println("Menu Resto ");
            System.out.println("=========================================");
            System.out.println("1. push (Tambahkan Antrian)");
            System.out.println("2. print (Cetak Antrian)");
            System.out.println("3. Clear(Hapus Antrian)");
            System.out.println("4. Hitung Pendapatan(Total)");
            System.out.println("5. exit");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc08.nextInt();
            sc08.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = sc08.nextInt();
                    sc08.nextLine();
                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = sc08.nextLine();
                    System.out.print("No HP: ");
                    String noHp = sc08.nextLine();

                    Pembeli_08 pembeli08 = new Pembeli_08(namaPembeli, noHp);
                    stk.tambahAntrian(pembeli08);

                    break;
                case 2:
                    stk.printAntrian();
                    break;
                case 3:
                    System.out.print("Nomor\t: ");
                    int nomorHapus08 = sc08.nextInt();
                    sc08.nextLine(); // Mengonsumsi karakter baris baru setelah nextInt()
                    System.out.print("Pesanan\t: ");
                    String Pesanan08 = sc08.nextLine();
                    System.out.print("Harga\t: ");
                    harga08 = sc08.nextInt();
                    sc08.nextLine();
                    System.out.println("|" + nomorHapus08 + "\t|" + Pesanan08 + "\t|" + harga08 + "\t|");
                    stk.hapusPesanan(nomorHapus08);
                    break;
                case 4:
                    stk.pendapatanResto08(harga08);
                    break;
                default:
                    System.exit(0); // Keluar dari program
                    break;
            }
        }
    }
}
