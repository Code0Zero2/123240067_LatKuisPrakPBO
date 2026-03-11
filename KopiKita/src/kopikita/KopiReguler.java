/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author VICTUS
 */
public class KopiReguler extends PesananKopi {

    public KopiReguler(double hargaDasar) throws DataPesananTidakValidException {
        //nama sudah otomatis terisi
        super("Kopi Reguler", hargaDasar);
    }

    @Override
    public double hitungTotalHarga() {
        return hargaDasar;
    }
}
