// 08_Dimas Setyo Nugroho
// SIB-1C
package UTS_DimasSetyoNugroho;

public class SistemPerpustakaan08 {
    Buku08 listBuku[] = new Buku08[5];
    int idx;

    // menambahkan daftar buku
    void tambahDataBuku(Buku08 data) {
        if (idx < listBuku.length) {
            listBuku[idx] = data;
            idx++;
        } else {
            System.out.println("List buku sudah penuh");
        }
    }

    // menampilkan data buku
    void tampilAll() {
        for (Buku08 buku : listBuku) {
            buku.tampilkanDataBuku();
            System.out.println("-----------------------------------");
        }
    }

    // peminjaman buku
    void pinjamBuku(String judul) {
        for (Buku08 buku : listBuku) {
            if (buku != null && buku.judulBuku08.equalsIgnoreCase(judul)) {
                if (buku.stok08 > 0) {
                    buku.stok08--;
                    System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                    return;
                } else {
                    System.out.println("Maaf, stok buku \"" + judul + "\" habis.");
                    return;
                }
            }
        }
        System.out.println("Maaf, buku \"" + judul + "\" tidak ditemukan.");
    }

    // mengurutkan buku dari data stok
    void urutBukuStok() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            int stokMin = i;
            for (int j = i + 1; j < listBuku.length; j++) {
                if (listBuku[j].stok08 < listBuku[stokMin].stok08) {
                    // maka yang dilakukan
                    stokMin = j;
                }
            }
            Buku08 tmp = listBuku[stokMin];
            listBuku[stokMin] = listBuku[i];
            listBuku[i] = tmp;
        }
    }

    // pencarian buku berdasarkan judul
    // method find search dengan sequential algoritma
    public int cariBukuJudul(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j].judulBuku08.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    // method tampil posisi
    public void tampilPosisiBuku(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Buku dengan Judul : " + cari + " Ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data buku : " + cari + " tidak ditemukan");
        }
    }

    // method tampil data
    public void tampilDataBUku(int x, int pos) {
        if (pos != -1) {
            System.out.println("judul buku\t : " + listBuku[pos].judulBuku08);
            System.out.println("pengarang\t : " + listBuku[pos].pengarang08);
            System.out.println("Kode ISBN\t : " + listBuku[pos].kodeISBN08);
            System.out.println("Stok Buku\t : " + listBuku[pos].stok08);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }


    // list tampil stock bkuku 0
    void tampilStockBuku()
    {
        boolean stock = false;
        for (int i = 0; i < listBuku.length; i++) 
        {
            if (listBuku[i] != null && listBuku[i].stok08 == 0) 
            {
                stock = true;
                System.out.println("Buku dengan stok 0 adalah:");
                System.out.println("Judul Buku: " + listBuku[i].judulBuku08);
            }
            if (!stock) 
            {
                System.out.println("stok buku " + listBuku[i].judulBuku08 + " masih tersedia");
            }
        }
    }

}
