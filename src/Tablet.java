/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Tablet extends Data_InformasiHP {
    // atribut
    private String pencil,keyboard; 

// construction
 public Tablet (){
 this.pencil = "Pencil Gen 2";
 this.keyboard = "Smart Keyboard";
 }
// method
 void datapencil(String pencil){
 this.pencil = pencil;
   }
 void datakeyboard(String keyboard){
 this.keyboard = keyboard;
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
  String cetakPencil(){
 return pencil;
  }
 String cetakKeyboard(){
 return keyboard;
}

    void Garansi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

