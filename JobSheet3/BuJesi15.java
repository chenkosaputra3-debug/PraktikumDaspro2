public class BuJesi15 {
    public static void main(String[] args) {
        int gajiPokok = 3000000;
        int tunjanganAnak = 150000;
        int jumlahAnak = 3;
        double potonganPensiun = 0.05 * gajiPokok;

        double gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - potonganPensiun;
        System.out.println("Gaji Pokok Bu Jesi= Rp. "+ gajiPokok);
        System.out.println("Tunjangan Anak = Rp. "+ tunjanganAnak);
        System.out.println("Jumlah anak Bu Jesi= "+ jumlahAnak);
        System.out.println("Potongan Pensiun sebesar = Rp. "+ potonganPensiun);
        System.out.println("Gaji bersih Bu Jesi = Rp." + gajiBersih);
    }
}
