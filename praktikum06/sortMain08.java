package praktikum06;

public class sortMain08 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting dengan merge sort");
        MergeSortTest mSort = new MergeSortTest();

        System.out.println("data awal");
        mSort.printArray(data);
        
        // pengurutan data
        mSort.mergeSort(data);

        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
