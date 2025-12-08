package JobSheet12;
import java.util.Scanner;

public class kubus03 {
    public static int hitungVolume(int s) {
        return s * s * s;
    }

    public static int hitungLuasPermukaan(int s) {
        return 6 * (s * s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        int vol = hitungVolume(sisi);
        int lp = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus: " + vol);
        System.out.println("Luas Permukaan Kubus: " + lp);
    }
}