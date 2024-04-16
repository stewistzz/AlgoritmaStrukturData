package reviewSortingDansearch.lathan;

import java.util.Scanner;

public class mainHotel {
    public static void main(String[] args) {
        // hotelService lisHotel = new hotelService(); // objek dari hotel service 
        // dituliskan didalam main agar anntinya objek dari kelas hotel dapat dialkukan operasi didalam kelas hotelService

        // hotel h1 = new hotel("aserto", "kayutangan", 148000, (byte) 4);
        // hotel h2 = new hotel("corsareta", "Banyuwangi", 161000, (byte) 2);
        // hotel h3 = new hotel("sage", "surabaya", 145000, (byte) 3);
        // ketka objek h1, h2 dan h3 dibuat maka akan langsung masuk kedalam kelas hotel

        
        
        // lisHotel.tambahHotel(h1); // punya objek hotel service -> akses tambah Hotel dengan memanggil objek h1 dari class hotel -> masuk idx
        // // karena listHotel merupakan objek bagian dari class hotelService maka dapat memanggil method tambahHotel
        // lisHotel.tambahHotel(h2); 
        // lisHotel.tambahHotel(h3);
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah hotel");
        int jumlah = input.nextInt();

        hotelService lisHotel = new hotelService(jumlah);

        System.out.println("Masukkan Data hotel yang ingin diinputkan: ");
        // perulangan untuk isi data objek
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama Hotel(String)\t: ");
            String nama = input.next();
            System.out.print("Masukkan kota Hotel(String)\t: ");
            String kota = input.next();
            System.out.print("Masukkan harga Hotel(int)\t: ");
            int harga = input.nextInt();
            System.out.print("Masukkan rating Hotel(byte)\t: ");
            byte bintang = input.nextByte();

            hotel h = new hotel(nama, kota, harga, bintang);
            lisHotel.tambahHotel(h);
        }


        System.out.println("data sebelum diurutkan");
        System.out.println("----------------------------");
        lisHotel.tampilAll(); // punya objek dari hotel service yang kemudian akses tmpilAll();

        System.out.println();
        System.out.println("=======================================================");
        System.out.println("data setelah diurutkan dengan bubble sort(harga) : ");
        System.out.println("========================================================");
        lisHotel.bubbleSortHotel();
        lisHotel.tampilAll();

        System.out.println();

        System.out.println("=======================================================");
        System.out.println("data setelah diurutkan dengan selection sort(rating) : ");
        System.out.println("========================================================");
        lisHotel.selectionSortHotel();
        lisHotel.tampilAll();
    }
}
