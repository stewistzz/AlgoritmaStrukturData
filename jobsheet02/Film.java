package jobsheet02;

public class Film {
    // atribut dari class film
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;

    // membuat constructor
    Film() { // tanpa parameter

    }
    Film(String jd, String gr, String rt, int jt, int ht) { // dengan parameter
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = ht;
    }

    // mtehod dari class film
    void tampilFilm() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Genre Film : " + genre);
        System.out.println("Rate film : " + rate);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Harga Tiket : " + hargaTiket);
    }

    void tambahTiket(int n) {
        jumlahTiket += n; 
    }

    void kurangTiket(int n) {
        if (jumlahTiket > 0) {
            jumlahTiket -= n;
        } else {
            System.out.println("Tiket sudah habis");
        }
    }

    int totalRevenue(int jumlah) {
        return jumlah * hargaTiket;
    }
}