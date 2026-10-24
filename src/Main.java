/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import model.*;

/**
 *
 * @author dewi daughter
 */

import berkas.EksporKatalog;
import eksepsi.PustakaException;
import java.io.IOException;
import layanan.KatalogPerpustakaan;
import model.BerkasDigital;
import model.BukuCetak;
import model.Koleksi;
import model.Majalah;
import pembanding.UrutLayakLaluJudul;

public class Main {

    // [Atribusi AI]: main() dibantu AI untuk menjalankan seluruh method dengan
    // enam data uji dari naskah.
    public static void main(String[] args) {
        System.out.println("UTS Praktik PBO II - SIPUSTA");
        System.out.println("Cintya Evelyn Butarbutar (2505181054)\n");

        BukuCetak bk1 = new BukuCetak("BK-001", "Java How to Program", 2022, 620, "A-12", false);
        BukuCetak bk2 = new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "B-04", true);
        Majalah mj1 = new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, 88, "Agustus", true, "C-01");
        Majalah mj2 = new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, 87, "Juli", false, "C-02");
        BerkasDigital bd1 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15,
                "unduh.polmed.ac.id/bd001");
        BerkasDigital bd2 = new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8,
                "unduh.polmed.ac.id/bd002");

        System.out.println("== 1. Lokasi arsip koleksi fisik ==");
        System.out.println(bk1.getKodeKoleksi() + " : " + bk1.ringkasanArsip());
        System.out.println(bk2.getKodeKoleksi() + " : " + bk2.ringkasanArsip());
        System.out.println(mj1.getKodeKoleksi() + " : " + mj1.ringkasanArsip());
        System.out.println(mj2.getKodeKoleksi() + " : " + mj2.ringkasanArsip());

        KatalogPerpustakaan katalog = new KatalogPerpustakaan();
        katalog.tambah(bk1);
        katalog.tambah(bk2);
        katalog.tambah(mj1);
        katalog.tambah(mj2);
        katalog.tambah(bd1);
        katalog.tambah(bd2);

        System.out.println("\n== 2. Status semua koleksi ==");
        katalog.cetakStatus();

        System.out.println("\n== 3. Koleksi terurut (layak dulu, lalu judul) ==");
        for (Koleksi k : katalog.urut(new UrutLayakLaluJudul())) {
            System.out.println(k.getJudul() + " | " + k.jenis() + " | layak = "
                    + k.layakDipinjam());
        }

        System.out.println("\n== 4. Percobaan peminjaman ==");
        String[] kodeUji = {"BK-001", "BK-001", "BK-002", "MJ-001", "XX-999"};
        for (String kode : kodeUji) {
            cobaPinjam(katalog, kode);
        }

        System.out.println("\n== 5. Ekspor ke katalog.txt ==");
        try {
            new EksporKatalog().tulisKatalog("katalog.txt", katalog.semuaKoleksi());
            System.out.println("katalog.txt berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("katalog.txt gagal dibuat: " + e.getMessage());
        }
    }

    private static void cobaPinjam(KatalogPerpustakaan katalog, String kode) {
        try {
            katalog.pinjam(kode);
            System.out.println("[BERHASIL] " + kode + " dipinjam");
        } catch (PustakaException e) {
            System.out.println("[DITOLAK] " + e.getMessage());
        }
    }
}