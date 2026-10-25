import java.util.Scanner;

public class mencariproduk {
    public static void main(String[] args) {
        int[] kode = {101, 105, 110, 115, 120, 125};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kode produk: ");
        int cari = input.nextInt();

        input.close();

        int indeks = -1;
        int pemeriksaan = 0;

        for (int i = 0; i < kode.length; i++) {
            pemeriksaan++;
            if (kode[i] == cari) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Ditemukan di indeks: " + indeks);
        } else {
            System.out.println("Produk tidak tersedia");
        }
        System.out.println("Jumlah pemeriksaan: " + pemeriksaan);
    }
}
