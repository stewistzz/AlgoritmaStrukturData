package Praktikum07;

import java.util.Scanner;

import Praktikum07.Tugas.StackStruckBelanja;

public class StackPakaianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian stk = new StackPakaian(20);
        // scanner

        while (true) {
            // menu untuk push, pop, peek, print
            System.out.println("Operasi pada menu stack : ");
            System.out.println("=========================================");
            System.out.println("1. push (menambahkan data) : ");
            System.out.println("2. pop (ambil data paling atas)");
            System.out.println("3. peek (memeriksa elemen paling atas)");
            System.out.println("4. print (mencetak semua stack)");
            System.out.println("5. Tampilkan urutan harga dari yang tertinggi");
            System.out.println("6. exit");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    pushPakaian(stk);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5: 
                    stk.getMaxPakaian();
                    break;
                default:
                    System.exit(0); // Keluar dari program
                    break;
            }
        }

        // public void pushPakaian(StackPakaian stk)
        // {
        // char pilih;
        // do {
        // System.out.print("jenis\t: ");
        // String jenis = sc.nextLine();
        // System.out.print("warna\t: ");
        // String warna = sc.nextLine();
        // System.out.print("merk\t: ");
        // String merk = sc.nextLine();
        // System.out.print("ukuran\t: ");
        // String ukuran = sc.nextLine();
        // System.out.print("harga\t: ");
        // double harga = sc.nextDouble();

        // Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
        // System.out.println("apakah anda akan menambahkan data baru ke stack?(y/n) :
        // ");

        // pilih = sc.next().charAt(0);
        // sc.nextLine();
        // stk.push(p);
        // } while (pilih != 0);

        // }

    }

    public static void pushPakaian(StackPakaian stk) {
        char pilih;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("jenis\t: ");
            String jenis = sc.nextLine();
            System.out.print("warna\t: ");
            String warna = sc.nextLine();
            System.out.print("merk\t: ");
            String merk = sc.nextLine();
            System.out.print("ukuran\t: ");
            String ukuran = sc.nextLine();
            System.out.print("harga\t: ");
            double harga = sc.nextDouble();
            sc.nextLine(); // Konsumsi newline yang tidak terbaca oleh nextDouble()

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            stk.push(p);

            System.out.println("Apakah Anda ingin menambahkan data baru ke stack? (y/n)");
            pilih = sc.next().charAt(0);
            sc.nextLine(); // Konsumsi newline setelah membaca char
        } while (pilih == 'y');
    }

   
}
