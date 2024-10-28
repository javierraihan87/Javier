import java.util.Scanner;

/**
 * Kelas utama untuk mengelola pemesanan taksi.
 * Program ini menghitung total tarif berdasarkan jarak perjalanan
 * menggunakan tarif dasar dan tarif per kilometer.
 */
public class Main {

    /**
     * Tarif dasar taksi dalam rupiah.
     */
    private static final double BASE_FARE = 3000;

    /**
     * Tarif per kilometer taksi dalam rupiah.
     */
    private static final double PER_KM_RATE = 2000;

    /**
     * Metode utama untuk menjalankan program pemesanan taksi.
     * Meminta pengguna untuk memasukkan jarak dan kemudian menghitung
     * serta menampilkan total tarif berdasarkan jarak tersebut.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayWelcomeMessage();

        double distance = getDistance(scanner);
        double totalFare = calculateFare(distance);

        displayFare(distance, totalFare);
        scanner.close();
    }

    /**
     * Menampilkan pesan selamat datang kepada pengguna.
     */
    private static void displayWelcomeMessage() {
        System.out.println("Selamat datang di Manajemen Pemesanan Taksi!");
    }

    /**
     * Meminta pengguna untuk memasukkan jarak perjalanan dalam kilometer.
     *
     * @param scanner Objek Scanner untuk membaca input pengguna.
     * @return Jarak yang dimasukkan oleh pengguna dalam kilometer.
     */
    private static double getDistance(Scanner scanner) {
        System.out.print("Masukkan jarak (dalam kilometer): ");
        return scanner.nextDouble();
    }

    /**
     * Menghitung tarif pemesanan berdasarkan jarak perjalanan.
     *
     * @param distance Jarak perjalanan dalam kilometer.
     * @return Total tarif berdasarkan tarif dasar dan tarif per kilometer.
     */
    private static double calculateFare(double distance) {
        return BASE_FARE + (PER_KM_RATE * distance);
    }

    /**
     * Menampilkan total tarif pemesanan taksi ke layar.
     *
     * @param distance  Jarak perjalanan dalam kilometer.
     * @param totalFare Total tarif pemesanan taksi.
     */
    private static void displayFare(double distance, double totalFare) {
        System.out.printf("Total biaya pemesanan taksi untuk %.2f kilometer adalah: Rp. %.2f%n", distance, totalFare);
    }
}
