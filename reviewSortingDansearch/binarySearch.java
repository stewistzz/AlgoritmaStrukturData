package reviewSortingDansearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] sortNilai = {12, 20, 30, 35, 40, 50};

        System.out.println("Total data");
        for (int i : sortNilai) {
            System.out.print(i + ", ");
        }

        int index = binarySearchData(sortNilai, 35);

        // kondisi untuk mencetak
        if (index != -1) 
        {
            System.out.println("Data ditemukan pada indeks ke-" + index);
        }
        else
        {
            System.out.println("Data tidak ditemukan");
        }
    }

    // method iuntuk binary search
    public static int binarySearchData(int[] arr, int x) 
    {
        // deklarasi batasan
        int awal = 0, akhir = arr.length-1;
        // perulangan
        while (awal <= akhir)
        {
            // cari nilai tengah
            int mid = (awal + akhir) / 2;

            if (arr[mid] == x) 
            {
                return mid;
            } 
            else if (arr[mid] < x) {
                awal = mid + 1;
            }
            else
            {
                akhir = mid - 1;
            }
        }
        return -1;
    }
}
