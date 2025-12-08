import java.util.Scanner;

public class Tugas {
    static Scanner sc = new Scanner(System.in);

    static int hitungTotalRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + hitungTotalRekursif(n - 1);
        }
    }

    static int hitungTotalIteratif(int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        System.out.println("Total (Rekursif): " + hitungTotalRekursif(n));
    }
}