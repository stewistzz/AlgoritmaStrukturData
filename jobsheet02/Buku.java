package jobsheet02;

public class Buku {
    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;

    
    Buku(String nm, String pg, String pb, int hs, int jml) {
        nama = nm;
        pengarang = pg;
        penerbit = pb;
        hargaSatuan = hs;
        jumlah = jml;
    }
    
    // method hitung harga
    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    // method untuk menghitungDiskon
    int hitungDiskon() {
        int hargatotal = hitungHargaTotal();
        int diskon = 0;
        if (hargatotal > 100000) {
            diskon = (int) (hargatotal * 0.1);
        } else if(hargatotal >= 50000 && hargatotal < 100000) {
            diskon = (int) (hargatotal * 0.05);
        } else {
            diskon = hargatotal * hargatotal;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        int hargatotal = hitungHargaTotal();
        int Diskon = hitungDiskon();
        return hargatotal - Diskon;
    }

    void tampilDataBUku() {
        System.out.println("Judul Buku : " + nama);
        System.out.println("pengarang Buku : " + pengarang);
        System.out.println("Penerbit Buku : " + penerbit);
        System.out.println("harga Satuan : " + hargaSatuan);
        System.out.println("Jumlah Buku : " + jumlah);
        System.out.println("harga total buku : " + hitungHargaTotal());
        System.out.println("pengurangan diskon : " + hitungDiskon());
        System.out.println("Harga yang dibayar : " + hitungHargaBayar());
    }



}
