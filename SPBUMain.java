
import java.util.Scanner;

public class SPBUMain {

    public static void main(String[] args) {
        LinkedListQueue antrian = new LinkedListQueue();
        QueueTransaksi transaksiQueue = new QueueTransaksi(100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n --- MENU SPBU ---");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Tipe: ");
                    String tipe = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new Kendaraan(plat, tipe, merk));
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");

                    break;

                case 2:
                    System.out.println("--- Antrian Kendaraan ---");
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println("Jumlah Kendaraan dalam Antrian: " + antrian.hitungAntrian());
                    break;

                case 4:
                    Kendaraan k = antrian.layaniKendaraan();
                    if (k != null) {
                        System.out.println("Petugas SPBU melayani " + k.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String namaBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per Liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah Liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine();
                        BBM bbm = new BBM(namaBBM, harga);
                        TransaksiPengisian t = new TransaksiPengisian(k, bbm, liter);
                        transaksiQueue.tambahTransaksi(t);
                        System.out.println(">> Transaksi pengisian berhasil.");
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 5:
                    System.out.println("--- Riwayat Transaksi ---");
                    transaksiQueue.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    return;
            }
        }
    }
}
