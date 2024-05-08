package minggu11;

public class Node {
    // atribut
    int data;
    Node next;

    // constructor
    Node(){}

    // c dengan parameter
    Node(int nilai, Node berikutnya)
    {
        data = nilai;
        next = berikutnya;
    }
}
