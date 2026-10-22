/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembanding;

/**
 *
 * @author dewi daughter
 */

import java.util.Comparator;
import model.Koleksi;

public class UrutLayakLaluJudul implements Comparator<Koleksi> {

    // [Atribusi AI]: Method compare() dibantu AI untuk mengurutkan koleksi layak
    // pinjam lebih dulu, lalu berdasarkan judul (urutan alfabet).
    @Override
    public int compare(Koleksi a, Koleksi b) {
        int hasil = Boolean.compare(b.layakDipinjam(), a.layakDipinjam());
        if (hasil != 0) {
            return hasil;
        }
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}