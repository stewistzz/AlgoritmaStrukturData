package praktikum06;

public class Sorting08 {
    // method algoritma sequential search dengan array
    public static void sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Data " + key + " ditemukan pada indeks ke-" + i);
                System.out.println("-------------------------------");
                return;
            }
        }
        System.out.println("data tidak ditemukan");
        System.out.println("-------------------------------");
    }

    // method algoritma binary search dengan array
    public static int binarySearchAsc(int[] arr, int key) {
        // instansiasi untuk batas nilai
        int start = 0, end = arr.length - 1;
        // proses perulangan
        while (start <= end) {
            // hitung nilai tengah
            int mid = (start + end) / 2;
            // kondisi
            if (key == arr[mid]) {
                return mid;
            }
            // kondisi jika key bukan nilai mid
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // sequential search
        int[] daftarNilai = { 10, 5, 20, 15, 5, 45 };
        sequentialSearch(daftarNilai, 5);
        // sequentialSearch(daftarNilai, 100);

        // binary search
        int[] sortedNilai = { 5, 5, 10, 20, 30, 40, 50 };
        int index = binarySearchAsc(sortedNilai, 50);

        if (index != -1) {
            System.out.println("data ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("data tidak ditemukan didalam indeks");
        }
    }
}