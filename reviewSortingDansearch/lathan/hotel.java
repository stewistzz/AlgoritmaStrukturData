package reviewSortingDansearch.lathan;

public class hotel {
    String nama, kota;
    int harga;
    byte bintang;

    // constructor
    hotel() {

    }
    // contstructor parameter
    hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    // method tampul
    void tampilHotel() {
        System.out.println("nama hotel\t: " + nama);
        System.out.println("kota hotel\t: " + kota);
        System.out.println("harga hotel\t: " + harga);
        System.out.println("bintang hotel\t: " + bintang);
    }

}
