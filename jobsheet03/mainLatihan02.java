package jobsheet03;

public class mainLatihan02 {
    public static void main(String[] args) {
        
        int[] daftarNilai = new int[5];

        daftarNilai[0] = 7;
        daftarNilai[1] = 3;
        daftarNilai[2] = 8;
        daftarNilai[3] = 2;
        daftarNilai[4] = 1;

        // for (int i = 0; i < daftarNilai.length; i++) {
        //     System.out.println(daftarNilai[i]);
        // }

        // perulangan untuk cetak
        for (int i : daftarNilai) {
            System.out.println(i);
        }


    }
}
