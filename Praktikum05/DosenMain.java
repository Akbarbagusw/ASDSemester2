import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Termuda - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = s.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kd = s1.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nm = s1.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = s1.nextLine();
                    boolean jk = (jkInput.equalsIgnoreCase("L"));
                    
                    System.out.print("Usia          : ");
                    int usia = s.nextInt();
                    
                    Dosen d = new Dosen(kd, nm, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    System.out.println("\n--- Seluruh Data Dosen ---");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC(); 
                    System.out.println("\nData setelah diurutkan (ASC - Termuda ke Tertua):");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC(); 
                    System.out.println("\nData setelah diurutkan (DSC - Tertua ke Termuda):");
                    data.tampil();
                    break;
                
                case 5:
                    System.out.println("Keluar program...");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
