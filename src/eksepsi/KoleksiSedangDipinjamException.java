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

    private static final long serialVersionUID = 1L;

    public KoleksiSedangDipinjamException(String judul) {
        super("Maaf, \"" + judul + "\" sedang dipinjam oleh anggota lain. "
                + "Silakan coba lagi nanti setelah koleksi ini dikembalikan.");
    }
}
