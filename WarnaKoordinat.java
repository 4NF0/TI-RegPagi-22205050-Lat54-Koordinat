/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan54koordinat;

/**
 *
 * @author nm
 */
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna){
     super (x, y);
    }
    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}
