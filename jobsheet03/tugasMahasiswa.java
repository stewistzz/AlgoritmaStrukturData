package jobsheet03;

public class tugasMahasiswa {
    String nama, kelamin, nim;
    double ipk;
    
    // constructor
    tugasMahasiswa() {

    }
     tugasMahasiswa(String namaMhs, String Nim, String kelaminMhs, double ipkMhs) {
        //TODO Auto-generated constructor stub
        nama = namaMhs;
        nim = Nim;
        kelamin = kelaminMhs;
        ipk = ipkMhs;
    }

    
    // method tampil data
    void cetakLaporan(tugasMahasiswa[] arrayLaporanMhs) {
        System.out.println("================================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis kelamin: " + kelamin);
        System.out.println("Nilai IPK: " + ipk);
        // System.out.println("nilai rata IPK mahasiswa : " + rataIpkMhs(ipk, arrayLaporanMhs.length));
    }

}

        // rata ipk mahasiswa
        // static double hitungRataIpkMhs(tugasMahasiswa[] arrayLaporanMhs) {
        //     double totalIpk = 0;
        //     for (tugasMahasiswa mhs : arrayLaporanMhs) {
        //         totalIpk += mhs.ipk;
        //     }
        //     return totalIpk / arrayLaporanMhs.length;
        // }