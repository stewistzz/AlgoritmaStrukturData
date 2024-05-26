package jobsheet12.praktikum;

public class Node {
    // atribut
    int data;
    Node prev;
    Node next;

    // constructor
    Node()
    {

    }
    // parameter constructor
    Node(Node prev, int data, Node next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
