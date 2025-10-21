package JobSheet7;
import java.util.Scanner;

public class SiakadFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0.0, terendah = 100.0;

        System.out.println("Program Mencari Nilai Tertinggi dan Terendah");
        System.out.println("============================================");

        for (int i = 1; i <= 10; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) { 
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai; 
            }
        }

        System.out.println("============================================");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah); 
        sc.close();
    }
}