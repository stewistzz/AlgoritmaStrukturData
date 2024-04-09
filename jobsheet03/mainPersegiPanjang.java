package jobsheet03;

import java.util.Scanner;

public class mainPersegiPanjang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int panjang, lebar, jumlahPersegiPanjang;
        // scanner untuk isi array persegi panjang
        System.out.print("Masukkan jumlah persegi : "); 
        jumlahPersegiPanjang = input.nextInt();

        persegiPanjang[] arrayPersegiPanjang = new persegiPanjang[jumlahPersegiPanjang]; // deklarasi array persegiPanjang

        // perulangan untuk membuat object
        for (int i = 0; i < arrayPersegiPanjang.length; i++) {
            // arrayPersegiPanjang[i] = new persegiPanjang();
            // System.out.println("Persegi panjang ke-" + (i + 1));
            // System.out.print("panjang : ");
            // arrayPersegiPanjang[i].panjang = input.nextInt();
            // System.out.print("Lebar : ");
            // arrayPersegiPanjang[i].lebar = input.nextInt();

            // cunstroctur
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("panjang : ");
            panjang = input.nextInt();
            System.out.print("Lebar : ");
            lebar = input.nextInt();
            // cunstroctur
            arrayPersegiPanjang[i] = new persegiPanjang(panjang,lebar);
        }

        // perulangan untuk mencetak program pada main
        for (int i = 0; i < arrayPersegiPanjang.length; i++) {
            System.out.print("Persegi panjang ke-" + (i+1));
            arrayPersegiPanjang[i].cetakData();
        }
        
        // for (int j = 0; j < 3; j++) {
        //     System.out.println("Persegi panjang ke-" + (j+1) + ", panjang : " + arrayPersegiPanjang[j].panjang + ", lebar : " + arrayPersegiPanjang[j].lebar);
        // }

        // PersegiPanjang[] myArrayOfPersegiPanjang = new PersegiPanjang[100];
        // myArrayOfPersegiPanjang[5].panjang = 20;

        // // membuat objct array
        // arrayPersegiPanjang[0] = new persegiPanjang();
        // arrayPersegiPanjang[0].panjang = 110;
        // arrayPersegiPanjang[0].lebar = 30;

        // arrayPersegiPanjang[1] = new persegiPanjang();
        // arrayPersegiPanjang[1].panjang = 80;
        // arrayPersegiPanjang[1].lebar = 40;

        // arrayPersegiPanjang[2] = new persegiPanjang();
        // arrayPersegiPanjang[2].panjang = 100;
        // arrayPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1, panjang : " + arrayPersegiPanjang[0].panjang + ", lebar : " + arrayPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-2, panjang : " + arrayPersegiPanjang[1].panjang + ", lebar : " + arrayPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-3, panjang : " + arrayPersegiPanjang[2].panjang + ", lebar : " + arrayPersegiPanjang[2].lebar);

    }
}
