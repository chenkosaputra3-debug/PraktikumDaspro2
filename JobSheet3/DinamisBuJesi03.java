
import java.util.Scanner;

public class DinamisBuJesi03 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan gaji Pokok: ");
            int gajiPokok = input.nextInt();

            System.out.println("Masukkan tunjangan anak: ");
            int tunjanganAnak = input.nextInt();

            System.out.println("Masukkan jumlah anak: ");
            int jumlahAnak = input.nextInt();

            System.out.println("Potongan Pensiun: 5% ");
            double potonganPensiun = 0.05 * gajiPokok;
            double gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - potonganPensiun;
            System.out.println("Gaji bersih: Rp. " + gajiBersih);
        }
    }

}
