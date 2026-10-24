/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dewi daughter
 */
public class BukuCetak extends Koleksi implements Terarsip {

    private final int jumlahHalaman;
    private final String nomorRak;
    private final boolean sedangDiperbaiki;

    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit,
                     int jumlahHalaman, String nomorRak, boolean sedangDiperbaiki) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
        this.nomorRak = nomorRak;
        this.sedangDiperbaiki = sedangDiperbaiki;
    }

    // [Atribusi AI]: Aturan kelayakan buku cetak dibantu AI.
    @Override
    public boolean layakDipinjam() {
        return !sedangDiperbaiki;
    }

    @Override
    public String jenis() {
        return "Buku Cetak";
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + ", " + jumlahHalaman + " halaman, rak " + nomorRak;
    }

    @Override
    public String nomorRak() {
        return nomorRak;
    }

    // [Atribusi AI]: Aturan lantai dibantu AI: huruf pertama nomor rak
    // menentukan lantai (A = 1, B = 2, C = 3).
    @Override
    public int lokasiLantai() {
        char huruf = Character.toUpperCase(nomorRak.charAt(0));
        if (huruf == 'A') {
            return 1;
        }
        if (huruf == 'B') {
            return 2;
        }
        if (huruf == 'C') {
            return 3;
        }
        return 0;
    }
}