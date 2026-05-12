public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahKRS = 0;
    final int TOTAL_KUOTA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        int jumlahProses = (size >= 2) ? 2 : 1;
        System.out.println("Memproses " + jumlahProses + " mahasiswa:");
        
        for (int i = 0; i < jumlahProses; i++) {
            Mahasiswa m = data[front];
            System.out.print("- ");
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        }
    }

    public void printSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void peek2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            int limit = (size >= 2) ? 2 : 1;
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void peekAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void cetakStatistik() {
        System.out.println("Jumlah dalam antrian saat ini: " + size);
        System.out.println("Jumlah mahasiswa sudah KRS: " + sudahKRS);
        System.out.println("Mahasiswa belum proses (dari kuota 30): " + (TOTAL_KUOTA - sudahKRS));
    }
}