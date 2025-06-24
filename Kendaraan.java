
public class Kendaraan {

    String platNomor, tipe, merk, warna;

    public Kendaraan(String platNomor, String tipe, String merk, String warna) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
        this.warna = warna;
    }

    public void tampilkanInformasi() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
    }
}
