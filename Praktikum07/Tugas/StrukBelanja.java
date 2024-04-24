package Praktikum07.Tugas;

public class StrukBelanja {
    // atribut struk
    String TanggalPembelian;
    int NomorTransaksi, jumlahBeli, TotalBayar;
    

    // constructor
    StrukBelanja() {

    }

    // struktur parameter
    StrukBelanja(int nt, int jb, int tb, String tp) {
        NomorTransaksi = nt;
        jumlahBeli = jb;
        TotalBayar = tb;
        TanggalPembelian = tp;
    }
}