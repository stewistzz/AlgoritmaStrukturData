package praktikum06;

public class MergeSortTest {
    // method merge sort
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }
    // merge gabungan data kiri dan kanan
    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length]; // nilai value dari temporary
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        // 
        int a = left;
        int b = middle + 1;
        int c = left;
        // membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        // 
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }
    // method sort
    // membagi menjadi 2 bagian dan dibagi kembali hingga tidak dapat dibagi kembali
    private void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }
    // print array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }

}
