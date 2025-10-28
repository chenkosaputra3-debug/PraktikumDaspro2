
import java.util.Scanner;

public class CicilanMotor03 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double harga, uangMuka, bunga,sisa, totalBayar,cicilan;
            int bulan;

            System.out.println("Masukkan harga Motor=");
            harga=sc.nextDouble();
            System.out.println("Masukkan uang muka=");
            uangMuka=sc.nextDouble();
            System.out.println("Masukkan lama cicilan per-Bulan=");
            bulan=sc.nextInt();

            sisa=harga - uangMuka;

            bunga=sisa * 0.01 * bulan;

            totalBayar= sisa + bunga;

            cicilan= totalBayar / bulan;

            System.out.println("Sisa Hutang= "+ sisa);
            System.out.println("Total Bunga= "+ bunga);
            System.out.println("Total yang harus dibayar= "+ totalBayar);
            System.out.println("Cicilan Perbulan anda = Rp. " + cicilan);


        }
    }
}
