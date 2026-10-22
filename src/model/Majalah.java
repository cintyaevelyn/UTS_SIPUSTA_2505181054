/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dewi daughter
 */
public class Majalah extends Koleksi implements Terarsip {

    private int edisi;
    private String bulanTerbit;
    private boolean edisiTerbaru;
    private String nomorRak;

    // [Atribusi AI]: Atribut nomorRak pada Majalah ditambahkan dengan bantuan
    // AI karena interface Terarsip memerlukannya (nilainya asumsi).
    public Majalah(String kodeKoleksi, String judul, int tahunTerbit,
                   int edisi, String bulanTerbit, boolean edisiTerbaru,
                   String nomorRak) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.edisiTerbaru = edisiTerbaru;
        this.nomorRak = nomorRak;
    }

    // [Atribusi AI]: Method layakDipinjam() dibantu AI untuk menerapkan aturan
    // bahwa majalah layak dipinjam bila bukan edisi terbaru.
    @Override
    public boolean layakDipinjam() {
        return !edisiTerbaru;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | edisi " + edisi + ", " + bulanTerbit;
    }

    @Override
    public String nomorRak() {
        return nomorRak;
    }

    // [Atribusi AI]: Aturan lantai dibantu AI: huruf pertama nomor rak
    // menentukan lantai (A = lantai 1, B = lantai 2, C = lantai 3).
    @Override
    public int lokasiLantai() {
        return nomorRak.charAt(0) - 'A' + 1;
    }
}