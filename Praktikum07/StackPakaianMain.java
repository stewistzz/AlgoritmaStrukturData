package Praktikum07;

import java.util.Scanner;

public class StackPakaianMain 
{
    public static void main(String[] args)
    {
        StackPakaian stk = new StackPakaian(5);
        
        // scanner
        Scanner sc = new Scanner(System.in);


        

        char pilih;
        do {
            System.out.print("jenis\t: ");
            String jenis = sc.nextLine();
            System.out.print("warna\t: ");
            String warna = sc.nextLine();
            System.out.print("merk\t: ");
            String merk = sc.nextLine();
            System.out.print("ukuran\t: ");
            String ukuran = sc.nextLine();
            System.out.print("harga\t: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.println("apakah anda akan menambahkan data baru ke stack?(y/n) : ");

            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while(pilih == 'y');


        // pemanggilan method

        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
