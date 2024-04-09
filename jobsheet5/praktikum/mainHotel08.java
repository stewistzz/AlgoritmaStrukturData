package jobsheet5.praktikum;

public class mainHotel08 {
    public static void main(String[] args) {
        HotelService08 list = new HotelService08();

        // object
        Hotel08 H1 = new Hotel08("Crown Victoria", "Tulungagung", 400000, (byte)5);
        Hotel08 H2 = new Hotel08("Swallow Hotel", "Malang", 390000, (byte)4);
        Hotel08 H3 = new Hotel08("Star Victoria", "Nganjuk", 410000, (byte)3);
        Hotel08 H4 = new Hotel08("Aladdin Place", "Kediri", 285000, (byte)1);
        Hotel08 H5 = new Hotel08("Rest Days", "Surabaya", 325000, (byte)2);

        list.tambahHotel(H1);
        list.tambahHotel(H2);
        list.tambahHotel(H3);
        list.tambahHotel(H4);
        list.tambahHotel(H5);

        // call function

        System.out.println("--------------------------------------");
        System.out.println("Data hotel sebelum sorting = \n--------------------------------------");
        list.tampilAll();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk Bubble Sort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.algBubbleSort();
        list.tampilAll();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk Selection Sort");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.algSelectionSort();
        list.tampilAll();
    }
}
