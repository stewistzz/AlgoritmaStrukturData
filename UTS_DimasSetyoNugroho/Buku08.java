// 08_Dimas Setyo Nugroho
// SIB-1C
package UTS_DimasSetyoNugroho;

import jobsheet02.Buku;

public class Buku08 {
    // atribut buku
    String kodeISBN08, judulBuku08, pengarang08;
    int stok08;

    // constructor non-parameter
    Buku08(){}
    // constructor dengan parameter
    Buku08(String j, String p, String k, int s)
    {
        judulBuku08 = j;
        pengarang08 = p;
        kodeISBN08 = k;
        stok08 = s;
    }

    void tampilkanDataBuku()
    {
        System.out.println("| Judul Buku\t\t: " + judulBuku08);
        System.out.println("| Pengarang Buku\t: " + pengarang08);
        System.out.println("| Kode ISBN Buku\t: " + kodeISBN08);
        System.out.println("| Jumlah stok buku\t: " + stok08);
        
    }
}
