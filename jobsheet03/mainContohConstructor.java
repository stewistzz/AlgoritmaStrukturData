package jobsheet03;

public class mainContohConstructor {
    public static void main(String[] args) {
        // Contoh penggunaan konstruktor
        contohConstructor mhs1 = new contohConstructor("dimas", 19);
        contohConstructor mhs2 = new contohConstructor("andi", 20);
        contohConstructor mhs3 = new contohConstructor("dian", 33);

        mhs1.getInfo();
        mhs2.getInfo();
        mhs3.getInfo();
    }
}
