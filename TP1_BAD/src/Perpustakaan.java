import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        int dendaPelajaran = 2000;
        int dendaNovel = 5000;
        int dendaSkripsi = 10000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (pelajaran/novel/skripsi): ");
        String jenisBuku = scanner.nextLine();
        System.out.print("Masukkan jumlah hari terlambat: ");
        int hariTerlambat = scanner.nextInt();

        int totalDenda = 0;
        if (jenisBuku.equalsIgnoreCase("pelajaran")) {
            totalDenda = dendaPelajaran * hariTerlambat;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            totalDenda = dendaNovel * hariTerlambat;
        } else if (jenisBuku.equalsIgnoreCase("skripsi")) {
            totalDenda = dendaSkripsi * hariTerlambat;
        } else {
            System.out.println("Jenis buku tidak valid.");
            System.exit(0);
        }

        System.out.println("Total denda: Rp" + totalDenda);
    }
}
