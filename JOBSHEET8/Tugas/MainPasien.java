package JOBSHEET8.Tugas;

import java.util.Scanner;

public class MainPasien {
    // method menu
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. cek indeks nama");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int Jumlah = input.nextInt();
        QueuePasien antrian = new QueuePasien(Jumlah);

        int pilih;
        // perulangan untuk menu
        do {
            menu();
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama\t: ");
                    String nama = input.nextLine();
                    System.out.print("noId\t: ");
                    int noId = input.nextInt();
                    System.out.print("Kelamin(L/P)\t: ");
                    char jenisKelamin = input.next().charAt(0);
                    System.out.print("Umur\t: ");
                    int umur = input.nextInt();
                    // buat object nb dari class nasabah
                    Pasien p = new Pasien(nama, noId, jenisKelamin, umur);
                    input.nextLine();
                    antrian.Enqueue(p);
                    break;
                case 2:
                    Pasien data = antrian.Dequeue();
                    if (!"".equals(data.nama) && !" ".equals(data.noId) && !" ".equals(data.jenisKelamin)
                            && data.umur != 0) {
                        System.out.println(
                                "Antrian yang keluar : " + data.nama + " " + data.noId + " " + data.jenisKelamin + " "
                                        + data.umur);
                    }
                    break;
                case 3:
                    antrian.peekPasien();
                    break;
                case 4:
                    antrian.printPasien();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama yang ingin dicari\t: ");
                    String namaPasien = input.nextLine();
                    antrian.peekPosition(namaPasien);
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
