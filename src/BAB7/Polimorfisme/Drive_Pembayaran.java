/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ASUS
 */
public class Drive_Pembayaran {
    public static void main(String[] args) {
        Pembayaran payment;
        payment = new P0001();
        payment.tampilkanMember();
        
        if (payment instanceof P0001){
            P0001 p0001 = (P0001) payment;
            
            System.out.println("Jenis Member: " + p0001.member(p0001));
            System.out.println("Total Pembelian: " + p0001.hitPembayaran(500000));
            System.out.println("sisa saldo: " + p0001.potSaldo());
        }
    }
}
