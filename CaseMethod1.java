import java.util.Scanner;

public class CaseMethod1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.println("========================================");

        System.out.println("Mata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Nilai UTS : ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();
        System.out.println("========================================");

        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS : ");
        double utsStrukdat = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double uasStrukdat = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasStrukdat = input.nextDouble();
        System.out.println("========================================");

        System.out.println("INPUT NILAI PENUNJANG SEMESTER");
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Etika    : ");
        double nilaiEtika = input.nextDouble();
        System.out.println("========================================");
        System.out.println();

        double nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double nilaiAkhirStrukdat = (utsStrukdat * 0.3) + (uasStrukdat * 0.4) + (tugasStrukdat * 0.3);

        String nilaiHurufAlgo = konversiNilaiHuruf(nilaiAkhirAlgo);
        String nilaiHurufStrukdat = konversiNilaiHuruf(nilaiAkhirStrukdat);
        String statusAlgo = nilaiAkhirAlgo >= 60 ? "LULUS" : "TIDAK LULUS";
        String statusStrukdat = nilaiAkhirStrukdat >= 60 ? "LULUS" : "TIDAK LULUS";

        double rataRataNilaiAkhir = (nilaiAkhirAlgo + nilaiAkhirStrukdat) / 2;
        String statusSemester;

        if (statusAlgo.equals("LULUS") && statusStrukdat.equals("LULUS") && rataRataNilaiAkhir > 60 && nilaiKehadiran > 75 && nilaiEtika > 70) {
            statusSemester = "LULUS";
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("HASIL PENILAIAN AKADEMIK");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-25s | %-10s | %-10s | %-10s | %-12s | %-12s | %-10s\n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-25s | %-10.2f | %-10.2f | %-10.2f | %-12.2f | %-12s | %-10s\n",
                "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, nilaiAkhirAlgo, nilaiHurufAlgo, statusAlgo);
        System.out.printf("%-25s | %-10.2f | %-10.2f | %-10.2f | %-12.2f | %-12s | %-10s\n",
                "Struktur Data", utsStrukdat, uasStrukdat, tugasStrukdat, nilaiAkhirStrukdat, nilaiHurufStrukdat, statusStrukdat);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir MK: %.2f\n", rataRataNilaiAkhir);
        System.out.printf("Nilai Kehadiran         : %.2f\n", nilaiKehadiran);
        System.out.printf("Nilai Etika             : %.2f\n", nilaiEtika);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Status Semester         : " + statusSemester);
        
        input.close();
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65) {
            return "C+";
        } else if (nilai > 50 && nilai <= 60) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}