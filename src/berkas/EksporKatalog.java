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

    // [Atribusi AI]: Method tulisKatalog() dibantu AI untuk menyusun kolom
    // sejajar dengan printf dan menutup aliran lewat try-with-resources.
    public void tulisKatalog(String namaBerkas, List<Koleksi> daftar)
            throws IOException {
        try (PrintWriter tulis = new PrintWriter(
                new BufferedWriter(new FileWriter(namaBerkas, StandardCharsets.UTF_8)))) {

            tulis.println("KATALOG PERPUSTAKAAN POLITEKNIK NEGERI MEDAN");
            tulis.println("Tanggal cetak: " + LocalDate.now());
            tulis.println();
            tulis.printf("%-10s %-28s %-14s %-6s %-20s%n",
                    "KODE", "JUDUL", "JENIS", "TAHUN", "STATUS");
            tulis.println("-".repeat(82));

            for (Koleksi k : daftar) {
                tulis.printf("%-10s %-28s %-14s %-6d %-20s%n",
                        k.getKodeKoleksi(), k.getJudul(),
                        k.getClass().getSimpleName(), k.getTahunTerbit(),
                        k.layakDipinjam() ? "Layak dipinjam" : "Tidak layak");
            }
            tulis.println();
            tulis.println("Jumlah koleksi: " + daftar.size());
        }
    }
}
