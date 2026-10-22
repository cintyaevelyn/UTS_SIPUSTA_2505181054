/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author dewi daughter
 */

// [Atribusi AI]: Interface Terarsip beserta default method ringkasanArsip()
// dibantu AI untuk menggabungkan nomor rak dan lantai.
public interface Terarsip {

    String nomorRak();

    int lokasiLantai();

    default String ringkasanArsip() {
        return "Rak " + nomorRak() + ", lantai " + lokasiLantai();
    }
}