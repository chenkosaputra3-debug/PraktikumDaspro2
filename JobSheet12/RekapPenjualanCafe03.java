package JobSheet12;
import java.util.Scanner;

public class RekapPenjualanCafe03 {
    static Scanner sc = new Scanner(System.in);
    
    static String[] namaMenu;
    static int[][] dataPenjualan;

    public static void inputData(int jumlahMenu, int jumlahHari) {
        namaMenu = new String[jumlahMenu];
        dataPenjualan = new int[jumlahMenu][jumlahHari];

        sc.nextLine();
        for(int i = 0; i < jumlahMenu; i++){
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        System.out.println("\n--- Input Data Penjualan ---");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanTabel(int jumlahHari) {
        System.out.println("\n--- Rekap Penjualan ---");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= jumlahHari; i++) System.out.print("H" + i + "\t");
        System.out.println();

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print(namaMenu[i] + "\t\t"); 
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int jumlahHari) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < namaMenu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRataPenjualan(int jumlahHari) {
        System.out.println("\n--- Rata-rata Penjualan per Menu ---");
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += dataPenjualan[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.println(namaMenu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        int jMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jHari = sc.nextInt();

        inputData(jMenu, jHari);
        tampilkanTabel(jHari);
        menuTertinggi(jHari);
        rataRataPenjualan(jHari);
    }
}