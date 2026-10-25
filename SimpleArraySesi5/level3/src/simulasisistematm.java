import java.util.Scanner;

public class simulasisistematm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 500000;
        int[] transactions = new int[5];
        int jumlah = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Transaksi " + (i + 1) + " (+setor / -tarik) ");
            int t = input.nextInt();

            if (balance + t < 0) {
                System.out.println("Ditolak: Saldo tidak cukup");
            } else {
                transactions[jumlah] = t;
                jumlah++;
                balance += t;
                System.out.println("Berhasil. Saldo: " + balance);
            }
        }
        int masuk = 0;
        int keluar = 0;
        for (int i = 0; i < jumlah; i++) {
            if (transactions[i] > 0) {
                masuk += transactions[i];
            } else {
                keluar += - transactions[i];
            }
        }
        
        System.out.println("Saldo akhir: " + balance);
        System.out.println("Total uang masuk: " + masuk);
        System.out.println("Total uang keluar: " + keluar);

        input.close();
    }
}