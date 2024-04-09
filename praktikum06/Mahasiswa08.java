package praktikum06;

public class Mahasiswa08 {
    int Nim, umur;
    String Nama;
    double Ipk;

    // constructor
    Mahasiswa08() {

    }
    // constructor berparameter
    Mahasiswa08(int Nim, String Nama, int umur, double Ipk) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.umur = umur;
        this.Ipk = Ipk;
    }
    // method tampil
    void tampil() {
        System.out.println("Nim\t: " + Nim);
        System.out.println("Nama\t: " + Nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("Ip  \t: " + Ipk);
    }
}
