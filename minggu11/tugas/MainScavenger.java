package minggu11.tugas;
import java.util.Scanner;

public class MainScavenger {
    // menu
    public static void menu() {
        System.out.println("((((((((( Masukkan Pilihan Anda untuk akses menu ))))))))");
        System.out.println("1. Tampilkan pertanyaan");
        System.out.println("2. Jawab pertanyaan");
        System.out.println("3. Exit");
        System.out.println("=====================================================");
    }
    // main
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        LinkedListScavenger game = new LinkedListScavenger();

        int pilih;

        do {
            menu(); // Tampilkan menu

            System.out.print("Masukkan pilihan menu anda\t: ");
            pilih = inputUser.nextInt();

            switch (pilih) {
                case 1:
                    // Tampilkan pertanyaan
                    game.addLastScavenger("Mata uang negara Jepang", "yen");
                    game.addLastScavenger("Negara dengan wilayah terluas didunia?", "Rusia");
                    game.addLastScavenger("Negara dengan julukan matahari terbit", "jepang");
                    game.addLastScavenger("Ibu kota negara Belanda", "amsterdam");
                    game.addLastScavenger("Candi Borobudur terletak di negara", "Indonesia");
                    game.printPertanyaan();
                    break;
                case 2:
                    // Mulai permainan
                    game.startPermainan();
                    break;
                default:
                    System.out.println("Terimakasih telah bermain");
                    return;
            }
        } while (pilih != 2); // Ulangi selama pilihan bukan 3 (keluar dari permainan)

    }
}
