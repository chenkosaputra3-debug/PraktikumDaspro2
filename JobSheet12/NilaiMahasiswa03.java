package JobSheet12;
import java.util.Scanner;

public class NilaiMahasiswa03 {
    static Scanner sc = new Scanner(System.in);

    public static void inputNilai(int[] nilaiMhs) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
    }

    public static void tampilNilai(int[] nilaiMhs) {
        System.out.println("\n--- Daftar Nilai ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }

    public static int hitungTotal(int[] nilaiMhs) {
        int total = 0;
        for (int nilai : nilaiMhs) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[n]; 
        inputNilai(nilaiMahasiswa);
        tampilNilai(nilaiMahasiswa);
        
        int total = hitungTotal(nilaiMahasiswa);
        double rata = (double) total / n;
        
        System.out.println("\nTotal Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rata);
    }
}