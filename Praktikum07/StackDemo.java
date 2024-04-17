package Praktikum07;

public class StackDemo {
    public static void main(String[] args) 
    {
        Stack stack = new Stack(10); // membuat size
        // panggil method tambah elemen
        stack.push(8);
        stack.push(12);
        stack.push(18);

        // panggil method cetak
        stack.print();
        // method ambil top (pop)
        stack.pop();
        // method periksa elemen paling atas
        stack.peek();
        // stack.print();
        // method ambil top (pop)
        stack.pop();
        // method tambah elemen
        stack.push(-5);
        // method cetak
        stack.print();
    }
}
