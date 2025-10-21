import java.util.Scanner;
public class nestedUjianSkripsi15 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String pesan;
            System.out.print("Apakah Mahasiswa bebas kompen Ya/Tidak: ");
            String bebasKompen = sc.nextLine().trim();
            System.out.println("Masukkan jumlah log bimbingan Pembimbing 1");
            int bimbinganP1 = sc.nextInt();
            System.out.println("Masukkan jumlah log bimbingan Pembimbing 2");
            int bimbinganP2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("Ya")) {
        pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
    } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
        pesan = "Gagal Log bimbingan P1 belum mencapai 8 kali";
    } else if (bimbinganP1 < 8) {
        pesan = "Gagal Log bimbingan P1 belum mencapai 8 kali";  
    } else {
        pesan = "Gagal Log bimbingan P2 belum mencapai 4 kali";
    }
    System.out.println(pesan);        

            }

        }
        
    }

