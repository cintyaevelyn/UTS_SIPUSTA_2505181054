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

    private int ukuranMB;
    private String tautanUnduh;

    public BerkasDigital(String kodeKoleksi, String judul, int tahunTerbit,
                         int ukuranMB, String tautanUnduh) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.ukuranMB = ukuranMB;
        this.tautanUnduh = tautanUnduh;
    }

    // [Atribusi AI]: Method layakDipinjam() dibantu AI untuk menerapkan aturan
    // bahwa berkas digital selalu layak dipinjam.
    @Override
    public boolean layakDipinjam() {
        return true;
    }

    // [Atribusi AI]: Method deskripsi() dibantu AI untuk memperluas deskripsi
    // induk dengan super.deskripsi().
    @Override
    public String deskripsi() {
        return super.deskripsi() + " | " + ukuranMB + " MB, " + tautanUnduh;
    }
}
