package reviewSortingDansearch.lathan;

public class hotelService {
    // array untuk rooms
    // hotel rooms[] = new hotel[3];

    hotel rooms[];
    int idx; // untuk cek posisi
    // method tambah hotel
    // secara default nilai dari idx 0 karena bertipe integer

    public hotelService(int j) {
        rooms = new hotel[j];
    }

    void tambahHotel(hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    // method tampil
    void tampilAll() {
        for (hotel h : rooms) {
            h.tampilHotel();
            System.out.println("-------------------------------------");
        }
    }

    // bubbleSrt method untuk menghitung harga
    void bubbleSortHotel() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms.length-1; j++) {
                // kondisi untuk bubbke
                if (rooms[j].harga > rooms[j+1].harga) { // kondisi jika 0 lebih bsar dari 1 maka pindah nilai 1 ke 0
                    hotel temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }

    // method selection sort
    void selectionSortHotel() {
        for (int i = 0; i < rooms.length-1; i++) {
            // set up nilai awal
            int awal = i;
            for (int j = i+1; j < rooms.length; j++) {
                // kondisi
                if (rooms[awal].bintang < rooms[j].bintang) {
                    awal = j;
                }
                // swap process
                hotel tampung = rooms[awal];
                rooms[awal] = rooms[i];
                rooms[i] = tampung;
            }
        }
    }
}
