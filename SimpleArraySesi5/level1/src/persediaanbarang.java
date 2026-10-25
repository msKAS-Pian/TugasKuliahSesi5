public class persediaanbarang {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};

        System.out.println("Stok pertama: " + stock[0]);
        System.out.println("Stok terakhir: " + stock[stock.length - 1]);

        stock[1] = 10;

        System.out.println("Stok setelah perubahan:");
        for (int s : stock) {
            System.out.println(s);
        }

        // Stock[4] -> ArrayIndexOutOfBoundsException,
        // karena indeks valid hanya 0 sampai 3
    }
}