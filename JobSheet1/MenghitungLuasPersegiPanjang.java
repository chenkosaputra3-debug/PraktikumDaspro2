
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int panjang;
            int lebar;
            int luas;
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            luas = panjang * lebar;
            System.out.println("Luas persegi panjang: " + luas);
        }

    }
}