/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan19.saldotabungan;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding saldo
 * Tabungan.
 */
public class PBO210117070Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 25000000;
        double bunga = 0.15;
        double saldoPerbulan;
        
        
        
        for (int i = 1; i <= 6; i++){
            saldoPerbulan = bunga * saldo;
            saldo = (int) (saldo + saldoPerbulan);
            System.out.println("Saldo di bulan Ke-"+i+" Rp."+(int)saldo);
            
        }
            
        }
    }
    

