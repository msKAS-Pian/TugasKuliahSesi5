public class totalpenjualanharian {
    public static void main(String[] args) {
        int[] penjualan = {100000, 150000, 125000, 200000, 175000};

        int total = 0;
        for (int p : penjualan) {
            total =+ p;
        }

        System.out.println("Total penjualan: Rp" + total);
        System.out.println("Jumlah elemen: " + penjualan.length);
    }
}
