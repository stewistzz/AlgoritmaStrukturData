package minggu11;

import jobsheet5.mainMahasiswa;
import reviewSortingDansearch.lathan.transaksiCase.mainTransaksiCase;

public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.print();
        myLinkedList.addFirst(800);

        myLinkedList.print();
        myLinkedList.addFirst(700);

        myLinkedList.print();
        myLinkedList.addLast(500);

        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);

        myLinkedList.print();
        
        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        //System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));
        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();


        // myLinkedList.insertBefore(800, 100);
        // myLinkedList.print();
        // myLinkedList.insertAt(2, 900);
        // myLinkedList.print();
        // myLinkedList.removeAt(3);
        // myLinkedList.print();


        // myLinkedList.print();
        // myLinkedList.addFirst(100);
        // myLinkedList.print();
        // myLinkedList.addLast(200);
        // myLinkedList.print();
        // myLinkedList.addLast(300);
        // myLinkedList.print();
        // myLinkedList.addLast(400);
        // myLinkedList.print();
        // myLinkedList.addLast(500);
        // myLinkedList.print();
        // myLinkedList.addFirst(50);
        // myLinkedList.print();
        // myLinkedList.insertAfter(200, 250);
        // myLinkedList.print();
    }
}
