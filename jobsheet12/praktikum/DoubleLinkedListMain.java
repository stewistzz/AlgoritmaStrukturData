package jobsheet12.praktikum;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        // dll.print();

        // System.out.println("Size\t: " + dll.size());
        // System.out.println("=====================================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();

        // System.out.println("Size\t: " + dll.size());
        // System.out.println("=====================================");
        // dll.add(40, 1);
        // dll.print();

        // System.out.println("Size\t: " + dll.size());
        // System.out.println("=====================================");
        // dll.clear();
        // dll.print();

        // System.out.println("Size\t: " + dll.size());
        // System.out.println("=====================================");

        // // praktikum 2
        // System.out.println();
        // System.out.println("Praktikum 2");
        // System.out.println();
        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();

        // System.out.println("size\t: " + dll.size());
        // System.out.println("==========================================");
        // dll.removeFirst();
        // dll.print();
        
        // System.out.println("size\t: " + dll.size());
        // System.out.println("==========================================");
        // dll.removeLast();
        // dll.print();

        // System.out.println("size\t: " + dll.size());
        // System.out.println("==========================================");
        // dll.remove(1);
        // dll.print();
        
        // System.out.println("size\t: " + dll.size());
        // System.out.println("==========================================");

        System.out.println();
        System.out.println("Praktikum 3");
        System.out.println();

        dll.print();
        System.out.println("size\t: " + dll.size());
        System.out.println("==========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addLast(7);
        dll.print();

        System.out.println("size\t: " + dll.size());
        System.out.println("==========================================");

        dll.add(40,1);
        dll.print();

        System.out.println("size\t: " + dll.size());
        System.out.println("==========================================");

        System.out.println("Data awal pada linked list\t: " + dll.getFirst());
        System.out.println("Data akhir pada linked list\t: " + dll.getLast());
        System.out.println("Data indeks-1 pada linked list\t: " + dll.get(1));

        System.out.println("Data indeks-2 pada linked list\t: " + dll.get(2));
    }
}
