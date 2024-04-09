package jobsheet4.minggu5;

public class Faktorial {
    int nilai;

    Faktorial() {
    }

    Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public int faktorialBF(int nilai) { // pada brute force berada pada method faktorialBF

        int fakto = 1;
        for (int i = 1; i <= nilai; i++) { // disini kita menggunakan nilai sebagai batasan untuk menjalankan program
                                           // dengan berurutan sesuai dengan value nilai
            fakto = fakto * i; // proses dilakukan berulang dengan mengalikan fakto = 1 dengan banyaknya value
                               // i yang terus bertambah
            /*
             * comntoh
             * 1 * 1 = 1
             * 1 * 2 = 2
             * 2 * 3 = 6 (maka nilai faktorial 3 adalah 6)
             */
        }
        
        return fakto;
    }

    public int faktorialDC(int nilai) { // pada divide conquer berada pada merhpd faktorialDC

        

        if (nilai == 1) { // value pada nilai akan langsung dilakukan pengecekan apakah bernilai 1?
            return 1; // last. ketika value dari nilai == 1 maka ia akan mengembalikan nilai 1
        } else { // jika kondisi if tidak terpenuhi maka turun ke else
            int fakto = nilai * faktorialDC(nilai - 1);
            return fakto;
        }
        
    }

}