package JOBSHEET8.praktikum1;

public class queue {
    int data[], front, rear, size, max;

    // constructor
    queue(int n)
    {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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
    public void peek()
    {
        if (!isEmpty())
        {
            System.out.println("elemen terdepan : " + data[front]);    
        }
        else
        {
            System.out.println("queue masih kosong");
        }
    }

    // method print untuk menampilkan semua data dalam queue
    public void print()
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
                System.out.println(data[i] + " ");
                i = (i + 1) % max;    
            }
            System.out.println(data[i] + " ");
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

    // method enqueue
    public void enqueue(int dt) // berguna untuk menambahkan nilai
    {
        if (isFull())
        {
            System.out.println("queue sudah penuh");    
            System.exit(0); // Menghentikan program
        }
        else
        {
            if (isEmpty())
            {
                front = rear = 0;    
            }
            else
            {
                if (rear == max - 1) // disini rear merupakan nilai indeks maksimal dari panjang array sehingga nantinya akan dikembalikan ke awal atau 0
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

    // method dequeue
    public int dequeue()
    {
        int dt = 0;
        if (isEmpty())
        {
            System.out.println("queue masih kosong");  
            System.exit(0); // Menghentikan program
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

}
