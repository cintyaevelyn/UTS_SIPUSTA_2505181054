/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dewi daughter
 */

// [Atribusi AI]: Rancangan class induk abstract Koleksi (method abstract
// layakDipinjam() dan jenis(), serta deskripsi()) dibuat dengan bantuan AI.
public abstract class Koleksi {

    private final String kodeKoleksi;
    private final String judul;
    private final int tahunTerbit;

    protected Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    // Aturan kelayakan berbeda tiap jenis, jadi dibiarkan abstract
    public abstract boolean layakDipinjam();

    // Nama jenis koleksi yang mudah dibaca, diisi oleh tiap turunan
    public abstract String jenis();

    public String deskripsi() {
        return "[" + kodeKoleksi + "] " + judul + ", terbit " + tahunTerbit;
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}