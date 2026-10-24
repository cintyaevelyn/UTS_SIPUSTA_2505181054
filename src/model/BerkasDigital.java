/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dewi daughter
 */
public class BerkasDigital extends Koleksi {

    private final int ukuranMB;
    private final String tautanUnduh;

    public BerkasDigital(String kodeKoleksi, String judul, int tahunTerbit,
                         int ukuranMB, String tautanUnduh) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.ukuranMB = ukuranMB;
        this.tautanUnduh = tautanUnduh;
    }

    // [Atribusi AI]: Aturan kelayakan berkas digital dibantu AI (selalu layak).
    @Override
    public boolean layakDipinjam() {
        return true;
    }

    @Override
    public String jenis() {
        return "Berkas Digital";
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + ", " + ukuranMB + " MB, unduh di " + tautanUnduh;
    }
}