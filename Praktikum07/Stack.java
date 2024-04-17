package Praktikum07;

public class Stack {
    // atribut
    int data[];
    int size, top;
    
    // constructor parameter
    Stack(int size)
    {
        this.size = size;
        data = new int[size]; // atribut dari data memiliki isi berupa size
        top = -1; // default dari nilai data yang belum memiliki nilai isi
    }

    // method isFull untuk mengecek apakah stack sudah penuh atau belum
    public boolean isFull()
    {
        if (top == size - 1) // dimana nilai indeks = size - 1 yang dimana jika hasilnya sama
        {   
            return true; // jika data stack penuh
        }
        else
        {
            return false; // jika stack masih belum penuh
        }
    }

    // method isEmpty untuk melakukan pengecekan apakah data stack sudah kosong atau belum
    public boolean isEmpty()
    {
        if (top == -1) // dimana nilai -1 adalah nilai jika semua data pada stack kosong
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // method push untuk melakukan penambahan elemen pada urutan paling atas
    public void push(int dt)
    {
        if (!isFull()) // selama kondisi tidak full maka jalankan
        {
            top++;
            data[top] = dt; // pada data indeks ke top isikan dengan data pada dt
        }
        else
        {
            System.out.println("Stack penuh");
        }
    }

    // method pop untuk mengampil elemen pada stack paling atas
    public void pop()
    {
        if (!isEmpty())
        {
            int x = data[top];
            top--;
            System.out.println("Data yang dikeluarkan dari stack : " + x);    
        }
        else
        {
            System.out.println("stack masih kosong");
        }
    }

    // method peek untnuk memeriksa elemen paling atas(top)
    public void peek()
    {
        System.out.println("Elemen teratas dari stack : " + data[top]);
    }

    // method print() untuk menampilkan seluruh elemen pada stack
    public void print()
    {
        System.out.println("Isi stack : ");
        for (int i = top; i >= 0; i--) // dimana pencetakan dilakukan berlawanan arah sesuai dengna data top array sebagai urutan awal
        {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    // method clear untuk mengosongkan stack
    public void clear()
    {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--)
            {
                top--; // untuk menghilangkan nilai dari top dengan menurunkan pointer
            }
            System.out.println("Data stack sudah dikosongkan");
        }
        else
        {
            System.out.println("Data stack masih kosong");
        }
    }
}
