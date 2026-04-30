public class StackSurat {
    Surat[] data;
    int size;
    int top;

    public StackSurat(int size) {
        this.size = size;
        data = new Surat[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat srt) {
        if (!isFull()) {
            top++;
            data[top] = srt;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat srt = data[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return null;
        }
    }

    // Fitur Cari Surat berdasarkan nama mahasiswa
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (top - i + 1));
                System.out.println("ID: " + data[i].idSurat + ", Jenis: " + data[i].jenisIzin);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}