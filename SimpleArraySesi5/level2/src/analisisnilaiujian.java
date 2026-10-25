public class analisisnilaiujian {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};

        int jumlah = 0;
        for (int n : nilai) {
            jumlah += n;
        }
        double rata = (double) jumlah / nilai.length;
        System.out.println("Rata-rata: " + rata);

        System.out.println("Nilai di atas rata-rata:");
        for (int n : nilai) {
            if (n > rata) {
                System.out.println(n);
            }
        }

        int lulus = 0;
        for (int n : nilai) {
            if (n >= 70) {
                lulus++;
            }
        }
        System.out.println("Jumlah lulus: " + lulus);

        double persen = (double) lulus / nilai.length * 100;
        System.out.println(" Persentase lulus: " + persen + "%");
    }
}