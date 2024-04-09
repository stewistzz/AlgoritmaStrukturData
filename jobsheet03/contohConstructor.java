package jobsheet03;

public class contohConstructor {
        String nama;
        int usia;
    
        // Konstruktor tanpa parameter
        public contohConstructor() {
            nama = "Belum Ditentukan";
            usia = 0;
        }
    
        // Konstruktor dengan parameter nama dan usia
        public contohConstructor(String nama, int usia) {
            this.nama = nama;
            this.usia = usia;
        }
    
        // Metode untuk mendapatkan informasi mahasiswa
        public void getInfo() {
            System.out.println( "Nama: " + nama + ", Usia: " + usia + " tahun");
        }
}
