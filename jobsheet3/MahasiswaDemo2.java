import java.util.Scanner;
public class MahasiswaDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa2[] arrayOfMahasiswa = new Mahasiswa2[3];
        String dummy;

        for(int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa2();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1) + ": ");
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = scanner.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = scanner.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = scanner.nextLine();
            System.out.print("IPK   : ");
            dummy = scanner.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("-----------------------------");
        }
        // for(int i = 0; i < 3; i++) {
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
        //     System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
        //     System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
        //     System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
        //     System.out.println("-----------------------------");
        // }
        // arrayOfMahasiswa[0] = new Mahasiswa2();
        // arrayOfMahasiswa[0].nim = "123456789";
        // arrayOfMahasiswa[0].nama = "Akbar";
        // arrayOfMahasiswa[0].kelas = "TI-2A";
        // arrayOfMahasiswa[0].ipk = (float) 3.75;

        // arrayOfMahasiswa[1] = new Mahasiswa2();
        // arrayOfMahasiswa[1].nim = "987654321";
        // arrayOfMahasiswa[1].nama = "Budi";
        // arrayOfMahasiswa[1].kelas = "TI-2B";
        // arrayOfMahasiswa[1].ipk = (float) 3.50;

        // arrayOfMahasiswa[2] = new Mahasiswa2();
        // arrayOfMahasiswa[2].nim = "456789123";
        // arrayOfMahasiswa[2].nama = "Citra";
        // arrayOfMahasiswa[2].kelas = "TI-2C";
        // arrayOfMahasiswa[2].ipk = (float) 3.90;

        // System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        // System.out.println("-----------------------------");
        // System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
        // System.out.println("-----------------------------");
        // System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
        // System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);
        // System.out.println("-----------------------------");
    }
}