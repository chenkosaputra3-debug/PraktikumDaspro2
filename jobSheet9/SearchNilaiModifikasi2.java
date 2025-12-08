package jobSheet9;
import java.util.Scanner;

public class SearchNilaiModifikasi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya wilayah yang diinput: ");
        int jumlahWilayah = sc.nextInt();

        int[] arrKonsumsi = new int[jumlahWilayah];

        for (int i = 0; i < arrKonsumsi.length; i++) {
            System.out.print("Masukkan total konsumsi " + (i + 1) + ": ");
            arrKonsumsi[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;
        int indeksHasil = -1;

        for (int i = 0; i < arrKonsumsi.length; i++) {
            if (key == arrKonsumsi[i]) {
                ditemukan = true;
                indeksHasil = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " ketemu, merupakan rata rata konsumsi" + (indeksHasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}buat kode javanya