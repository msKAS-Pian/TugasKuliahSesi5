public class menghapusdataduplikat {
    public static void main(String[] args) {
        int[] nomor = {101, 102, 101, 103, 102, 104, 105, 103};

        // 1. Identifikasi duplikat
        System.out.println("Nomor duplikat:");
        for (int i = 0; i < nomor.length; i++) {
            boolean munculSebelumnya = false;
            for (int j = 0; j < i; j++) {
                if (nomor[j] == nomor[i]) {
                    munculSebelumnya = true;
                }
            }
            if (!munculSebelumnya) {
                for (int j = i + 1; j < nomor.length; j++) {
                    if (nomor[j] == nomor[i]) {
                        System.out.println(nomor[i]);
                        break;
                    }
                }
            }
        }

        // 2. Array baru berisi nomor unik
        int[] unik = new int[nomor.length];
        int jumlah = 0;
        for (int i = 0; i < nomor.length; i++) {
            boolean ada = false;
            for (int j = 0; j < jumlah; j++) {
                if (unik[j] == nomor[i]) {
                    ada = true;
                }
            }
            if (!ada) {
                unik[jumlah] = nomor[i];
                jumlah++;
            }
        }

        // 3. Tampilkan hasil
        System.out.println("Nomor unik:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(unik[i] + " ");
        }
        System.out.println("\nJumlah peserta unik: " + jumlah);

        // Tantangan: in-place (pakai array yang sama)
        int n = 0;
        for (int i = 0; i < nomor.length; i++) {
            boolean ada = false;
            for (int j = 0; j < n; j++) {
                if (nomor[j] == nomor[i]) {
                    ada = true;
                }
            }
            if (!ada) {
                nomor[n] = nomor[i];
                n++;
            }
        }
        System.out.println("Hasil in-place:");
        for (int i = 0; i < n; i++) {
            System.out.print(nomor[i] + " ");
        }
    }
}