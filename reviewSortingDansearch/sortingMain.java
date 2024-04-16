package reviewSortingDansearch;

public class sortingMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");

        mergeSorting mSorting = new mergeSorting();
        System.out.println("data awal");
        mSorting.printArray(data);

        mSorting.mergeSort(data);

        System.out.println("setelah diurutkan");

        mSorting.printArray(data);
    }
}
