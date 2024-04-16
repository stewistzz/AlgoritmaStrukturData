package reviewSortingDansearch;

public class searching {
    public static void main(String[] args) {
        int[] nilai = {10, 30, 5, 3, 50};
        sequentiaSearch(nilai, 3);
    }

    // method
    public static void sequentiaSearch(int[] data, int n) {
        // perulangan data
        for (int i = 0; i < data.length; i++) {
            if (i == n) {
                System.out.println("data nilai " + n + " ditemukan pada indeks ke-" + i);
            }
        }
    }   
}
