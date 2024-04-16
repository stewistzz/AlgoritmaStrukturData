package reviewSortingDansearch.latihanSearch;

public class Mahasiswa {
    int nim, umur;
    String nama;
    double ipk;

    // consttructor tanpa parameter
    Mahasiswa() 
    {

    }

    // constructor berparameter
    Mahasiswa(int n, String m, int u, double i) 
    {
        nim = n;
        nama = m;
        umur = u;
        ipk = i;
    }

    // method tampil
    void tampilMhs() 
    {
        System.out.println("nim mahasiswa\t: " + nim);
        System.out.println("nama mahasiswa\t: " + nama);
        System.out.println("umur mahasiswa\t: " + umur);
        System.out.println("ipk mahasiswa\t: " + ipk);
    }

}
