import java.util.Scanner;

public class EnhancedIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Masukkan umur anda: ");

        int umur = myScanner.nextInt();
        System.out.println(
                "Kategori: " + ((umur > 17) ? "Anda sudah bisa membuat KTP." : "Anda belum bisa membuat KTP."));
        myScanner.close();

        /*
         * Tujuan dari kode di atas adalah untuk membaca angka yang dimasukkan oleh user
         * sebagai nilai dari variabel umur dengan tipe data integer. Kemudian, akan
         * dilakukan pengecekan menggunakan enhanced if (short form of if) jika variabel
         * umur bernilai lebih dari 17, maka output
         * yang akan keluar adalah "Anda sudah bisa membuat KTP." Sedangkan, jika nilai
         * umur lebih kecil atau sama dengan 17, maka output yang akan keluar adalah
         * "Anda belum bisa membuat KTP".
         */
    }
}
