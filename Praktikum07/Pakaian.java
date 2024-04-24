package Praktikum07;

public class Pakaian
{
    String jenis, warna, merk, ukuran;
    double harga;
    

    Pakaian(String jenis, String warna, String merk, String ukuran, double harga)
    {
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    // tambahkan method tampil
    // void tampilPakaian()
    // {
    //     System.out.println("Jenis pakaian\t: ");
    //     System.out.println(("Warna pakaian\t: "));
    //     System.out.println("Merek pakaian\t: ");
    //     System.out.println("Ukuran pakaian ");
    // }
}