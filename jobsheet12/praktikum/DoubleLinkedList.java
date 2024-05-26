package jobsheet12.praktikum;

public class DoubleLinkedList {
    // atribut
    Node head;
    int size;

    // method Double Linked list
    public DoubleLinkedList()
    {
        head = null;
        size = 0;
    }

    // isEmpty
    public boolean isEmpty()
    {
        return head == null;
    }

    // addFirst
    public void addFirst(int item)
    {
        if (isEmpty()) {
            head = new Node(null, item, null);
        }
        else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // addLast
    public void addLast(int item)
    {
        if (isEmpty()) {
            addFirst(item);
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    // method add
    public void add(int item, int index) throws Exception
    {
        if (isEmpty()) {
            addFirst(item);
        }
        else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }
            else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    // size
    public int size()
    {
        return size;
    }

    // clear
    public void clear()
    {
        head = null;
        size = 0;
    }

    // print
    public void print()
    {
        if (!isEmpty())
        {
            Node tmp = head;
            while (tmp != null)
            {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }
        else
        {
            System.out.println("Linked list kosong");
        }
    }

    // praktikum 2 - remove
    // removeFirst
    public void removeFirst() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }
        else if (size == 1) {
            removeLast();
        }
        else {
            head = head.next; // memindahkan head
            head.prev = null;
            size--;
        }
    }

    // removeLast
    public void removeLast() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }
        else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // remove
    public void remove(int index) throws Exception
    {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        else if (index == 0) {
            removeFirst();
        }
        else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }
            else if (current.prev == null) {
                current = current.next;
                current.prev = null;
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    // praktikum 3

    // method getFirst
    public int getFirst() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    // methodgetLast
    public int getLast() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // method get
    public int get (int index) throws Exception
    {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
