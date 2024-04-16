package reviewSortingDansearch.pbo;

public class bubble {
    String nama;
    int nim;
    double ipk;

    bubble() {

    }
    bubble(String n, int m, double i) {
        nama = n;
        nim = m;
        ipk = i;
    }

    // method menampilkan mahasiswa
    void tampilMhs() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("ipk : " + ipk);
    }

}
