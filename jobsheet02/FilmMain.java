package jobsheet02;

public class FilmMain {
    public static void main(String[] args) {
        // bikin object
        // Film film = new Film();
        // // isi data dari object
        // film.judul = "Quantummania Mancing";
        // film.genre = "Action Comedy";
        // film.rate = "Remaja";
        // film.jumlahTiket = 3000;
        // film.hargaTiket = 40000;

        // // runnning method
        // film.tambahTiket(1);
        // film.kurangTiket(3);
        // film.tampilFilm();

        // int income = film.totalRevenue(4);

        // System.out.println("Total jual 4 tiket = " + income);
        // System.out.println("============================");
        // // object film2
        // Film film2 = new Film("Mbak Kunti", "Horor", "Dewasa", 2000, 40000);
        // film2.tampilFilm();
        System.out.println("============================");
        // buat object baru film 3
        Film film3 = new Film("Mortal Kombat", "Comedy", "Dewasa", 3500, 30000);
        film3.tampilFilm();

    }
}
