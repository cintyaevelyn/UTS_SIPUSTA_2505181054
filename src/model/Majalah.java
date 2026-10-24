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

    private final int edisi;
    private final String bulanTerbit;
    private final boolean edisiTerbaru;
    private final String nomorRak;

    // [Atribusi AI]: Atribut nomorRak pada Majalah ditambahkan karena interface
    // Terarsip memerlukannya. Nilai rak (C-01, C-02) adalah asumsi, tidak ada di naskah.
    public Majalah(String kodeKoleksi, String judul, int tahunTerbit,
                   int edisi, String bulanTerbit, boolean edisiTerbaru,
                   String nomorRak) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.edisiTerbaru = edisiTerbaru;
        this.nomorRak = nomorRak;
    }

    // [Atribusi AI]: Aturan kelayakan majalah dibantu AI.
    @Override
    public boolean layakDipinjam() {
        return !edisiTerbaru;
    }

    @Override
    public String jenis() {
        return "Majalah";
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + ", edisi " + edisi + " bulan " + bulanTerbit;
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