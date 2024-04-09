package Kuis1_DimasSetyoNugroho_SIB1C;

import java.util.Scanner;

public class Aksesoris {
    String nama, kategori;
    int harga, terjual, stock;

    // constructor
    Aksesoris() {
    }

    Aksesoris(String nama, String kategori, int harga, int terjual, int stock) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.terjual = terjual;
        this.stock = stock;
    }

    // input aksesoris
    void inputAksesoris() {
        Scanner user = new Scanner(System.in);
        System.out.print("Nama: ");
             nama = user.next();
            System.out.print("Kategori: ");
             kategori = user.next();
            System.out.print("Harga: ");
             harga = user.nextInt();
            System.out.print("beli: ");
             terjual = user.nextInt();
            System.out.print("Stok: ");
             stock = user.nextInt();
    }

    // method tampil aksesoris
    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Terjual: " + terjual);
        System.out.println("Stok: " + stock);
    }

    // hitung penjualan dari aksesoris
    int hitungTotalPenjualan() {
        return terjual * harga;
    }

    // update stock
    void cekStock() {
        System.out.println("======================");
        // tampil keseluruhan barang
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Terjual: " + terjual);
        System.out.println("Stok: " + stock);
        // pengkondisian stock
        if (stock > 5) {
            System.out.println("Stock aksesoris masih banyak");
        } else {
            System.out.println("Stock barang aksesoris limited");
        } 
        System.out.println("====================");
    }
}