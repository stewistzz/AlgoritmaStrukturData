package JOBSHEET8.praktikum2;

public class QueueNasabah {
    Nasabah []data;
    int front, rear, size, max;

    public QueueNasabah(int n)
    {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1; // set default
    }

    // enqueue
    public void Enqueue(Nasabah dt)
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
            data[rear] = dt;
            size++;
        }
    }

    // dequeue
    // method dequeue
    public Nasabah Dequeue()
    {
        Nasabah dt = new Nasabah();
        if (isEmpty())
        {
            System.out.println("queue masih kosong");    
        }
        else
        {
            dt = data[front];
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

    // method peek untuk menampilkan elemen paling depan
    public void peekNasabah()
    {
        if (!isEmpty())
        {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("elemen terdepan : " + data[front].noRek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);    
            System.out.println("----------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("queue masih kosong");
        }
    }

    public void peekRear()
    {
        if (!isEmpty())
        {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("elemen paling belakang : " + data[rear].noRek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);    
            System.out.println("----------------------------------------------------------------------------------");       
        }
        else
        {
            System.out.println("queue masih kosong");
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
                System.out.println(data[i].noRek + "\t|\t" + data[i].nama + "\t|\t" + data[i].alamat + "\t|\t" + data[i].umur + "\t|\t" + data[i].saldo);
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                i = (i + 1) % max;    
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println(data[i].noRek + "\t|\t" + data[i].nama + "\t|\t" + data[i].alamat + "\t|\t" + data[i].umur + "\t|\t" + data[i].saldo);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    // method clear untuk menghapus smeua elemen pada queue
    public void clear()
    {
        if(!isEmpty())
        {
            front = rear = -1;
            size = 0;
            System.out.println("Queue telah berhasil dikosongkan");
        }
        else
        {
            System.out.println("queue masih kosong");
        }
    }
}
