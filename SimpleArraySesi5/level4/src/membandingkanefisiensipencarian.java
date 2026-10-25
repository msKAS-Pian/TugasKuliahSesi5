public class membandingkanefisiensipencarian {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // sudah terurut
        }
        int cari = 75;

        // Algoritma A: pencarian linear
        int periksaA = 0;
        for (int i = 0; i < arr.length; i++) {
            periksaA++;
            if (arr[i] == cari) break;
        }

        // Algoritma B: binary search
        int periksaB = 0;
        int kiri = 0, kanan = arr.length - 1;
        while (kiri <= kanan) {
            periksaB++;
            int tengah = (kiri + kanan) / 2;
            if (arr[tengah] == cari) break;
            else if (arr[tengah] < cari) kiri = tengah + 1;
            else kanan = tengah - 1;
        }

        System.out.println("Linear: " + periksaA + " pemeriksaan");
        System.out.println("Binary: " + periksaB + " pemeriksaan");
    }
}