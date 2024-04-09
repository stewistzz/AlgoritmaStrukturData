package jobsheet5.praktikum;

public class HotelService08 {
    Hotel08 rooms[] = new Hotel08[5];
    int index;

    // method tambah
    void tambahHotel(Hotel08 H) { // menyimpan parameter h1,h2,....
        if (index < rooms.length) {
            rooms[index] = H; // menunjukkan letak index dengan berisi nilai H sesuai dengan indeks nya
            index++; // kemudian value index diupdate seiring program berjalan
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // method tampil all untuk hotel
    void tampilAll() {
        for (Hotel08 h08 : rooms) {
            // System.out.println("========================");
            h08.cetakData();
            System.out.println("---------------------------");
        }
    }

    // method untuk hitung method bubble sort
    void algBubbleSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            // inner
            for (int j = 1; j < rooms.length-i; j++) {
                // kondisi
                if (rooms[j].harga < rooms[j-1].harga ) {
                    // swap nilai
                    Hotel08 temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    // method selection sort untunk menghitung rating bintang
    void algSelectionSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idMin = i;
            // inner loop
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang < rooms[idMin].bintang) {
                    idMin = j;
                }
            }
            // swap nilai
            Hotel08 temp = rooms[idMin];
            rooms[idMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}
