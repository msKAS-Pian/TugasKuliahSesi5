public class debuggingcountingdata {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};
        int total = 0;

        // 1. Program asli TIDAK berjalan dengan benar (error saat dijalankan).
        // 2. Masalah pada kode asli:
        //    a) i <= scores.length membuat i mencapai 4, sehingga scores[4]
        //       menyebabkan ArrayIndexOutOfBoundsException. Harus i < scores.length.
        //    b) total / scores.length adalah pembagian int, jadi pecahan dibuang.
        //       Contoh: 301 / 4 menjadi 75, bukan 75,25.

        // 3. Perbaikan: ganti <= menjadi ,
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        // 4. Pembagian double penting karena kalau kedua operand int, Java
        //    membagi sebagai bilangan bulat dan membuang pecahan lebih dulu,
        //    baru hasilnya disimpan ke double. Cast (double) mencegah itu.
        double average = (double) total / scores.length;

        // 5. Mengubah int total menjadi double total saja TIDAK ckup.
        //    Pembagiannya memang jadi desimal, tapi bug <= tetap membuat
        //    program crash.

        System.out.println(average); // output: 75,0
    }
}