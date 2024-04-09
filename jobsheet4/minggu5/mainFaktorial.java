package jobsheet4.minggu5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // komunikasi dengan user untuk menginputkan jumlah angka yang akan dicari nilai
        // faktorialnya
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = input.nextInt();

        // Buat Array of Objek pada fungsi main
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < fk.length; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = input.nextInt();
        }

        // // cetak array brute force
        // System.out.println("===========================================");
        // System.out.println("Hasil faktorial dengan brute force");
        // for (int i = 0; i < elemen; i++) {
        // System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " +
        // fk[i].faktorialBF(fk[i].nilai));
        // }

        // perulangan lain pada brute force
        System.out.println("===========================================");
        System.out.println("Hasil faktorial dengan brute force");
        long mulaiWaktuBF = System.nanoTime();
        int x = 0;
        while (x < elemen) {
            System.out.println("Faktorial dari nilai " + fk[x].nilai + " adalah : " + fk[x].faktorialBF(fk[x].nilai));
            // perhitungan waktu
            x++;
        }
        long akhirWaktuBF = System.nanoTime();
        long timeElapsedBF = akhirWaktuBF - mulaiWaktuBF;
        System.out
                .println("Waktu eksekusi Brute Force (n = " + elemen + "): " + timeElapsedBF + " nanoseconds");
        System.out.println("===========================================");

        
        // cetak array brute force
        System.out.println("===========================================");
        System.out.println("Hasil faktorial dengan divide conquer");
        // menambahkan waktu
        long mulaiWaktuDC = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        // perhitungan waktu
        long akhirWaktuDC = System.nanoTime();
        long timeElapsedDC = akhirWaktuDC - mulaiWaktuDC;
        System.out
                .println("Waktu eksekusi Brute Force (n = " + elemen + "): " + timeElapsedDC + " nanoseconds");
        System.out.println("===========================================");

    }
}
