

public class StudiKasus2 {

    public static void main(String[] args) {
        int panjang = 100, lebar = 50;
        double luasTanah = panjang * lebar;

        double luasKolamLingkaran = 2 * (3.14 * Math.pow(1, 2));
        double luasKolamPersegi = Math.pow(2, 2);
        double luasKolam = luasKolamLingkaran + luasKolamPersegi;
        double luasRumput = luasTanah - luasKolam;

        System.out.println("Panjang Tanah= " + panjang);
        System.out.println("Lebar Tanah= " + lebar);
        System.out.println("Luas kolam berbentuk lingkaran yang akan dibuat Pak Jaka = " + luasKolamLingkaran);
        System.out.println("Luas kolam persegi yang akan yang akan dibuat Pak Jaka = " + luasKolamPersegi);

        System.out.println("Luas tanah yang ditanami rumput = " + luasRumput);
    }

}
