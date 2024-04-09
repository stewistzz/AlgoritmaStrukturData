package jobsheet03;

public class Items {
    String jajan;
    double harga;
    int stock;

    Items() {

    }

    Items(String namaItem, double hargaItem, int stockItem) {
        jajan = namaItem;
        harga = hargaItem;
        stock = stockItem;
    }

    public void displayInfo() {
        System.out.println("Jajanan : " + jajan);
        System.out.println("Harga : " + harga);
        System.out.println("Stock jajan : " + stock);
        System.out.println();
    }

}
