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
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("| " + data[i].jenis + "\t|\t" + data[i].warna + "\t|\t" + data[i].merk + "\t|\t" + data[i].ukuran + "\t|\t" + data[i].harga + "|");    
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
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

    // menambahkan method search getMax untuk mencari harga pakaian tertinggi
    // menggunakan sorting untuk membandingkan harga
    void getMax()
    {
        // jika pakaian tidak kosng
        if (!isEmpty())
        {
            // set nilai max awal
            Pakaian maxPakaian = data[0]; // karena data 0 sementara data terbesar maka looping dimuali dari indeks ke-1
            for (int i = 1; i <= top; i++) // top berupa indeks
            {
                if (data[i].harga > maxPakaian.harga) 
                {
                    maxPakaian = data[i];
                }    
            }
            System.out.println("Pakaian dengan harga tertinggi:");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("|"+ maxPakaian.jenis + "\t|\t" + maxPakaian.warna + "\t|\t" + maxPakaian.merk + "\t|\t" + maxPakaian.ukuran + "\t|\t" + maxPakaian.harga + "|");
            System.out.println("---------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("Stack kosong");
        }
    }

    public void getMaxPakaian() {
        double hargaMax =0;
        int indexMax = -1;
        for (int i = top; i >= 0; i--) {
            if(data[i].harga > hargaMax ){
                hargaMax = data[i].harga;
                indexMax = i;
            }
        }
        System.out.println(data[indexMax].jenis + " " + data[indexMax].warna + " " + data[indexMax].merk + " " + data[indexMax].ukuran + " "
        + data[indexMax].harga + " ");
        System.out.println();
    }

}