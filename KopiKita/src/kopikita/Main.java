/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kopikita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner memesan = new Scanner(System.in);
        List<Pelanggan> daftarPelanggan = new ArrayList<>();
        List<PesananKopi> daftarPesanan = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== SISTEM KASIR KEDAI KOPI - KopiKita ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Keluar");
            System.out.print("Pilih : ");
            try{
                int pilihan = memesan.nextInt();
                memesan.nextLine();
                if (pilihan == 1){
                    try {
                        System.out.println("\n--- Data Pelanggan ---");
                        System.out.print("Nama\t:");
                        String nama = memesan.nextLine();
                        System.out.print("Nomor Meja :");
                        String nomorMeja = memesan.nextLine();

                        if(!nomorMeja.matches("\\d+")){
                            System.out.println("Error!!! Nomor meja hanya angka");
                            continue;
                        }

                        System.out.println("\n--- Data Pesanan ---");
                        System.out.print("Harga Dasar\t: ");
                        double hargaDasar = memesan.nextDouble();
                        System.out.print("Jenis Kopi (1. Reguler / 2. Spesial) :");
                        int jenis = memesan.nextInt();
                        Pelanggan pelanggan = new Pelanggan(nama, nomorMeja);
                        PesananKopi pesanan;
                        if (jenis == 1){
                            pesanan = new KopiReguler(hargaDasar);
                        } else if (jenis == 2){
                            pesanan = new kopiSpesial(hargaDasar);
                        } else {
                            System.out.println("Jenis tidak valid harap isi (1/2) ");
                            continue;
                        }
                        daftarPelanggan.add(pelanggan);
                        daftarPesanan.add(pesanan);

                        System.out.println("Pesanan berhasil ditambahkan!");
                    } catch (DataPesananTidakValidException e){
                        System.out.println("Error : " + e.getMessage());
                    } 

                } else if (pilihan == 2){
                    break;
                } else {
                    System.out.println("Error!!! Menu tidak tersedia");
                }  
            } catch (Exception e){
                System.out.println("Input tidak valid!");
                memesan.nextLine();
            }
        }
        
        System.out.println("\n===== Rekap Pesanan =====");
        for (int i = 0; i < daftarPesanan.size(); i++){
            Pelanggan p = daftarPelanggan.get(i);
            PesananKopi k = daftarPesanan.get(i);
            
            System.out.println("Pelanggan\t: " + p.getNama());
            System.out.println("Kopi\t\t: " + k.getNamaKopi());
            System.out.println("Total Harga\t: " + k.hitungTotalHarga());
            
            if (k instanceof Refill) {
                ((Refill) k).cetakInfoRefill();
            }
            System.out.println("----------------");
        }
    }
}
