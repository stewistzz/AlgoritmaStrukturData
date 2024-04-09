package jobsheet5;

// method daftarmahasiswaberprestasi ini berfungsi untuk melakukan operasi matematika
public class daftarMahasiswaberprestasi {
    // buat objek
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx; // sebagai pengecekan letak indeks dari data listMhs, dimana didalam method
             // tambahMHS value dari idx awal adalah 0

    // method tambah()
    void tambahMhs(Mahasiswa m) { // menerma parameter berupa m1,m2,..., m(n)
        if (idx < listMhs.length) { // dilakukan pengecekan
            listMhs[idx] = m; // disini lishMhs dengan index awal = 0, maka diidikan data m
            idx++; // kemudian value idx diupdate seiring program berjalan
        } else {
            System.out.println("data sudah penuh : ");
        }
    }

    // method tampil()
    void tampil() { // perulangan for-each untnuk menampilkan data
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("========================");
        }
    }

    // method bubbleSort()
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) { // i = 0; 0 < 4; 0++
            // inner
            for (int j = 1; j < listMhs.length - i; j++) { // 1 < 4
                if (listMhs[j].ipk > listMhs[j - 1].ipk) { // ipk pada indeks 1 > ipks indeks 0, maka lakukan swap

                    // proses swap nilai
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    // selection sort
    // tulis method selection sort
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idMin = i; // berfungsi untuk menetapkan nilai min awal sebagai patokan
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idMin].ipk) {
                    idMin = j;
                }
            }
            // swapp
            Mahasiswa tmp = listMhs[idMin];
            listMhs[idMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // method insertion
    void insertionSort() {
        // data [3, 4, 3.5, 2, 3.75]
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i]; // variabel untuk menyimpan data temporary sesuai dengan indeks pada array
            int j = i; // nilai dari indeks untuk melakukan perbandingan didalam perulangan
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
            // 3
            // 4 karena kondisi ke-2 bernilai false
            // 3, 3.5, 4
            //
        }
    }

    // method untuk menghitung nilai descending pada algoritma insertion
    void insertionDescendingSort() {
        // data [3, 4, 3.5, 2, 3.75]
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i]; // variabel untuk menyimpan data temporary sesuai dengan indeks pada array
            int j = i; // nilai dari indeks untuk melakukan perbandingan didalam perulangan
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { // Mengubah operator perbandingan menjadi '<'
                listMhs[j] = listMhs[j - 1]; // merubah listMhs[j] agar dapat terisi dengan nilai listMhs indeks sebelumnya
                j--;
            }
            listMhs[j] = temp;
        }
    }

}