package reviewSortingDansearch;

public class bubbleSort {

    // method untuk bubble sort
    public static void bubbleSort(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length-1; j++) {
                if (angka[j] > angka[j+1]) {
                    int temp  = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }
    }

    // method main dari bubble sort
    public static void main(String[] args) {
        int[] bilangan = {1,4,5,3,11,8,2};
        System.out.println("data sebelum diurutkan : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println();

        // data yang dirutukan
        System.out.println("Data telah diurutkan :");
        bubbleSort(bilangan);
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }

    }
    
}
