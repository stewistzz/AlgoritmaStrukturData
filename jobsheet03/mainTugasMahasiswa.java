package jobsheet03;

import java.util.Scanner;

public class mainTugasMahasiswa {
    public static void main(String[] args) {
        
        // data yang diperlukan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : "); 
        int jumlahMHS = input.nextInt(); 
         
        String kelaminMhs, namaMhs, Nim;
        double ipkMhs, rataIpk =0;
        

        tugasMahasiswa[] arrayLaporanMhs = new tugasMahasiswa[jumlahMHS];

        // perulangan object
        for (int i = 0; i < arrayLaporanMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama Mahasiswa: ");
            namaMhs = input.next();
            System.out.print("Masukkan NIM mahasiswa: ");
            Nim = input.next();
            System.out.print("Masukkan jenis kelamin: ");
            kelaminMhs = input.next();
            System.out.print("Masukkan IPK MHS: ");
            ipkMhs = input.nextDouble();

            arrayLaporanMhs[i] = new tugasMahasiswa(namaMhs, Nim, kelaminMhs, ipkMhs);

             rataIpk += ipkMhs;
        }

        for (tugasMahasiswa tugas : arrayLaporanMhs) {
            tugas.cetakLaporan(arrayLaporanMhs);
        }
        // rata-ratai ipk
        double nilaiIpk = rataIpk / jumlahMHS;
        System.out.println("Rata-rata IPK mahasiswa: " + nilaiIpk);

        // rataIpk = hitungRataIpkMhs(arrayLaporanMhs);
        // System.out.println("Rata-rata IPK mahasiswa: " + rataIpk);
    }
}
