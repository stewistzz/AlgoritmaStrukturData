package jobsheet12.tugas1;

import java.util.prefs.NodeChangeEvent;

public class DoubleLinkedListAntrian {
    // atribut
    NodeAntrian head;
    int size;

    // method Double Linked list
    public DoubleLinkedListAntrian()
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
    public void addFirstVaksin(penerimaVaksin item)
    {
        if (isEmpty()) {
            head = new NodeAntrian(null, item, null);
        }
        else {
            NodeAntrian newNode = new NodeAntrian(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // addLast
    public void addLastVaksin(penerimaVaksin item) {
        if (isEmpty()) {
            addFirstVaksin(item);
        } else {
            NodeAntrian currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            NodeAntrian newNode = new NodeAntrian(currentNode, item, null);
            currentNode.next = newNode;
            size++;
        }
    }

    public void addVaksin(penerimaVaksin item, int index) throws Exception {
        if (isEmpty()) {
            addFirstVaksin(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks yang dimasukkan diluar batas");
        } else {
            NodeAntrian currentNode = head;
            int i = 0;
            while (i < index) {
                currentNode = currentNode.next;
                i++;
            }
            if (currentNode.prev == null) { // node pertama
                NodeAntrian newNode = new NodeAntrian(null, item, currentNode);
                currentNode.prev = newNode;
            } else {
                NodeAntrian newNode = new NodeAntrian(currentNode.prev, item, currentNode);
                newNode.prev = currentNode.prev;
                newNode.next = currentNode;
                currentNode.prev.next = newNode;
                currentNode.prev = newNode;
            }
        }
        size++;
    }

    // size
    public int sizeVaksin()
    {
        return size;
    }

    // clear
    public void clear()
    {
        head = null;
        size = 0;
    }

    // method delete
    // remove First
    public void removeFirstVaksin() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }
        else if (size == 1) {
            removeLastVaksin();
        }
        else {
            head = head.next; // memindahkan head
            head.prev = null;
            size--;
        }
    }
    // removeLast
    public void removeLastVaksin() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }
        else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeAntrian current = head;
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
            removeFirstVaksin();
        }
        else {
            NodeAntrian current = head;
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
    // method getFirst
    public penerimaVaksin getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }
    // methodgetLast
    public penerimaVaksin getLast() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        NodeAntrian tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    // method get
    public penerimaVaksin get (int index) throws Exception
    {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        NodeAntrian tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // print dataVaksin
    public void printVaksin()
    {
        if (!isEmpty())
        {
            NodeAntrian tmp = head;
            System.out.println("---------------------");
            System.out.println("| Nomor\t|\tNama |");
            System.out.println("---------------------");
            while (tmp != null)
            {
                System.out.println("|" + tmp.data.nomor + "\t|\t" + tmp.data.nama + " |");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }
        else {
            System.out.println("Linked list kosong");
        }
    }
}
