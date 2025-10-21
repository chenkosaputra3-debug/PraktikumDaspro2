public class TugasKuliah2 {
    public static void main(String[] args) {
        String[] nim = {"101", "102", "103", "104", "105", "106", "107", "108", "109", "110"};
        String[] nama = {"Tegar", "Dila", "Ravy", "Rangga", "Wildan", "Varel", "Putra", "Wawan", "Bagas", "Najib"};
        String[] prodi = {"TI", "SI", "TI", "TI", "SI", "TI", "SI", "TI", "TI", "SI"};

        System.out.printf("%-5s %-15s %-20s%n", "NIM", "Nama", "Prodi");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < nim.length; i++) {
            System.out.printf("%-5s %-15s %-20s%n", nim[i], nama[i], prodi[i]);
        }
    }
}