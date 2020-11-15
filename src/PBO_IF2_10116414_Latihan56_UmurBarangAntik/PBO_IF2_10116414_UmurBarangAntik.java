/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan56_UmurBarangAntik;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data umur barang antik
 */
public class PBO_IF2_10116414_UmurBarangAntik {
    public static void main(String[] args) {
       Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang antik ini : " + r.getName());
        r.tampilUmur();
    }
}
