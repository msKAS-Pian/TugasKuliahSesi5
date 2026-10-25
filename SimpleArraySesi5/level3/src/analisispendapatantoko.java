public class analisispendapatantoko {
    public static void main(String[] args) {
        int[] p = {250, 300, 180, 420, 350, 300, 500, 150, 420, 380};

        // 1. Total dan rata-rata
        int total = 0;
        for (int x : p) {
            total += x;
        }
        double rata = (double) total / p.length;
        System.out.println("Total: " + total + " ribu");
        System.out.println("Rata-rata: " + rata + " ribu");

        // 2. Hari di atas rata-rata
        System.out.println("Hari di atas rata-rata:");
        for (int i = 0; i < p.length; i++) {
            if (p[i] > rata) {
                System.out.println("Hari " + (i + 1) + ": " + p[i]);
            }
        }

        // 3. Pendapatan paling sering muncul
        int[] hitung = new int[p.length];
        int maks = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i] == p[j]) {
                    hitung[i]++;
                }
            }
            if (hitung[i] > maks) {
                maks = hitung[i];
            }
        }
        System.out.println("Paling sering muncul:");
        for (int i = 0; i < p.length; i++) {
            boolean sudah = false;
            for (int j = 0; j < i; j++) {
                if (p[j] == p[i]) {
                    sudah = true;
                }
            }
            if (hitung[i] == maks && !sudah) {
                System.out.println(p[i] + " (" + maks + " kali)");
            }
        }

        // 4. Dua hari tertinggi
        int idx1 = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] > p[idx1]) {
                idx1 = i;
            }
        }
        int idx2 = (idx1 == 0) ? 1 : 0;
        for (int i = 0; i < p.length; i++) {
            if (i != idx1 && p[i] > p[idx2]) {
                idx2 = i;
            }
        }
        System.out.println("Hari tertinggi 1: hari " + (idx1 + 1) + " (" + p[idx1] + ")");
        System.out.println("Hari tertinggi 2: hari " + (idx2 + 1) + " (" + p[idx2] + ")");

        // 5. Hari lebih rendah dari hari sebelumnya
        int turun = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] < p[i - 1]) {
                turun++;
            }
        }
        System.out.println("Jumlah hari lebih rendah dari sebelumnya: " + turun);
    }
}