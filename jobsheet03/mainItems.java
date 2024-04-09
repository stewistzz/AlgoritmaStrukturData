package jobsheet03;

public class mainItems {
    public static void main(String[] args) {

        // objek dari item
        Items jajan1 = new Items("Makaroni", 30000, 3);
        Items jajan2 = new Items("Mie-Ayam", 20000, 4);
        Items jajan3 = new Items("Siomay", 15000, 5);
        Items jajan4 = new Items();

        jajan1.displayInfo();
        jajan2.displayInfo();
        jajan3.displayInfo();

        jajan4.stock = 18;
        jajan4.displayInfo();
        
        Items[] item = new Items[3]; // untuk membuat array item dengan tipe data items, kita harus membuat class items terlebiih dahulu. karena items merujuk kepada class items utnuk referensi data yang diambil
        // item[0] = jajan1;
        // jajan1.displayInfo();



    }
}
