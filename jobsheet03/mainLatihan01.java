package jobsheet03;

import java.util.Scanner;

public class mainLatihan01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // input jumlah array
        System.out.print("Masukkan jumlah Guru : ");
        int jmlGuru = input.nextInt();

        // buat array of object
        classLatihan01[] guru = new classLatihan01[jmlGuru];
        // looping untuk membuat dan mengisika array
        for (int i = 0; i < guru.length; i++) {
            guru[i] = new classLatihan01();
            guru[i].inputDataGuru(guru);
            System.out.println();
        }
        for (int i = 0; i < guru.length; i++) {
            guru[i].tampilData();
        }
        classLatihan01 guruCetak = new classLatihan01();
        guruCetak.tampilGaji(guru);
    }
}
