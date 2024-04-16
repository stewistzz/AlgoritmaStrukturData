package reviewSortingDansearch.latihanSearch;

import jobsheet4.latihan.latihanBruteAkar;

public class pencarianMhs {
    Mahasiswa[] listMhs = new Mahasiswa[2];

    int idx; // default adalah 0

    void tambahMhs(Mahasiswa m)
    {
        if (idx < listMhs.length) 
        {
            listMhs[idx] = m;
            idx++;
        } else {
           System.out.println("array sudah penuh"); 
        }
    }

    void tampilDataMhs() 
    {
        for (Mahasiswa m : listMhs) 
        {
            m.tampilMhs();
            System.out.println("==========================");
        }
    }

    public int findSequentialSearch(int cari)
    {
        // set default position
        int position = -1;
        // perulangan untuk cek
        for (int i = 0; i < listMhs.length; i++) 
        {
            if (listMhs[i].nim == cari) 
            {
                position = i;
            }
        }
        return position;
    }

    public void tampilPosisi(int x, int pos) 
    {
        if (pos != -1) 
        {
            System.out.println("data\t: " + x + " ditemukan pada indeks ke-" + pos);
        } 
        else 
        {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) 
    {
        if (pos != -1) 
        {
            System.out.println("nim\t : " + x);
            System.out.println("nama\t: " + listMhs[pos].nama);
            System.out.println("umur\t: " + listMhs[pos].umur);
            System.out.println("ipk\t: " + listMhs[pos].ipk);
        }
        else 
        {
            System.out.println("Data " + x + "Tidak ditemukan");
        }
    }

    // method dengan binary search
    public int binarySearchMhs(int cari, int kiri, int kanan)
    {
        if (kanan >= kiri)
        {
            int mid = (kiri + kanan) / 2;
            
            // kondisi untuk mencari data
            if (cari == listMhs[mid].nim)
            {
                return mid;
            }
            else if (cari < listMhs[mid].nim)
            {
                //    call recursive
                return binarySearchMhs(cari, kiri, mid - 1);
            }
            else
            {
                // call recursive
                return binarySearchMhs(cari, mid + 1, kanan);
            }
        }
        return -1;
    }

    // cari berdasarkan nama
     // method baru untuk pencarian berdasarkan nama
     public int FindBinarySearchNama(String cari, int left, int right, int count) {
        // declare mid
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            // kondisi yang dicari
            if (cari.equalsIgnoreCase(listMhs[mid].nama)) {
                return mid;
            } else if (cari.compareTo(listMhs[mid].nama) < 0) {
                // kembalikan method dengan rekursif
                return FindBinarySearchNama(cari, left, mid - 1, count);
            } else {
                // kembalikan method dengan rekursif
                return FindBinarySearchNama(cari, mid + 1, right, count);
            }
        }
        return -1;
    }

    public void tampilPosisiNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void tampilDataNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t" + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("Ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    // sebelumnya data tidak ditemukan karena tidak terdapt indikasi urutan yang jelas
    // maka dari itu kita memerlukan sesuatu untuk menajdi tanda dari urutan sebuah indeks
    public void countNama(String cari) {
        // set nilai awal count 0
        int count  = 0;
        for (int i = 0; i < listMhs.length; i++) {
            if (cari.equalsIgnoreCase(listMhs[i].nama)) {
                count += 1;
            }
        }
        if (count > 1) {
            System.out.println("Data yang ditemukan lebih dari 1");
            return;
        }
    }
}
