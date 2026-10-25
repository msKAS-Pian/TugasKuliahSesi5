public class mencarinilaitertinggidanterendah {
    public static void main(String[] args) {
        int[] suhu = {29, 32, 27, 35, 31, 26, 34};

        int maks = suhu[0];
        int min = suhu[0];
        int idxMaks = 0;
        int idxMin = 0;

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > maks) {
                maks = suhu[i];
                idxMaks = i;
            }
            if (suhu[i] < min) {
                min = suhu[i];
                idxMin = i;
            }
        }

        System.out.println("Suhu tertinggi: " + maks + " (indeks " + idxMaks + ")");
        System.out.println("Suhut terendah: " + min + " (indeks " + idxMin + ")");
        System.out.println("Selisih: " + (maks - min));
    } 
}
