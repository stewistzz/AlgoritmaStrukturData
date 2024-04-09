package jobsheet4.minggu5;

public class pangkat {
    public int nilai, pangkat;

    // constructor
    pangkat(){}

    pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // method BF
    public int pangkatBF(int a, int n) { // method brute force
        int hasil = 1; // dimulai dengan instruksi instansiasi variabel hasil

        for (int i = 0; i < n; i++) { // masuk kedalam proses perulangan dengan melakukan cek apakah i lebih kecil dengan pangkat(n) yang dinputkan user
            hasil = hasil * a; // jika kondisi true maka hasil=1 tadi akan dikalikan dengan nilai(a) yang akan dipangkatkan
            /* contohnya 6,2
             * maka hasil = 1 * 6 (0 < 2)
             * hasil = 6 * 6 (1 < 2)
             * hasil = 36 * 6 (2 < 2) "false"
             */
        }
        return hasil; // maka kemudian turun dengan mereturn kan hasil terkahir kali dihitung(36)
    }

    // method DC
    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) { // cek bilangan ganjil
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) *a);
            }else {
                return(pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}
