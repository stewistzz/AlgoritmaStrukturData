package jobsheet03;

public class persegiPanjang {
    public int panjang, lebar, i;

    persegiPanjang() {

    }

    persegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // method hitung luas dan hitung keliling
    int hitungLuas() {
        return panjang * lebar;
    }
    int hitungKeliling() {
        return  2 * (panjang + lebar);
    }

    void cetakData() {
        // perulangan untuk mencetak program
            System.out.println(" Panjang : " + panjang + ", lebar : " + lebar + " Luas : " + hitungLuas() + " Keliling : " + hitungKeliling());
    }
    
}

