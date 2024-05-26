package jobsheet12.tugas2;

import jobsheet5.daftarMahasiswaberprestasi;

public class FilmDoubleLinkedList {
    NodeFilm head;
    int size;

    // doublelinkedlist
    FilmDoubleLinkedList()
    {
        head = null;
        size = 0;
    }

    // method isEmpty
    public boolean isEmpty()
    {
        return head == null;
    }

    // addFirst
    public void addFirstFilm(DaftarFilm data)
    {
        if (isEmpty()) {
            head = new NodeFilm(null, data, null);
        }
        else {
            NodeFilm newNode = new NodeFilm(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // addLast
    public void addLast(DaftarFilm data)
    {
        if (isEmpty()) {
            addFirstFilm(data);
        }
        else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    // add
    public void add(DaftarFilm data, int index) throws Exception
    {
        if (isEmpty()) {
            addFirstFilm(data);
        }
        else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeFilm newNode = new NodeFilm(null, data, current);
                current.prev = newNode;
                head = newNode;
            }
            else {
                NodeFilm newNode = new NodeFilm(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

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
        NodeFilm current = head;
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
            NodeFilm current = head;
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

    // method getFirst
    public DaftarFilm getFirst() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    // methodgetLast
    public DaftarFilm getLast() throws Exception
    {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        NodeFilm tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // method get
    public DaftarFilm get (int index) throws Exception
    {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        NodeFilm tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // print
    public void print()
    {
        if (!isEmpty())
        {
            NodeFilm tmp = head;
            while (tmp != null)
            {
                System.out.println("ID\t: " + tmp.data.idFilm + "\t" + "Judul\t: " + tmp.data.judulFilm + "\t"  + "Rating\t: " + tmp.data.ratingFilm);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }
        else
        {
            System.out.println("Linked list kosong");
        }
    }

    // searching film berdasarkan id
    public DaftarFilm searchId(int id) throws Exception 
    {
        if (isEmpty()) 
        {
            throw new Exception("FIlm masih kosong");
        }

        NodeFilm currentFilm = head;
        while (currentFilm.next != null) {
            if (currentFilm.data.idFilm == id) {
                return currentFilm.data;
            }
            currentFilm = currentFilm.next;
        }
        throw new Exception("Film dengan ID " + id + " tidak ditemukan");
    }

    // sort rating film
    public void sortByRatingFilm() {
        if (isEmpty() || size == 1) {
            return;
        }
        for (int i = 0; i < size; i++) {
            NodeFilm currentNodeFilm = head;
            NodeFilm maxFilm = currentNodeFilm;
            for (int j = 0; j < size - i - 1; j++) {
                if (currentNodeFilm.next != null && currentNodeFilm.next.data.ratingFilm < maxFilm.data.ratingFilm) {
                    maxFilm = currentNodeFilm.next;
                }
                currentNodeFilm = currentNodeFilm.next;
            }
            if (maxFilm != currentNodeFilm) {
                DaftarFilm temp = currentNodeFilm.data;
                currentNodeFilm.data = maxFilm.data;
                maxFilm.data = temp;
            }
        }
    }

}
