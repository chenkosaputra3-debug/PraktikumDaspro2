
import java.util.Scanner;

public class LapanganSepakBola {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int panjang, lebar;
            int luas;

            System.out.println("Masukkan Panjang : ");
            panjang = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            lebar = sc.nextInt();

            luas = panjang * lebar;
            System.out.println("Luasnya Lapangan Sepak Bola adalah = " + luas);

        }
    }
}
