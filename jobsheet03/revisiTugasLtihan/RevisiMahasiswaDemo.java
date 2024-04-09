package jobsheet03.revisiTugasLtihan;

import java.util.Scanner;

public class RevisiMahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // buat objek
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlMhs = input.nextInt();
        RevisiMahasiswa[] mahasiswa = new RevisiMahasiswa[jmlMhs];

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new RevisiMahasiswa();
            mahasiswa[i].inputScannerUser(mahasiswa);
        }
        // perulangan cetak data mahasiswa
        for (int j = 0; j < mahasiswa.length; j++) {
            System.out.println("Mahasiswa ke-" + (j+1));
            mahasiswa[j].cetakData(mahasiswa);
        }
        RevisiMahasiswa totalIpkReveal = new RevisiMahasiswa();
        totalIpkReveal.rataIpkMhs(mahasiswa);
    }
}
