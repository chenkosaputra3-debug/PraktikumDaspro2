package jobSheet9;
import java.util.Scanner;

public class ArrayRataNilaiModifikasi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        int jumlahLulus = 0;
        int jumlahTdkLulus = 0;
        double rataLulus = 0;
        double rataTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jumlahTdkLulus++;
            }
        }

        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
        }
        if (jumlahTdkLulus > 0) {
            rataTdkLulus = totalTdkLulus / jumlahTdkLulus;
        }
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    }
}