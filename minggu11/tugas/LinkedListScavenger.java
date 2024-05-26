package minggu11.tugas;

import java.util.Scanner;

public class LinkedListScavenger {
    ScavengerHuntNode head;
    // boolean kunciBenar = false;

    // kondisi jika masih belum dimulai
    boolean isEmpty() {
        return head == null;
    }

    // method print untuk node
    public void printPertanyaan() {
        if (!isEmpty()) {
            System.out.println("=============== Daftar Pertanyaan ================");
            // buat variabel untuk menyimpan node head sementara
            ScavengerHuntNode currentNode = head; // urutan node pertama

            // perulangan untuk print
            while (currentNode != null) {
                System.out.println("+" + currentNode.soal);
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // add last untuk membuat pertanyaan yang akan diajukan pada permainan
    public void addLastScavenger(String soal, String kunci) {
        // create new node untuk menampung data paramter
        ScavengerHuntNode newNode = new ScavengerHuntNode(soal, kunci, null);
        // pengkondisian
        if (head == null) {
            head = newNode;
        } else {
            ScavengerHuntNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next; // untuk melanjutkan pertanyaan selanjutnya
            }
            currentNode.next = newNode;
        }
    }

    // method untuk memulai permainan
    public void startPermainan() {
        Scanner input = new Scanner(System.in);
        ScavengerHuntNode currentNode = head;

        int benar = 0;
        int jumlahSoal = 0;

        while (currentNode != null) {
            System.out.println("Pertanyaan yang harus dijawab\t: " + currentNode.soal);
            System.out.print("Isi jawaban dari pertanyaan\t: ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase(currentNode.kunci)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
                System.out.println();
                benar++;
                currentNode = currentNode.next;

            } else {
                System.out.println("Jawaban salah. Coba lagi!");
                System.out.println();
            }
            jumlahSoal++;
        }
        System.out.println("=============================================================");
        System.out.println("| ANDA MENANG DAN MENDAPATKAN KEY UNTUK MEMBUKA HARTA KARUN |");
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("total skor anda adalah\n" + "Benar\t\t: " + benar +"\nSalah\t\t: " + (jumlahSoal-benar) + "\nTotal Percobaan\t: " + jumlahSoal);
    }
}
