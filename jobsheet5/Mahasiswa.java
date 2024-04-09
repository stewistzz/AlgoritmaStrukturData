package jobsheet5;

// method daftarmahasiswaberprestasi ini berfungsi untuk melakukan operasi umum dalam menangkap data yang diinputkan didalam main
public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    // constructor
    Mahasiswa() {
    }

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    // tampil method
    void tampil() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Thn Masuk\t: " + thnMasuk);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Ipk\t\t: " + ipk);
    }

}
