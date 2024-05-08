package JOBSHEET8.praktikum2;

import java.util.Scanner;

public class NasabahMain {

    // method menu
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int Jumlah = sc.nextInt();
        QueueNasabah antri = new QueueNasabah(Jumlah);

        int pilih;
        // perulangan untuk menu
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No. Rekening\t: ");
                    String noRek = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat\t: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur\t: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Saldo\t: ");
                    double saldo = sc.nextDouble();
                    
                    // buat object nb dari class nasabah
                    Nasabah nb = new Nasabah(noRek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.noRek) && !" ".equals(data.nama) && !" ".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar : " + data.noRek + " " + data.nama + " " + data.alamat + " " + data.umur + " "
                                + data.saldo);
                    }
                    break;
                case 3:
                    antri.peekNasabah();
                    break;
                case 4:
                    antri.printNasabah();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
