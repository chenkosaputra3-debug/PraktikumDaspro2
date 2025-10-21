import java.util.Scanner;
public class StudiKasus2Dinamis {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Masukkan panjang tanah: " );
            int panjang = input.nextInt();
            System.out.println("Masukkan lebar tanah: " );
            int lebar = input.nextInt();
            System.out.println("Masukkan diameter kolam lingkaran: " );
            double diameter = input.nextDouble();
            System.out.println("Masukkan sisi kolam persegi: ");
            double sisi = input.nextDouble();

            double luasTanah = panjang * lebar;
            double jari = diameter / 2;
            double luasKolamLingkaran = 2 * (3.14 * Math.pow(jari, 2));
            double luasKolamPersegi = Math.pow(sisi, 2);
            double luasKolam = luasKolamLingkaran - luasKolamPersegi;

            double luasRumput = luasTanah - luasKolam;

            System.out.println("Luas tanah yang ditanami rumput= " + luasRumput + " m2");
        }
    }
}
