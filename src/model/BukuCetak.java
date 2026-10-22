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

    private int jumlahHalaman;
    private String nomorRak;
    private boolean sedangDiperbaiki;

    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit,
                     int jumlahHalaman, String nomorRak, boolean sedangDiperbaiki) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
        this.nomorRak = nomorRak;
        this.sedangDiperbaiki = sedangDiperbaiki;
    }

    // [Atribusi AI]: Method layakDipinjam() dibantu AI untuk menerapkan aturan
    // bahwa buku cetak layak dipinjam bila tidak sedang diperbaiki.
    @Override
    public boolean layakDipinjam() {
        return !sedangDiperbaiki;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | " + jumlahHalaman + " halaman, rak " + nomorRak;
    }

    @Override
    public String nomorRak() {
        return nomorRak;
    }

    // [Atribusi AI]: Aturan lantai dibantu AI: huruf pertama nomor rak
    // menentukan lantai (A = lantai 1, B = lantai 2, dan seterusnya).
    @Override
    public int lokasiLantai() {
        return nomorRak.charAt(0) - 'A' + 1;
    }
}