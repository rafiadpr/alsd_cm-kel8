
public class QueueTransaksi {

    TransaksiPengisian[] transaksi;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        transaksi = new TransaksiPengisian[kapasitas];
        front = rear = 0;
        size = 0;
    }

    public void tambahTransaksi(TransaksiPengisian t) {
        if (size < transaksi.length) {
            transaksi[rear++] = t;
            size++;
        } else {
            System.out.println("Transaksi penuh!");
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("Daftar Transaksi :");
        for (int i = 0; i < size; i++) {
            transaksi[i].tampilkanTransaksi();
        }
    }

    public void transaksiKendaraanBerdasarkanJumlahLiter() {
        if (size == 0) {
            System.out.println("Tidak ada transaksi untuk ditampilkan.");
            return;
        }
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (transaksi[j].liter > transaksi[j + 1].liter) {
                    TransaksiPengisian temp = transaksi[j];
                    transaksi[j] = transaksi[j + 1];
                    transaksi[j + 1] = temp;
                }
            }
        }

        System.out.println("Transaksi diurutkan berdasarkan jumlah liter:");
        tampilkanRiwayat();
    }

    public void transaksiKendaraanBerdasarkanTotalBayar() {
        if (size == 0) {
            System.out.println("Tidak ada transaksi untuk ditampilkan.");
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (transaksi[j].totalBayar < transaksi[j + 1].totalBayar) {
                    TransaksiPengisian temp = transaksi[j];
                    transaksi[j] = transaksi[j + 1];
                    transaksi[j + 1] = temp;
                }
            }
        }

        System.out.println("Transaksi diurutkan berdasarkan total bayar:");
        tampilkanRiwayat();
    }
}
