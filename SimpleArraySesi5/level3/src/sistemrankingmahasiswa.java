public class sistemrankingmahasiswa {
    public static void main(String[] args) {
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};

        // salin array supaya urutan asli tetap ada untuk peringkat
        int[] urut = nilai.clone();

        // bubble sort, tertinggi ke terendah
        for (int i = 0; i < urut.length - 1; i++) {
            for (int j = 0; j < urut.length - 1 - i; j++) {
                if (urut[j] < urut[j + 1]) {
                    int temp = urut[j];
                    urut[j] = urut[j + 1];
                    urut[j + 1] = temp;
                }
            }
        }

        System.out.println("Nilai terurut:");
        for (int n : urut) {
            System.out.print(n + " ");
        }

        System.out.println("\nTiga nilai tertinggi yang berbeda:");
        int hitung = 0;
        for (int i = 0; i < urut.length && hitung < 3; i++) {
            if (i == 0 || urut[i] != urut[i - 1]) {
                System.out.println(urut[i]);
                hitung++;
            }
        }

        // peringkat = 1 + jumlah nilai yang lebih besar (nilai sama = peringkat sama)
        System.out.println("Peringkat:");
        for (int i = 0; i < nilai.length; i++) {
            int peringkat = 1;
            for (int j = 0; j < nilai.length; j++) {
                if (nilai[j] > nilai[i]) {
                    peringkat++;
                }
            }
            System.out.println("Mahasiswa " + (i + 1) + " (nilai " + nilai[i] + "): peringkat " + peringkat);
        }
    }
}