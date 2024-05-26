package jobsheet12.tugas2;

import java.util.Scanner;

import reviewSortingDansearch.sortingMain;

public class FIlmMain {
    public static void daftarMenu() {
        System.out.println("===============================");
        System.out.println("Daftar Menu Layar Lebar");
        System.out.println("===============================");
        System.out.println("1. Tambah Data awal");
        System.out.println("2. Tambah Data akhir");
        System.out.println("3. Tambah Data index tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak Data Film");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-Desc");
        System.out.println("10. exit");
        System.out.println("==================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);

        FilmDoubleLinkedList f = new FilmDoubleLinkedList();

        int pilih;

        do {
            daftarMenu();
            pilih = inputUser.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan Data Film Awal");
                    System.out.println("---------------------------");
                    System.out.print("ID Film\t: ");
                    int idFirst = inputUser.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFirst = inputUser.next();
                    System.out.print("Rating Film\t: ");
                    double ratingFirst = inputUser.nextDouble();

                    // buat object
                    DaftarFilm p = new DaftarFilm(idFirst, judulFirst, ratingFirst);
                    f.addFirstFilm(p);
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan Data Film Akhir");
                    System.out.println("---------------------------");
                    System.out.print("ID Film\t: ");
                    int idFilmLast = inputUser.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulLast = inputUser.next();
                    System.out.print("Rating Film\t: ");
                    double ratingLast = inputUser.nextDouble();

                    // buat object
                    DaftarFilm p2 = new DaftarFilm(idFilmLast, judulLast, ratingLast);
                    f.addLast(p2);
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan Data Film Akhir");
                    System.out.println("---------------------------");
                    System.out.print("ID Film\t: ");
                    int idFilm = inputUser.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilm = inputUser.next();
                    System.out.print("Rating Film\t: ");
                    double ratingFilm = inputUser.nextDouble();

                    // buat object
                    DaftarFilm p3 = new DaftarFilm(idFilm, judulFilm, ratingFilm);
                    f.addLast(p3);
                    break;
                case 4:
                    DaftarFilm filmFirst = f.getFirst();
                    System.out.println("Film " + filmFirst.judulFilm + " Berhasil Dihapus");
                    f.removeFirst();
                    System.out.println();
                    break;
                case 5:
                    DaftarFilm filmLast = f.getLast();
                    System.out.println("Film " + filmLast.judulFilm + " Berhasil Dihapus");
                    f.removeLast();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Masukkan Urutan Film\t: ");
                    int del = inputUser.nextInt();
                    DaftarFilm film = f.get(del);
                    System.out.println("Film " + film.judulFilm + " Berhasil Dihapus");
                    f.remove(del);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("-----------------------");
                    System.out.println("Cetak data Film");
                    System.out.println("-----------------------");
                    f.print();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("----------------------");
                    System.out.println("Pencarian id Film");
                    System.out.println("----------------------");
                    System.out.print("Masukkan ID Film\t: ");
                    int id = inputUser.nextInt();
                    f.searchId(id);
                    break;
                case 9:
                f.sortByRatingFilm();
                    System.out.println("----------------------");
                    System.out.println("Sorting Rating Film(DES)");
                    System.out.println("----------------------");
                    f.print();
                    break;
                case 10:
                    return;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7
                || pilih == 8 || pilih == 9 || pilih == 10);
    }
}
