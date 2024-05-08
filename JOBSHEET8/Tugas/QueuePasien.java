package JOBSHEET8.Tugas;

public class QueuePasien {
    // atribut
    Pasien[] antrian;
    int front, rear, size, max;
    
    public QueuePasien(int n)
    {
        max = n;
        antrian = new Pasien[max];
        size = 0;
        front = rear = -1; // set default
    }


    // method isEmpty untuk melakukan pengecekan bila kosong
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;    
        }
        else
        {
            return false;
        }
    }

    // method is full jik asudah penuh
    public boolean isFull()
    {
        if (size == max)
        {
            return true;    
        }
        else
        {
            return false;
        }
    }

    // enqueue
    public void Enqueue(Pasien dt)
    {
        if (isFull())
        {
            System.out.println("Queue sudah penuh");
        }
        else
        {
            if (isEmpty())
            {
                front = rear = 0;
            }
            else
            {
                if (rear == max - 1)
                {
                    rear = 0;    
                }
                else
                {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    // dequeue
    // method dequeue
    public Pasien Dequeue()
    {
        Pasien dt = new Pasien();
        if (isEmpty())
        {
            System.out.println("queue masih kosong");    
        }
        else
        {
            dt = antrian[front];
            size--;
            if (isEmpty())
            {
                front = rear = -1;    
            }
            else
            {
                if (front == max - 1)
                {
                    front = 0;    
                }
                else
                {
                    front++;
                }
            }
        }
        return dt;
    }

    // method print untuk menampilkan semua data dalam queue
    public void printPasien()
    {
        if (isEmpty())
        {
            System.out.println("Queue masih ksoong");    
        }
        else
        {
            int i = front;
            while (i != rear)
            {
                System.out.println("------------------------------------------------------------------------");
                System.out.println(antrian[i].nama + "\t|\t" + antrian[i].noId + "\t|\t" + antrian[i].jenisKelamin + "\t|\t" + antrian[i].umur + "\t|\t");
                System.out.println("------------------------------------------------------------------------");
                i = (i + 1) % max;    
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(antrian[i].nama + "\t|\t" + antrian[i].noId + "\t|\t" + antrian[i].jenisKelamin + "\t|\t" + antrian[i].umur + "\t|\t");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    // method peek untuk menampilkan elemen paling depan
    public void peekPasien()
    {
        if (!isEmpty())
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(antrian[front].nama + "\t|\t" + antrian[front].noId + "\t|\t" + antrian[front].jenisKelamin + "\t|\t" + antrian[front].umur + "\t|\t");
            System.out.println("-------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("queue masih kosong");
        }
    }

    // cek data paling belakang
    public void peekRear()
    {
        if (!isEmpty())
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(antrian[rear].nama + "\t|\t" + antrian[rear].noId + "\t|\t" + antrian[rear].jenisKelamin + "\t|\t" + antrian[rear].umur + "\t|\t");  
            System.out.println("--------------------------------------------------------------------------");       
        }
        else
        {
            System.out.println("queue masih kosong");
        }
    }

    // peekPosition untuk mencari letak pasien berdasarkan nama
    public void peekPosition(String nama)
    {
        // cek set default untuk nilai awal pencarian
        boolean cari = false;
        int posisi = 0; // sebegai petunjuk dari indeks
        int i = front;
        while (i != rear)
        {
            posisi++;
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                cari = true;
                break;
            }
            i = (i + 1) % max;
        }
        if (antrian[rear].nama.equals(nama)) {
            cari = true;
            posisi = size;
        }
        if (cari) {
            System.out.println("Pasien dengan nama " + nama + " berada pada posisi " + posisi + " dalam antrian.");
        } else {
            System.out.println("Pasien dengan nama " + nama + " tidak ditemukan dalam antrian.");
        }
    }

    // method print untuk menampilkan semua data dalam queue
    public void printNasabah()
    {
        if (isEmpty())
        {
            System.out.println("Queue masih ksoong");    
        }
        else
        {
            int i = front;
            while (i != rear)
            {
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println(antrian[i].nama + "\t|\t" + antrian[i].noId + "\t|\t" + antrian[i].jenisKelamin + "\t|\t" + antrian[i].umur + "\t|\t");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                i = (i + 1) % max;    
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println(antrian[i].nama + "\t|\t" + antrian[i].noId + "\t|\t" + antrian[i].jenisKelamin + "\t|\t" + antrian[i].umur + "\t|\t");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Jumlah Elemen = " + size);
        }
    }
}
