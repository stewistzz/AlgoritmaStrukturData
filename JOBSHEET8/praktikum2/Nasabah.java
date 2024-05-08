package JOBSHEET8.praktikum2;

public class Nasabah {
    // atribut
    String noRek, nama, alamat;
    int umur;
    double saldo;

    // constructor
    Nasabah()
    {

    }
    
    Nasabah(String noRek, String nama, String alamat, int umur, double saldo)
    {  
        this.noRek = noRek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}
