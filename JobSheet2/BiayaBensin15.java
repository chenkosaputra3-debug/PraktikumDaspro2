
import java.util.Scanner;

public class BiayaBensin15 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double jarak, liter, biaya;
            final int hargaBensin= 10000;

            System.out.println("Masukkan jarak perjalanan (km): ");
            jarak=sc.nextDouble();

            liter=jarak / 2;

            biaya=liter * hargaBensin;

            System.out.println("Jarak: "+ jarak + " km");
            System.out.println("Bensin yang dibutuhkan: "+ liter + " liter");
            System.out.println("Biaya bensin = Rp. "+ biaya);


        }

    }

}
