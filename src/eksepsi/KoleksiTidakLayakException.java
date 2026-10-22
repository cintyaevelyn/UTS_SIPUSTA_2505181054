/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eksepsi;

/**
 *
 * @author dewi daughter
 */
public class KoleksiTidakLayakException extends PustakaException {

    public KoleksiTidakLayakException(String judul) {
        super("Koleksi \"" + judul + "\" belum bisa dipinjam saat ini. "
                + "Silakan pilih koleksi lain.");
    }
}
