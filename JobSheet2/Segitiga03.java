
import java.util.Scanner;

public class Segitiga03 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int alas, tinggi;
            float luas;

            System.out.println("Masukan alas: ");
            alas = sc.nextInt();
            System.out.println("Masukan tinggi: ");
            tinggi = sc.nextInt();

            luas = alas * tinggi / 2;

            System.out.println("Luas segitiga = " + luas);
            sc.close();

        }
    }
}
