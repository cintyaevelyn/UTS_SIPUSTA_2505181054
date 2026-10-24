/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berkas;

/**
 *
 * @author dewi daughter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;
import model.Koleksi;

public class EksporKatalog {

    // [Atribusi AI]: tulisKatalog() dibantu AI: kolom sejajar dengan printf dan
    // aliran ditutup otomatis lewat try-with-resources.
    public void tulisKatalog(String namaBerkas, List<Koleksi> daftar) throws IOException {
        try (PrintWriter tulis = new PrintWriter(
                new BufferedWriter(new FileWriter(namaBerkas, StandardCharsets.UTF_8)))) {

            tulis.println("KATALOG KOLEKSI PERPUSTAKAAN POLITEKNIK NEGERI MEDAN");
            tulis.println("Disusun oleh : Cintya Evelyn Butarbutar (2505181054)");
            tulis.println("Tanggal      : " + LocalDate.now());
            tulis.println();
            tulis.printf("%-9s %-27s %-15s %-7s %-20s%n",
                    "KODE", "JUDUL KOLEKSI", "JENIS", "TERBIT", "STATUS");
            tulis.println("=".repeat(80));

            for (Koleksi k : daftar) {
                String status = k.layakDipinjam() ? "Dapat dipinjam" : "Tidak dapat dipinjam";
                tulis.printf("%-9s %-27s %-15s %-7d %-20s%n",
                        k.getKodeKoleksi(), k.getJudul(), k.jenis(),
                        k.getTahunTerbit(), status);
            }

            tulis.println();
            tulis.println("Jumlah seluruh koleksi : " + daftar.size());
        }
    }
}
