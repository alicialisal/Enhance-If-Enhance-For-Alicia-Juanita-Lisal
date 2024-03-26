public class PengecualianEnhanced {
    public static void main(String[] args) {
        String[] alfabet = { "a", "b", "c", "d", "e", "f", "g" };
        int i;

        System.out.println("");
        for (String huruf : alfabet) {
            huruf += "a"; // Perubahan elemen array yang dilakukan menggunakan foreach (enhanced-if) tidak
                          // akan merubah elemen array secara langsung ke array alfabet. Namun, ia hanya
                          // akan merubah nilai variabel huruf.
        }

        System.out.println("");

        for (String huruf : alfabet) {
            System.out.println(huruf); // Oleh karena itu, hasil yang dikeluarkan saat print out nilai dari elemen
                                       // array alfabet menggunakan foreach sama dengan nilai yang diinisialisasi pada
                                       // awal, yaitu { "a", "b", "c", "d", "e", "f", "g" }.
        }

        System.out.println("");

        for (i = 0; i < alfabet.length; i++) {
            alfabet[i] += "a"; /*
                                * Sedangkan, jika perubahan nilai dilakukan menggunakan for yang umumnya
                                * digunakan, maka array dapat diakses berdasarkan indeksnya sehingga perubahan
                                * langsung terjadi pada array alfabet tanpa melalui variabel perantara.
                                */
        }

        for (i = 0; i < alfabet.length; i++) {
            System.out.println(alfabet[i]); /*
                                             * Oleh karena itu, hasil yang dikeluarkan saat print out nilai dari elemen
                                             * array alfabet menggunakan menggunakan for yang umum digunakan akan
                                             * berubah sesuai dengan perubahan yang sudah dilakukan dalam for di atas
                                             * (penambahan huruf 'a' untuk setiap elemennya).
                                             */
        }
    }
}
