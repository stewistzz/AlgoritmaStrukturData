package praktikum06;

import jobsheet4.minggu5.mainFaktorial;

public class PencarianMahasiswa08 {
    
    // object mahasiswa
    // Mahasiswa08 lisMhs[] = new Mahasiswa08[5]; // buat agar mengambil data dari main mahasiwa
    Mahasiswa08 lisMhs[];
    int idx; // cek data index

    public PencarianMahasiswa08(int jumMhs) {
        lisMhs = new Mahasiswa08[jumMhs];
    }
    // tambah mahasiswa
    void tambahMhs(Mahasiswa08 m) {
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    // void tampil
    void tampil() {
        for (Mahasiswa08 m : lisMhs) {
            m.tampil();
            System.out.println("-------------------------------------");
        }
    }

    // method find search dengan sequential algoritma
    public int findSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < lisMhs.length; j++) {
            if (lisMhs[j].Nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method FindBinarySearch dengan binary algorithm
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            // kondisi dengan nilai yang dicari
            if (cari == lisMhs[mid].Nim) {
                return mid;
            } else if (cari < lisMhs[mid].Nim) {
                // kembalikan method dengan rekursif
                return FindBinarySearch(cari, left, mid - 1); // karena cari < mid maka nilai mid-1(artinya right bergerak ke kiri mid)
            } else {
                return FindBinarySearch(cari, mid + 1, right); // karena cari  mid maka nilai mid+1(artinya left bergerak ke kanan mid)
            }
        }
        return -1;
    }

    // method tampil posisi
    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    // method tampil data
    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t" + x);
            System.out.println("Nama\t : " + lisMhs[pos].Nama);
            System.out.println("Umur\t : " + lisMhs[pos].umur);
            System.out.println("Ipk\t : " + lisMhs[pos].Ipk);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    // method baru untuk pencarian berdasarkan nama
    public int FindBinarySearchNama(String cari, int left, int right, int count) {
        // declare mid
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            // kondisi yang dicari
            if (cari.equalsIgnoreCase(lisMhs[mid].Nama)) {
                return mid;
            } else if (cari.compareTo(lisMhs[mid].Nama) < 0) {
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
            System.out.println("Nama\t : " + lisMhs[pos].Nama);
            System.out.println("Umur\t : " + lisMhs[pos].umur);
            System.out.println("Ipk\t : " + lisMhs[pos].Ipk);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    // sebelumnya data tidak ditemukan karena tidak terdapt indikasi urutan yang jelas
    // maka dari itu kita memerlukan sesuatu untuk menajdi tanda dari urutan sebuah indeks
    public void countNama(String cari) {
        // set nilai awal count 0
        int count  = 0;
        for (int i = 0; i < lisMhs.length; i++) {
            if (cari.equalsIgnoreCase(lisMhs[i].Nama)) {
                count += 1;
            }
        }
        if (count > 1) {
            System.out.println("Data yang ditemukan lebih dari 1");
            return;
        }
    }
}
