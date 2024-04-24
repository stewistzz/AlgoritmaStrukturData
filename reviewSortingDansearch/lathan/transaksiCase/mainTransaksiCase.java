package reviewSortingDansearch.lathan.transaksiCase;

import java.util.Scanner;

public class mainTransaksiCase {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        Rekening inp = new Rekening();

        Rekening data1 = new Rekening("160309273084","Wallace","Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");
        Rekening data2 = new Rekening("160309273086","Stoney","Chase Stoner","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");
        Rekening data3 = new Rekening("160309273083","Mark","Chase Angelo","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");

        Rekening.tambah(data1);
        Rekening.tambah(data2);
        Rekening.tambah(data3);

        Rekening.tampilAll();

        // setelah pengurutan
        Rekening.mengurutkanNamaRekenning();
        Rekening.tampilAll();
    }
}
