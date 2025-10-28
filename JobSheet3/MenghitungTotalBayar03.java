import java.util.Scanner;

public class MenghitungTotalBayar03{

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            double harga;
            double potongan;
            double jml_bayar;
            double diskon = 0.15;

        System.out.println("Masukkan harga= ");
        harga=input.nextDouble();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus dibayar= "+ jml_bayar);
        System.out.println("Potongan= " + potongan);


        }
    }

}
