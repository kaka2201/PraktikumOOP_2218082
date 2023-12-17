/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8.Interface;

import BAB7.Polimorfisme.*;

/**
 *
 * @author ASUS
 */
public class G0001 extends Pembayaran{
    public String name, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public G0001(){
        this.name = "Abbashalom Radja";
        this.kode = "G0001";
        this.saldo = 5000000;
        this.alamat = "Malang, Jl.Atletik no 4A";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode)== 0 ){
            diskon = 0.2;
        }else {
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member G0001 dengan diskon 20%");
    }
    public String InputPinKredit;
    void jenisPembayaran(Cash cash){
        if (bayar >= total){
            System.out.println("Kembalian : "+ cash.kembalian(total, bayar));
        } else if (bayar <= total){
            System.out.println("uang anda kurang");
        } else {
            System.out.println("Pembayaran berhasil");
        }
    }
        void jenisPembayaran(Emoney emoney){
        emoney.scanQris();
    }
        
        void jenisPembayaran(Kredit kredit){
        kredit.cekKartuKredit(kode, InputPinKredit);
    }
    
}