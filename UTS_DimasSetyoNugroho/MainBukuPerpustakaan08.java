// 08_Dimas Setyo Nugroho
// SIB-1C
package UTS_DimasSetyoNugroho;

import java.util.Scanner;

public class MainBukuPerpustakaan08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // objeck untuk sitem perpustakaan
        SistemPerpustakaan08 list = new SistemPerpustakaan08();

        // biiin object dari buku08
        Buku08 buku1 = new Buku08("Angkasa", "Soehardjo", "8175257", 1);
        Buku08 buku2 = new Buku08("Keuangan", "Nick William", "8175265", 8);
        Buku08 buku3 = new Buku08("BelajarBahasa", "Soewandi", "8175271", 5);
        Buku08 buku4 = new Buku08("FisikaQuantum", "Robert Einstein", "8175287", 4);
        Buku08 buku5 = new Buku08("MatematikaDasar", "Jerome Polin", "8175294", 9);

        list.tambahDataBuku(buku1);
        list.tambahDataBuku(buku2);
        list.tambahDataBuku(buku3);
        list.tambahDataBuku(buku4);
        list.tambahDataBuku(buku5);
        // pilihan menu
        while (true) {
            // menu untuk push, pop, peek, print
            System.out.println("Operasi pada menu stack : ");
            System.out.println("=========================================");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Peminjaman buku");
            System.out.println("3. Menurutkan Data Buku(stok)");
            System.out.println("4. Mencari buku");
            System.out.println("5. Tampilkan seluruh data buku");
            System.out.println("6. cek Buku");
            System.out.println("7. exit");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("--------------------------------- Data Buku Perpsatakaan --------------------------------------");
                    list.tampilAll();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Pilih judul buku yang dipinjam");
                    System.out.print("Masukkan judul buku\t: ");
                    String inputJudul = sc.nextLine();
                    list.pinjamBuku(inputJudul);
                    System.out.println();
                    break;
                case 3:
                    // urutan buku dari stok terkecil
                    System.out.println("======================= Urutan Buku Sesuai Stock =======================");
                    list.urutBukuStok();
                    list.tampilAll();
                    break;
                case 4:
                    System.out.println("========================= Pencarian buku =========================");
                    System.out.print("Masukkan Judul Buku\t: ");
                    String judulInput = sc.nextLine();
                    int posisi = list.cariBukuJudul(judulInput);
                    list.tampilPosisiBuku(judulInput, posisi);
                    list.tampilDataBUku(pilihan, posisi);
                    System.out.println();
                    break;
                case 5:
                    // menampilkan total data buku
                    System.out.println("========================= tampil total data buku =========================");
                    list.tampilAll();
                    System.out.println();
                    break;
                case 6:
                    // menampilkan data buku yang stocknya 0
                    System.out.println("========================= tampil buku stock 0 =========================");
                    list.tampilStockBuku();
                    System.out.println();
                    break;
                default:
                    System.exit(0); // Keluar dari program
                    break;
            }
        }

    }
}
