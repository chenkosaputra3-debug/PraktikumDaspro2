import java.util.Scanner;

public class ifCetakKRS15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Cetak KRS SIAKAD ---");
            System.out.print("Apakah UKT sudah lunas? (true/false): ");
            boolean uktLunas = sc.nextBoolean();
            
            if (uktLunas) {
                System.out.println("Pembayaran UKT Terverifikasi");
                System.out.println("Silakan Cetak KRS dan minta tanda tangan DPA");
            }
            

        }
    }
}