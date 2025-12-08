import java.util.Scanner;
public class Kuis2 {

    public static final String[] HARI = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

    public static final int[] KONSUMSI_A = {450, 480, 420, 500, 520, 490, 470};
    // Wilayah B
    public static final int[] KONSUMSI_B = {620, 600, 580, 650, 680, 610, 590};
    public static final int[] KONSUMSI_C = {310, 330, 300, 350, 360, 320, 310};

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("  ANALISIS KONSUMSI AIR BERSIH (BPSD)  ");
        System.out.println("=========================================");
        
        analisisWilayah("A", KONSUMSI_A);
        analisisWilayah("B", KONSUMSI_B);
        analisisWilayah("C", KONSUMSI_C);
    }

    public static void analisisWilayah(String namaWilayah, int[] konsumsi) {
        
        // A. Hitung Total Konsumsi
        int total = hitungTotal(konsumsi);
        
        double rataRata = (double) total / HARI.length; 

        // C. Cari Hari Ekstrem (Tertinggi dan Terendah)
        String[] tertinggi = cariEkstrem(konsumsi, true);  // true = cari tertinggi
        String[] terendah = cariEkstrem(konsumsi, false); // false = cari terendah

        // D. Tampilkan Hasil
        System.out.println("\n--- Hasil Analisis Wilayah " + namaWilayah + " ---");
        System.out.println("Konsumsi Harian: " + arrayToString(konsumsi));
        System.out.println("Total Konsumsi Mingguan: " + total + " m³");
        System.out.printf("Rata-rata Konsumsi Harian: %.2f m³\n", rataRata);
        System.out.println("Hari Konsumsi TERTINGGI: " + tertinggi[0] + " (" + tertinggi[1] + " m³)");
        System.out.println("Hari Konsumsi TERENDAH: " + terendah[0] + " (" + terendah[1] + " m³)");
        System.out.println("----------------------------------------");
    }

    // FUNGSI BANTUAN 1: Menghitung Total
    public static int hitungTotal(int[] arr) {
        int sum     
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static String[] cariEkstrem(int[] arr, boolean cariTertinggi) {
        int nilaiEkstrem = arr[0];
        String hariEkstrem = HARI[0];

        for (int i = 1; i < arr.length; i++) {
            if (cariTertinggi) {
                if (arr[i] > nilaiEkstrem) {
                    nilaiEkstrem = arr[i];
                    hariEkstrem = HARI[i];
                }
            } else {

                if (arr[i] < nilaiEkstrem) {
                    nilaiEkstrem = arr[i];
                    hariEkstrem = HARI[i];
                }
            }
        }
        return new String[]{hariEkstrem, String.valueOf(nilaiEkstrem)};
    }
    public static String arrayToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}