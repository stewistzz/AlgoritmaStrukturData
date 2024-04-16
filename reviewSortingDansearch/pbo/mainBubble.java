package reviewSortingDansearch.pbo;

public class mainBubble {
    public static void main(String[] args) {
        bubbleMahasiswa listBubble = new bubbleMahasiswa();
        bubble m1 = new bubble("Dimas", 2323, 4);
        bubble m2 = new bubble("Agus", 2424, 3.6);
        bubble m3 = new bubble("Dimas", 2525, 3.8);

        listBubble.tambahMhs(m1);
        listBubble.tambahMhs(m2);
        listBubble.tambahMhs(m3);

        System.out.println("data sebelum diurutkan");
        System.out.println("----------------------------");
        listBubble.tampil();

        System.out.println();
        System.out.println("data setelah diurutkan dengan bubble sort: ");
        System.out.println("---------------------------");
        listBubble.bubbleSort();
        listBubble.tampil();

        System.out.println();
        System.out.println("data setelah diurutkan dengan selection sort: ");
        System.out.println("---------------------------");
        listBubble.selectionSort();
        listBubble.tampil();

        System.out.println();
        System.out.println("data setelah diurutkan dengan insertion sort: ");
        System.out.println("---------------------------");
        listBubble.insertionSort();
        listBubble.tampil();

    }
}
