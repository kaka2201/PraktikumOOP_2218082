/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Data_InformasiHP extends Laptop {
// atribut
private String layar,ram; 

// construction
 public Data_InformasiHP (){
 this.layar = "6inch";
 this.ram = "3";
 }
// method
 void dataLayar(String Layar){
 this.layar = Layar;
   }
 void dataRam(String Ram){
 this.ram = Ram;
 }
// method class
 void dataMerk(String Merk){
 this.merk = Merk;
 }
 void dataTipe(String Tipe){
 this.tipe = Tipe;
 }
 void dataInternal(String Internal){
 this.internal = Internal;
 }
 void dataGaransi(String Garansi){
 this.garansi = Garansi;
 }

 String cetakMerk(){
 return merk;
 }
 String cetakTipe(){
 return tipe;
 }
 String cetakInternal(){
 return internal;
 }
 String cetakGaransi(){
 return garansi;
}
 String cetakLayar(){
 return layar;
  }
 String cetakRam(){
 return ram;
}

    void Garansi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

