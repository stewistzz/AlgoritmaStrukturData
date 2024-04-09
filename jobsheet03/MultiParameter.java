package jobsheet03;

public class MultiParameter {
    public static void main(String[] args) {
        ClassMultiParameter orang1 = new ClassMultiParameter("Dmas");
        ClassMultiParameter orang2 = new ClassMultiParameter("Thomas", 17);
        orang1.cetakData();
        orang2.cetakData();
    }
}
