package reviewSortingDansearch.lathan.transaksiCase;

public class Rekening {
    // atribut
    String noRekening, nama, namaIbu, phone, email;

    Rekening()
    {}

    Rekening(String a, String b, String c, String d, String e)
    {
        noRekening = a;
        nama = b;
        namaIbu = c;
        phone = d;
        email = e;
    }

    static Rekening data[] = new Rekening[1000];
    static int idx;
    
    // method tambah
    static void tambah(Rekening dt)
    {
        if (idx < data.length) {
            data[idx] = dt;
            idx++;
        }
    }

    // tampilkan data
    static void tampilAll() {
        System.out.println();
        System.out.println("Data Rekening");
        System.out.println();
        System.out.println("No Rekening \t Nama \t Nama Ibu \t Phone \t Email");
        for (Rekening d : data) {
            if(d != null){
                System.out.println(d.noRekening+"\t"+d.nama+"\t"+d.namaIbu+"\t"+d.phone+"\t"+d.email);
            }
        }
        System.out.println();
    }

    // mengurutkan data rekening berdasarkan nama
    static void mengurutkanNamaRekenning()
    {
        for (int i = 0; i < idx-1; i++)
        {
            int min = i;
            for (int j = i + 1; j < idx; j++)
            {
                if (data[j].nama.compareTo(data[min].nama) < 0)
                {
                    // pindahkan min agar bernilai j
                    min = j;
                }
            }
            Rekening tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }


}
