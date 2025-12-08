package jobSheet9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        double totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];
        }
        System.out.println("\n--- Daftar Pesanan ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        
        System.out.println("\n------------------------");
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}