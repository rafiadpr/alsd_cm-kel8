
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
}
