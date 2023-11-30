/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan54koordinat;

/**
 *
 * @author nm
 * Nama : Adi Naufal F
 * Nim : 22205050
 * Kelas/Semester : TI/3
 * Deskripsi Program : Program ini berisi tentang warna koordinat dari koordinat x dan y.
 */
public class Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new  WarnaKoordinat(0,0,"");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " 
                            + wk.getY());
    }
    
}
