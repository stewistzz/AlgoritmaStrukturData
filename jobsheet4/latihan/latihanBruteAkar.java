package jobsheet4.latihan;

import java.util.Scanner;

public class latihanBruteAkar {
    public static void main(String[] args) {
        double nilaiOrg, nilaiAkar, nilaiAkhir;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        nilaiOrg = input.nextDouble();
        System.out.println("Masukkan nilai akar : ");
        nilaiAkar = input.nextDouble();

        bruteForceLog(nilaiOrg, nilaiAkar);
    }

    public static int bruteForceLog(double nilaiOrg, double nilaiAkar) {
        int nilaiAkhir = 1;
        while (Math.pow(nilaiAkar, nilaiAkhir) <= nilaiOrg) {
          nilaiAkhir++;
        }
        return nilaiAkhir - 1;
      }
}
