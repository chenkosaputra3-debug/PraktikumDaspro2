package JobSheet7;
import java.util.Scanner;

public class Tugas1Bioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiketHarian = 0;
        double totalPenjualanHarian = 0.0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jmlTiket = sc.nextInt();
            sc.nextLine();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah yang benar.");
            } else {
  
                double totalBayar = (double) jmlTiket * hargaTiket;

                if (jmlTiket > 10) {
                    totalBayar = totalBayar * 0.85;
                } else if (jmlTiket > 4) {
                    totalBayar = totalBayar * 0.90;
                }

                System.out.println("Total yang harus dibayar: Rp " + totalBayar);

                totalTiketHarian += jmlTiket;
                totalPenjualanHarian += totalBayar;
            }

            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            String tambahLagi = sc.nextLine();

            if (!tambahLagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("======================================");
        System.out.println("Total tiket terjual hari ini: " + totalTiketHarian);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualanHarian);

        sc.close();
    }
}