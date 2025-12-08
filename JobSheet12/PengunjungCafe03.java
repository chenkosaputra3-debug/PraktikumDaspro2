package JobSheet12;

public class PengunjungCafe03 {

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        
        System.out.println("-------------------------");
        daftarPengunjung("Andi");
        
        System.out.println("-------------------------");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}