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

    // [Atribusi AI]: Logika pengurutan berlapis (layak dulu, lalu judul) dibantu AI.
    @Override
    public int compare(Koleksi a, Koleksi b) {
        boolean layakA = a.layakDipinjam();
        boolean layakB = b.layakDipinjam();

        if (layakA && !layakB) {
            return -1;
        }
        if (!layakA && layakB) {
            return 1;
        }
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}