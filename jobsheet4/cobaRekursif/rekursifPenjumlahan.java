package jobsheet4.cobaRekursif;

import java.util.Scanner;

public class rekursifPenjumlahan {
    public static void main(String[] args) {
        System.out.println("jalo");

        Scanner input = new Scanner(System.in);
        // fungsi rekursif penjumlahan berulang
        System.out.print("masukan nilai = ");
        int nilai = input.nextInt();

        // penjumlahan(nilai);
        int jumlah = penjumlahan(nilai);
        System.out.println(jumlah);

    }

    // method penjumlahhan
    static int penjumlahan(int parameter) {
        // print
        System.out.println(parameter);

        // logic
        if (parameter == 0) {
            return parameter;
        }
        return parameter + penjumlahan(parameter - 1);  // terjadi error karena nilai terus berkurang tanpa batasan(infinite loop). maka perlu diberikan kondisi
        
    }
}
