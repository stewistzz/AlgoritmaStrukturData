package jobsheet03;

public class ClassMultiParameter {
    String name;
    int age;

    // Constructor pertama tanpa parameter
    public ClassMultiParameter() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor kedua dengan parameter nama
    public ClassMultiParameter(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor ketiga dengan parameter nama dan umur
    public ClassMultiParameter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void cetakData() {
        System.out.println("Nama orang : " + name + " ber-umur : " + age);
    }
}
