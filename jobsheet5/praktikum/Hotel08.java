package jobsheet5.praktikum;

public class Hotel08 {
    String nama, kota;
    int harga;
    byte bintang;

    // constructor
    Hotel08() {}
    // constructor parameter
    Hotel08(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void cetakData(){
        System.out.println("Nama hotel : " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga : " + harga);
        System.out.println("Bintang : " + bintang);
    }
}
