package Kuis02_Dimas08;

public class AntrianLinkedList_08 {
    // menuliskan head
    Node_08 head08;

    // linkedList isEmpty
    boolean isEmpty() {
        return head08 == null;
    }

    // isEmpty
    public void tambahAntrian(Pembeli_08 pembeli) {
        Node_08 nodeBaru = new Node_08(pembeli);
        if (head08 == null) {
            head08 = nodeBaru;
        } else {
            Node_08 temp = head08;
            while (temp.next08 != null) {
                temp = temp.next08;
            }
            temp.next08 = nodeBaru;
        }
        System.out.println("Pembeli " + pembeli.namaPembeli08 + " telah ditambahkan ke antrian.");
    }

    // cetak antrian pembeli
    public void printAntrian() {
        if (!isEmpty()) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian pada Resto Royal Palmia");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t| Nama Customer\t| No hp\t\t|");
            System.out.println("----------------------------------");
            Node_08 currentNode08 = head08;
            int nomorAntrian08 = 1;
            while (currentNode08 != null) {
                System.out.println("|" + nomorAntrian08 + "\t|" + currentNode08.pembeli08.namaPembeli08 + "\t|" + currentNode08.pembeli08.nomorHp08 + "\t|");
                currentNode08 = currentNode08.next08;
                nomorAntrian08++;
            }
            System.out.println("Total Antrian: " + (nomorAntrian08 - 1));
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // METHOD clear
    public int hapusPesanan(int nomor08) {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dihapus.");
            return -1;
        } else if (nomor08 == 1) {
            // Hapus head (antrian pertama)
            Pembeli_08 pembeliHapus08 = head08.pembeli08;
            head08 = head08.next08;
            System.out.println("Pembeli " + pembeliHapus08.namaPembeli08 + " telah dihapus dari antrian.");
            return 0;
        } else {
            Node_08 prevNode = head08;
            Node_08 currentNode = head08.next08;
            int nomorAntrian = 2;

            while (currentNode != null) {
                if (nomorAntrian == nomor08) {
                    // Hapus currentNode
                    Pembeli_08 pembeliHapus = currentNode.pembeli08;
                    prevNode.next08 = currentNode.next08;
                    System.out.println("Pembeli " + pembeliHapus.namaPembeli08 + " telah dihapus dari antrian.");
                    return 0; // Kode 0 menandakan penghapusan berhasil
                }
                prevNode = currentNode;
                currentNode = currentNode.next08;
                nomorAntrian++;
            }
            System.out.println("Nomor antrian tidak ditemukan.");
            return -1;
        }
    }

    public int pendapatanResto08(int hargaMakanan08) {
        if (isEmpty()) {
            System.out.println("Tidak ada pesanan untuk dihitung.");
            return 0;
        }

        Node_08 currentNode08 = head08;
        int totalPendapatan = 0;
    
        while (currentNode08 != null) {
            totalPendapatan += hargaMakanan08;
            currentNode08 = currentNode08.next08;
        }
    
        System.out.println("Total pendapatan: " + totalPendapatan);
        return totalPendapatan;
    }
}
