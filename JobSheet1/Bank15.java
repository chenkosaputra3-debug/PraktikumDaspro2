
import java.util.Scanner;

public class Bank15 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int jml_tabungan_awal, lama_menabung;
            double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;

            System.out.println("Masukan jumlah Tabungan awal Anda ");
            jml_tabungan_awal = input.nextInt();
            System.out.println("Masukan lama menabung anda ");
            lama_menabung = input.nextInt();

            bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
            jml_tabungan_akhir = bunga + jml_tabungan_awal;
            System.out.println("Bunga adalah " + bunga);
            System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        }

    }

}