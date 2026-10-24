/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eksepsi;

/**
 *
 * @author dewi daughter
 */

// [Atribusi AI]: Hierarki eksepsi (induk dan dua turunan) dibuat dengan bantuan AI.
public class PustakaException extends Exception {

    private static final long serialVersionUID = 1L;

    public PustakaException(String pesan) {
        super(pesan);
    }
}