/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author VICTUS
 */
public class kopiSpesial extends PesananKopi implements Refill {

    public kopiSpesial(double hargaDasar) throws DataPesananTidakValidException {
        super("Kopi Spesial", hargaDasar);
    }

    @Override
    public double hitungTotalHarga() {
        //harga + 10000
        return hargaDasar + 10000;
    }

    @Override
    public void cetakInfoRefill() {
        System.out.println("Gratis Refill Sekali kopiKita");
    }
}
