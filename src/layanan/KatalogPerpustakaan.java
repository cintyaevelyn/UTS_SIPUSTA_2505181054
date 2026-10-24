/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layanan;

/**
 *
 * @author dewi daughter
 */

import eksepsi.KoleksiSedangDipinjamException;
import eksepsi.KoleksiTidakLayakException;
import eksepsi.PustakaException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.Koleksi;

public class KatalogPerpustakaan {

    private final List<Koleksi> daftar = new ArrayList<>();
    private final Set<String> kodeDipinjam = new HashSet<>();

    public void tambah(Koleksi koleksi) {
        daftar.add(koleksi);
    }

    public List<Koleksi> semuaKoleksi() {
        return new ArrayList<>(daftar);
    }

    public Koleksi cari(String kode) {
        for (Koleksi k : daftar) {
            if (k.getKodeKoleksi().equals(kode)) {
                return k;
            }
        }
        return null;
    }

    // [Atribusi AI]: cetakStatus() dibantu AI agar semua koleksi diproses lewat
    // tipe induk (polimorfik), tanpa memeriksa jenisnya satu per satu.
    public void cetakStatus() {
        for (Koleksi k : daftar) {
            String keterangan = k.layakDipinjam() ? "TERSEDIA UNTUK DIPINJAM" : "TIDAK DAPAT DIPINJAM";
            System.out.println(k.deskripsi() + " => " + keterangan);
        }
    }

    // [Atribusi AI]: urut() dibantu AI agar aturan urutan bisa diganti dari luar.
    public List<Koleksi> urut(Comparator<Koleksi> aturan) {
        List<Koleksi> hasil = new ArrayList<>(daftar);
        hasil.sort(aturan);
        return hasil;
    }

    // [Atribusi AI]: pinjam() dibantu AI untuk memeriksa keadaan lalu melempar
    // eksepsi yang sesuai.
    public void pinjam(String kode) throws PustakaException {
        Koleksi k = cari(kode);
        if (k == null) {
            throw new PustakaException("Maaf, kami tidak menemukan koleksi berkode "
                    + kode + ". Mohon periksa kembali kodenya.");
        }
        if (!k.layakDipinjam()) {
            throw new KoleksiTidakLayakException(k.getJudul());
        }
        if (kodeDipinjam.contains(kode)) {
            throw new KoleksiSedangDipinjamException(k.getJudul());
        }
        kodeDipinjam.add(kode);
    }
}