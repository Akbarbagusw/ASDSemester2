public class DataDosen2 {
    public static void dataSemuaDosen(Dosen2[] arrayOfDosen) {
        System.out.println("\n--- TAMPILAN SEMUA DATA DOSEN ---");
        int counter = 1;
        for (Dosen2 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            dosen.cetakInfo();
            counter++;
            System.out.println("---------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen2[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (Dosen2 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n--- JUMLAH DOSEN PER JENIS KELAMIN ---");
        System.out.println("Jumlah Dosen Pria \t: " + pria);
        System.out.println("Jumlah Dosen Wanita \t: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen2[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int countPria = 0;
        int totalUsiaWanita = 0;
        int countWanita = 0;
        
        for (Dosen2 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rerataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rerataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\n--- RATA-RATA USIA PER JENIS KELAMIN ---");
        System.out.printf("Rata-rata Usia Pria \t: %.2f\n", rerataPria);
        System.out.printf("Rata-rata Usia Wanita \t: %.2f\n", rerataWanita);
    }

    public static void infoDosenPalingTua(Dosen2[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen2 palingTua = arrayOfDosen[0];
        for (Dosen2 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }

        System.out.println("\n--- DOSEN PALING TUA ---");
        palingTua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen2[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen2 palingMuda = arrayOfDosen[0];
        for (Dosen2 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }

        System.out.println("\n--- DOSEN PALING MUDA ---");
        palingMuda.cetakInfo();
    }
}