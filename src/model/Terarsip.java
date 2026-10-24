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
// dibuat dengan bantuan AI.
public interface Terarsip {

    String nomorRak();

    int lokasiLantai();

    default String ringkasanArsip() {
        return "Disimpan di rak " + nomorRak() + ", lantai " + lokasiLantai();
    }
}