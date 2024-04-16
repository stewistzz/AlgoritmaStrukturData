package reviewSortingDansearch.pbo;

import Kuis1_DimasSetyoNugroho_SIB1C.mainAksesoris;
import jobsheet03.mainPersegiPanjang;

public class bubbleMahasiswa {
    // object mahasiswa
    bubble[] mahasiwa = new bubble[3];
    int idx;

    // tambah mahasiswa
    void tambahMhs(bubble mhs) {
        if (idx < mahasiwa.length) {
            mahasiwa[idx] = mhs;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (bubble b : mahasiwa) {
            b.tampilMhs();
            System.out.println("-------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < mahasiwa.length; i++) {
            for (int j = 0; j < mahasiwa.length-1; j++) {
                if (mahasiwa[j].ipk > mahasiwa[j+1].ipk) {
                    double temp = mahasiwa[j].ipk;
                    mahasiwa[j].ipk = mahasiwa[j+1].ipk;
                    mahasiwa[j+1].ipk = temp;
                }
            }
        }
    }

    // method untuk selection sort
    void selectionSort() {
        for (int i = 0; i < mahasiwa.length; i++) {
            // siapkan nilai awal 
            int nilaiBatas = i;
            for (int j = i; j < mahasiwa.length; j++) {
                if (mahasiwa[nilaiBatas].ipk < mahasiwa[j].ipk) {
                    nilaiBatas = j;
                }
            }
            // swap pada alogoritma selection akan dilakukan ketika sudah selesai melakukan perulangan untuk pengecekan tiap sesi
            bubble tampung = mahasiwa[i];
            mahasiwa[i] = mahasiwa[nilaiBatas];
            mahasiwa[nilaiBatas] = tampung;
        }
    }

    // method untuk insertion sort
    void insertionSort() {
        // dimulai membandingkan data sebelah kanan dari data awal
        for (int i = 1; i < mahasiwa.length; i++) {
            // persiapkan nilai temporary
            bubble temporary = mahasiwa[i];
            // inner loop
            int j = i;
            while (j > 0 && mahasiwa[j-1].ipk < temporary.ipk ) {
                mahasiwa[j] = mahasiwa[j-1];
                j--;
            }
            mahasiwa[j] = temporary;
        }
    }

}
