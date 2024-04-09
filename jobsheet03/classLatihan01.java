package jobsheet03;

import java.util.Scanner;

public class classLatihan01 {

    String nama, status;
    int gaji, gajiTunjangan, tunjanganGuru;

    // constructor
    classLatihan01() {

    }

    classLatihan01(String nama, String status) {
        this.nama = nama; // menghindari duplikat nama variabel dengan menggunakan this
        this.status = status;
    }

    // input data guru
    void inputDataGuru(classLatihan01[] guru) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama guru : ");
        nama = input.next();
        System.out.print("Status guru : ");
        status = input.next();
    }

    // method hitung gaji
    int hitungGaji() {
        if (status.equalsIgnoreCase("PNS")) {
            gaji = 4000000;
        } else {
            gaji = 2000000;
        }
        return gaji;
    }
    // method tunjangan
    int tunjanganGuru(int gaji) {
        if (status.equalsIgnoreCase("PNS")) {
            tunjanganGuru = 400000;
        } else {
            tunjanganGuru = 200000;
        }
        gajiTunjangan = gaji + tunjanganGuru;

        return gajiTunjangan;
    }

    void tampilGaji(classLatihan01[] guru) {
        int allGaji = 0;
        for (int i = 0; i < guru.length; i++) {
            int gajiGuru = guru[i].hitungGaji(); // Menghitung gaji untuk setiap guru
            int tunjanganGaji = guru[i].tunjanganGuru(gajiGuru); // ambil gaji guru untuk ditambahkan kedalam tunjangan

            allGaji += tunjanganGaji;
        }
        System.out.println("Total gaji semua guru: " + allGaji);
    }

    void tampilData(){
            int gaji = hitungGaji();
            int gajiTunjangan = tunjanganGuru(gaji);

            System.out.println("nama guru : " + nama + "\nstatus : " + status + "\ngaji : " + gaji + "\nGaji + tunjangan : "
            + gajiTunjangan);
            System.out.println("=================");
    }
}
