/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author VICTUS
 */
public class Pelanggan {
    private static int counter = 1;
    private String idPelanggan;
    private String nama;
    private String nomorMeja;
    
    //constructor
    public Pelanggan(String nama, String nomorMeja){
        this.nama = nama;
        this.nomorMeja = nomorMeja;
        this.idPelanggan = String.format("C%03d", counter++);
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorMeja() {
        return nomorMeja;
    }
}
