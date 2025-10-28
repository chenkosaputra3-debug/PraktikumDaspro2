import java.util.Scanner;
public class MenghitungGajiKaryawan03{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int gajiPokok;
            double bonus,total_gaji;
            double tunjTransp= 600000;
            double tunjMakan=400000;

            System.out.println("Masukkan Gaji pokok anda= ");
            gajiPokok=sc.nextInt();

            bonus=0.05*gajiPokok;
            total_gaji=gajiPokok+tunjMakan+tunjTransp+bonus-(0.1*gajiPokok);

            System.out.println("Bonus bulanan anda adalah= " + bonus);
            System.out.println("Jumlah Gaji yang anda terima adalah= " + (int)total_gaji);


        }
    }
}