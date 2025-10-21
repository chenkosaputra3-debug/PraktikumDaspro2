import java.util.Random;

public class MatrixRain {
    public static void main(String[] args) {
        // Kode ANSI untuk warna teks
        final String HIJAU = "\u001B[32m"; // Warna Hijau
        final String PUTIH = "\u001B[37m"; // Warna Putih (untuk karakter utama)
        final String RESET = "\u001B[0m";  // Reset ke warna default

        Random random = new Random();
        int lebarTerminal = 80; // Asumsi lebar terminal 80 karakter
        int[] posisi = new int[lebarTerminal];

        // Inisialisasi posisi awal (di atas layar)
        for (int i = 0; i < lebarTerminal; i++) {
            posisi[i] = random.nextInt(lebarTerminal);
        }

        try {
            while (true) {
                // 1. Buat baris baru
                StringBuilder baris = new StringBuilder();
                for (int i = 0; i < lebarTerminal; i++) {
                    
                    // Jika posisi[i] ada di baris ini, cetak karakter putih
                    if (posisi[i] == 0) {
                        baris.append(PUTIH);
                        baris.append((char) (random.nextInt(94) + 33)); // Karakter acak
                        posisi[i]++; // Pindahkan ke baris berikutnya
                    } 
                    // Jika posisi[i] baru saja lewat, cetak karakter hijau
                    else if (posisi[i] > 0 && posisi[i] < 15) { // '15' adalah panjang jejak
                        baris.append(HIJAU);
                        baris.append((char) (random.nextInt(94) + 33)); // Karakter acak
                        posisi[i]++; // Lanjutkan jejak
                    } 
                    // Jika jejak sudah lewat atau belum mulai
                    else {
                        baris.append(" "); // Cetak spasi
                        
                        // Reset posisi jika sudah terlalu jauh ke bawah
                        if (posisi[i] >= 15) {
                             posisi[i] = 0;
                        }

                        // Peluang acak untuk memulai "tetesan" baru
                        if (random.nextInt(100) > 98) {
                            posisi[i] = 0; // Mulai tetesan baru
                        }
                    }
                }
                
                System.out.println(baris.toString() + RESET);

                // 2. Atur kecepatan (semakin kecil, semakin cepat)
                Thread.sleep(100); // 100 milidetik
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}