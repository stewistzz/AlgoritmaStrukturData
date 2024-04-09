package jobsheet5;

public class mainMahasiswa {
    public static void main(String[] args) {
        daftarMahasiswaberprestasi list = new daftarMahasiswaberprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);
        Mahasiswa m6 = new Mahasiswa("Dimas", 2020, 19, 3.6);

        // data [3, 4, 3.5, 2, 3.75]

        list.tambahMhs(m1);
        list.tambahMhs(m2);
        list.tambahMhs(m3);
        list.tambahMhs(m4);
        list.tambahMhs(m5);
        // list.tambahMhs(m6);

        System.out.println("--------------------------------------");
        System.out.println("Data mahasiswa sebelum sorting = \n--------------------------------------");
        list.tampil();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk Bubble Sort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.bubbleSort();
        list.tampil();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk Selection Sort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.selectionSort();
        list.tampil();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk insertion Sort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.insertionSort();
        list.tampil();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk insertion Sort Descending");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.insertionDescendingSort();
        list.tampil();
    }
}
