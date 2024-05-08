package JOBSHEET8.praktikum1;

import java.util.Scanner;

public class queueMain {

    // method menu
    public static void menu()
    {
        System.out.println("Masukkan operasi yang diinginkan ; ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");

        int n = sc.nextInt();

        // instansiasi object queue
        queue Q = new queue(n);

        
        // deklarasi variabel pilih
        int pilih;
        
        do {
            // panggil menu
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0)
                    {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
