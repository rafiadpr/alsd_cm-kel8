public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public void tampilkanTransaksi() {
        System.out.println("Transaksi Pengisian:");
        kendaraan.tampilkanInformasi();
        System.out.println("BBM: " + bbm.namaBBM + ", Harga per Liter: " + bbm.hargaPerLiter);
        System.out.println("Jumlah Liter: " + liter);
        System.out.println("Total Harga: " + totalBayar);
    }
}
