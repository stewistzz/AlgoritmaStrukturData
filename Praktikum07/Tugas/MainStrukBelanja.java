package Praktikum07.Tugas;

import java.util.Scanner;

public class MainStrukBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // object
        StackStruckBelanja struk = new StackStruckBelanja(20);

        while (true) {
            // menu untuk push, pop, peek, print
            System.out.println("Operasi pada menu stack : ");
            System.out.println("=========================================");
            System.out.println("1. push (menambahkan Struk Belanja) : ");
            System.out.println("2. pop (ambil data paling atas)");
            System.out.println("3. peek (memeriksa elemen paling atas)");
            System.out.println("4. print (mencetak semua struk)");
            System.out.println("5. Tampilkan kupon");
            System.out.println("6. exit");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    pushStruk(struk);
                    break;
                case 2:
                    struk.popStruk();
                    break;
                case 3:
                    struk.peekStruk();
                    break;
                case 4:
                    struk.printStruk();
                    break;
                case 5:
                    tukarKupon(struk);
                    break;
                default:
                    System.exit(0); // Keluar dari program
                    break;
            }
        }
    }

    // buat objek struk
    public static void pushStruk(StackStruckBelanja struk) {
        char pilih;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nomor Transaksi\t: ");
            int NomorTransaksi = sc.nextInt();
            System.out.print("jumlah pembelian\t: ");
            int jumlahBeli = sc.nextInt();
            System.out.print("Total bayar\t: ");
            int TotalBayar = sc.nextInt();
            System.out.print("Tanggal (dd/mm/yyyy) : ");
            String TanggalPembelian = sc.next();
            sc.nextLine(); // Konsumsi newline yang tidak terbaca oleh nextDouble()

            StrukBelanja p = new StrukBelanja(NomorTransaksi, jumlahBeli, TotalBayar, TanggalPembelian);
            struk.push(p);

            System.out.println("Apakah Anda ingin menambahkan data baru ke stack? (y/n)");
            pilih = sc.next().charAt(0);
            sc.nextLine(); // Konsumsi newline setelah membaca char
        } while (pilih == 'y');
    }

    // method untuk tukar kupon
    public static void tukarKupon(StackStruckBelanja struck) {
        System.out.println("data yang daimbil untuk 1 kupon : ");
        // perulangan untuk mengambil 5 data sekaligus untuk 1 kupon
        for (int i = 0; i < 5; i++) {
            struck.popStruk();
        }
        System.out.println();
        System.out.println("Data yang tersisa");
        struck.printStruk();
    }
}