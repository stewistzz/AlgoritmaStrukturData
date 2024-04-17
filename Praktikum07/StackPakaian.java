package Praktikum07;

import jobsheet4.minggu5.pangkat;

public class StackPakaian
{
    int size, top;
    Pakaian data[];

    public StackPakaian(int size)
    {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    // METHOD ISEMPTY
    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;    
        }
        else
        {
            return false;
        }
    }

    // method isFull
    public boolean isFull()
    {
        if (top == size - 1)
        {
            return true; // full    
        }
        else
        {
            return false; // tidak full 
        }
    }

    // method push
    public void push(Pakaian pkn)
    {
        if (!isFull()) // cek ketika data tidak penuh maka lakukan
        {
            top++;
            data[top] = pkn;    
        }
        else
        {
            System.out.println("Isi stack penuh");
        }
    }

    // method pop
    public void pop()
    {
        if (!isEmpty())
        {
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);    
        }
        else
        {
            System.out.println("Stack masih kosong");
        }
    }

    // method peek
    public void peek()
    {
        System.out.println("elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    // method print
    public void print()
    {
        System.out.println("isi stack : ");
        for (int i = top; i >= 0; i--)
        {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");    
        }
    }

    // method
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
