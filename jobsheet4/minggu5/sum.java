package jobsheet4.minggu5;

public class sum {
    public int element;
    public double keuntungan[], total;

    // constructor
    sum() {
    }

    sum(int element) {
        this.element = element;
        this.keuntungan = new double[element];
        this.total = 0;
    }

    // method total BF
    double totalBF(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    // method total DC
    double totalDC(double arr[], int L, int r) {
        if (L == r) {
            return arr[L];
        } else if (L < r) {
            int mid = (L + r) / 2;
            double lsum = totalDC(arr, L, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
