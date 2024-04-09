package jobsheet03.revisiTugasLtihan;

import java.util.Scanner;

public class RevisiMahasiswa {
    String nama, nim, kelamin;
    double ipk;

    // method untuk scanner
    void inputScannerUser(RevisiMahasiswa[] mahasiswa) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nama mahasiswa : ");
            nama = input.next();
            System.out.print("Masukkan Nim Mahasiswa : ");
            nim = input.next();
            System.out.print("Masukkan jenis kelamin Mhs : ");
            kelamin = input.next();
            System.out.print("Masukkan nilai IPK : ");
            ipk = input.nextDouble();
            System.out.println();
    }

    // method menampilkan mahasiswa
    void cetakData(RevisiMahasiswa[] mahasiswa) {
        System.out.println("nama mahasiswa : " + nama + "\nnim mahasiswa : " + nim + "\nJanis Kelamin : " + kelamin + "\nIpk Mahasiswa : " + ipk);
        System.out.println("============================");
        
    }
    void rataIpkMhs(RevisiMahasiswa[] mahasiswa) {
        // TODO Auto-generated method stub
        double IpkMhs = 0;
        double IpkTotal = 0;
        //double rataIpk = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            IpkMhs += mahasiswa[i].ipk;
            IpkTotal = IpkMhs / mahasiswa.length;
        }
        System.out.println("total ipk mahasiswa : " +IpkTotal);
    }

}
