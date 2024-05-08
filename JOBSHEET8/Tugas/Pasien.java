package JOBSHEET8.Tugas;

public class Pasien {
    // atribut
    String nama;
    int noId, umur;
    char jenisKelamin;

    // constructor
    Pasien()
    {

    }
    // parameter
    Pasien(String nama, int noId, char jenisKelamin, int umur)
    {
        this.nama = nama;
        this.noId = noId;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }
}
