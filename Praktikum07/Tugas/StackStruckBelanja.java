package Praktikum07.Tugas;

public class StackStruckBelanja {
    // stack
    int size, top;
    StrukBelanja[] data;

    public StackStruckBelanja(int size)
    {
        this.size = size;
        data = new StrukBelanja[size];
        top = -1;
    }

    public boolean isFull()
    {
        if (top == size - 1) // kondisi jika indeks top dengan indeks pada size -1 sama maka data penuh
        {
            return true; // data penuh
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) // kosong
        {
            return true;
        } else {
            return false;
        }
    }

    // method untuk push data
    public void push(StrukBelanja detail) {
        if (!isFull()) {
            top++;
            data[top] = detail;
        } else {
            System.out.println("Stack penuh");
        }
    }

    // method pop data
    public void popStruk() {
        if (!isEmpty()) {
            StrukBelanja x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.NomorTransaksi + " " + x.jumlahBeli + " " + x.TotalBayar + " "
                    + x.TanggalPembelian);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    // peek
    public void peekStruk()
    {
        System.out.println("elemen teratas : " + data[top].NomorTransaksi + " " + data[top].jumlahBeli + " " + data[top].TotalBayar + " " + data[top].TanggalPembelian + " ");
    }

    // print struk
    public void printStruk()
    {
        System.out.println("isi stack : ");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("| No\t|\tJmlBeli\t| TtlBayar\t|\tTanggal |");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = top; i >= 0; i--)
        {
            System.out.println("| " + data[i].NomorTransaksi + "\t|\t" + data[i].jumlahBeli + "\t|\t" + data[i].TotalBayar + "\t|\t" + data[i].TanggalPembelian + " |");    
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    // clear
    public void clear()
    {
        if (!isEmpty())
        {
            for (int i = top; i >= 0; i--)
            {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");    
        }
        else
        {
            System.out.println("Stack masih kosong");
        }
    }
}