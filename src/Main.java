import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap;

        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminLengkap = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminLengkap = "Perempuan";
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan tanggal lahir (Tahun-Bulan-Tanggal): ");
        String tanggalLahirString = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        LocalDate hariIni = LocalDate.now();
        Period usiasekarang = Period.between(tanggalLahir, hariIni);
        int umur = usiasekarang.getYears();
        int bulan = usiasekarang.getMonths();

        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun " + bulan + " bulan ");

        scanner.close();
    }
}