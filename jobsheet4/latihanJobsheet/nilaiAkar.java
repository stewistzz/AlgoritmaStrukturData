package jobsheet4.latihanJobsheet;

public class nilaiAkar {
    public double nilaiOrg;

    nilaiAkar() {
    }

    nilaiAkar(double nilaiOrg) {
        this.nilaiOrg = nilaiOrg;
    }

    // method untuk nilai akar brute force
    public double akarBF(double nilai) {
        if (nilai < 0) {
            return -1; // return -1 jika nilai kurang dari 0
        }
        double i = 0;
        while (i * i <= nilai) {
            i++;
        }
        return i - 1; // mengembalikan nilai akar yang telah dibulatkan ke bawah
    }

    // method untuk nilai akar divide conquer
    public double akarDC(double n, double low, double high) {
        // hitung untuk membagi nilai menjadi 2 bagian
        double divide = (high + low) / 2;
        // return divide;

        if (high - low < 0.00001) { // base case
            return divide;
        }
        if (divide * divide == n) { // kondisi pemilihan
            return divide;
        } else if(divide * divide < n) {
            return akarDC(n, divide, high);
        } else {
            return akarDC(n, low, divide);
        }
    }

}
