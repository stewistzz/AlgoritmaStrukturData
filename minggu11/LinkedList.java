package minggu11;

import praktikum06.sortMain08;

public class LinkedList {
    // atribut
    Node head;

    // method isEmpty untuk cek kondisi jika kosong
    boolean isEmpty() {
        return head == null; // kondisi kosong jika head == null
    }

    // method print untuk node
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List\t: ");
            // buat variabel untuk menyimpan node head sementara
            Node currentNode = head; // urutan node pertama

            // perulangan untuk print
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // method melakukan insert addFIrst()
    public void addFirst(int input) {
        // buat node baru yang berisi data dari input kemudian next adalah null
        Node newNode = new Node(input, null);

        // pengkondisian untuk menambahkan node baru
        if (isEmpty()) {
            head = newNode; // linkedlist kosong maka newNode otomatis jadi head
        } else {
            newNode.next = head;
            head = newNode; // disini merubah newNode menjadi head
        }
    }

    // method addLast()
    public void addLast(int input) {
        Node newNode = new Node(input, null);
        // pengkondisian untuk menambahkan node
        if (isEmpty()) {
            head = newNode; // kondisi kosong newNode adalah headnya
        } else {
            // jadikan head sebagai node saat ini dengan var currentNOde
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    // method insertAfter
    public void insertAfter(int key, int input) // key digunakan untuk petunjuk dari indeks awtau posisi dari node yang
                                                // ingin ditambahkan
    {
        Node newNode = new Node(input, null);

        // pengkondisian untuk menambahkan node
        if (!isEmpty()) {
            Node currentNode = head;

            // perulangan
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // method insertBefore
    public void insertBefore(int key, int input) // key digunakan untuk petunjuk dari indeks awtau posisi dari node yang
                                                 // ingin ditambahkan
    {
        Node newNode = new Node(input, null);

        // pengkondisian untuk menambahkan node
        if (!isEmpty()) {
            Node currentNode = head;
            // pengambilan node sebelum head
            Node sebelum = null;

            // perulangan
            do {
                if (currentNode.data == key) {
                    if (sebelum == null) {
                        newNode.next = head;
                        head = newNode;
                    } else {
                        newNode.next = currentNode;
                        sebelum.next = newNode;
                    }
                    break;
                }
                sebelum = currentNode;
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // method insertAt
    public void insertAt(int indeks, int input) {
        // buat node baru
        Node newNode = new Node(input, null); // sebagai node yang baru diinputkan
        Node currentNode = head; // sebagai head dari node
        int currentIndex = 0; // petunjuk indeks awal dari linked list

        // kokndisi jika indeks yang diisikan adalah 0
        if (indeks == 0) {
            newNode.next = head;
            head = newNode;
        }


        while (currentNode != null) {
            if (currentIndex == indeks - 1) {
                // Node yang ingin ditambahkan berada di tengah atau akhir linked list
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }

        System.out.println("Indeks melebihi panjang linked list.");
    }

    // untuk menghapus, kita perlu menangkap data node terlebih dahulu
    // mengembalikan nilai elemen di dalam node pada index tertentu
    public int getData(int indeks) // indeks berperan sebagai posisi dari node yang dicari
    {
        Node currentNode = head; // sebagai urutan node pertama
        // perulangan
        int check = 0;

        // perulangan untuk menghitung jumlah dari banyaknya node
        while (currentNode != null) {
            check++;
            currentNode = currentNode.next;
        }

        // pemeriksaan indeks jika melebihi batas
        if (indeks > check) {
            System.out.println("Warning, indeks yang anda masukkan melebihi jumlah node yang ada" + "(" + check + ")");
            return -1;// Nilai default atau nilai yang menandakan kesalahan
        }

        for (int i = 0; i < indeks; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    // method indexOf untuk mengetahu index dari node dengan elemen tertentu
    public int indexOf(int key)// key untuk mencari posisi dari node
    {
        Node currrentNode = head;
        int indeks = 0; // simpan indeks awal di 0

        while (currrentNode != null && currrentNode.data != key) {
            currrentNode = currrentNode.next; // pencarian data node yang sesuai
            indeks++;
        }

        if (currrentNode == null) {
            return -1;
        } else {
            return indeks;
        }
    }

    // method removeFirst
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next; // maka next node dari head sebagai sebagai head yang baru
        } else {
            System.out.println("linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    // method remove()
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    // break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    // new removeaAt
    public void removeAt(int indeks)
    {
        // node sementara, node sebelumnya dan indeks pada node untuk pentunjuk indeksnya
        Node currentNode = head;
        Node sebelum = null;
        int posisiNode = 0; // default indeks awal

        // jika linked list kosong
        if (isEmpty())
        {
            System.out.println("Linked list masih kosong.");    
        }

        // kondisi untuk awal ketika penghapusan dari indeks 0
        if (indeks == 0) 
        {
            // lakukan pemanggilan method hapus awal
            removeFirst(); 
        }
        // perulangan untuk menghapus data pada urutan tengah hingga akhir linkedlist
        while (currentNode != null) // kondisi jika head ada
        {
            // pengkondisian
            if (posisiNode == indeks)//kondisi jika int indeks yang dicari sama dengan posisi
            {
                sebelum.next = currentNode.next;
                return;
            }
            sebelum = currentNode;
            currentNode = currentNode.next;
            posisiNode++;
        }
        System.out.println("Indeks melebihi panjang linked list.");
    }
}
