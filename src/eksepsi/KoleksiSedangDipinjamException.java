/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eksepsi;

/**
 *
 * @author dewi daughter
 */
public class KoleksiSedangDipinjamException extends PustakaException {

    public KoleksiSedangDipinjamException(String judul) {
        super("Koleksi \"" + judul + "\" sedang dipinjam orang lain. "
                + "Silakan coba lagi setelah dikembalikan.");
    }
}
