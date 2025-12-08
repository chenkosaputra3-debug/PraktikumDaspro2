package Jobshet8;
import java.util.Scanner;

public class Tugas1_JumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        int totalJumlahKuadrat = 0;
        String rincianPerhitungan = "";

        for (int i = 1; i <= n; i++) {
            
 
            int nilaiKuadrat = 0;
            for (int j = 1; j <= i; j++) {
                nilaiKuadrat += i; 
            }

            totalJumlahKuadrat += nilaiKuadrat;
            
            if (i == 1) {
                rincianPerhitungan += nilaiKuadrat;
            } else {
                rincianPerhitungan += " + " + nilaiKuadrat;
            }
        }

        System.out.println("n=" + n + " -> jumlah kuadrat = " + rincianPerhitungan + " = " + totalJumlahKuadrat);
    }
}