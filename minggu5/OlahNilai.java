public class OlahNilai {
    int cariMaxUTS(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int kiri = cariMaxUTS(arr, l, mid);
        int kanan = cariMaxUTS(arr, mid + 1, r);
        
        return (kiri > kanan) ? kiri : kanan;
    }

    int cariMinUTS(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int kiri = cariMinUTS(arr, l, mid);
        int kanan = cariMinUTS(arr, mid + 1, r);
        
        return (kiri < kanan) ? kiri : kanan;
    }

    double hitungRataUAS(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}