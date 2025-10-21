
public class TugasKuliah2 {

    public static void main(String[] args) {
        String[] nim = {"254107020032", "254107020012", "254107020211", "254107020150", "254107020030", "254107020209", "254107020197", "254107020023", "254107020007", "254107020145"};
        String[] nama = {"Bagas", "Dila", "Ravy", "Rangga", "Wildan", "Varel", "Warda", "Wawan", "Naura", "Pieter"};
        String[] prodi = {"TI", "SIB", "TI", "TI", "SIB", "TI", "SIB", "TI", "TI", "SIB"};

        System.out.printf("%-12s %-15s %-20s%n", "NIM", "NAMA", "PRODI");
        System.out.println("--------------------------------");

        for (int i = 0; i < nim.length; i++) {
            System.out.printf("%-5s %-15s %-20s%n", nim[i], nama[i], prodi[i]);
        }
    }
}
