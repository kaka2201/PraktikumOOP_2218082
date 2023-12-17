/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Data_InformasiLaptop {
    public static void main(String[] args) {
 // membuat object dengan nama “mhs” dari class Mahasiswa
 Laptop Data_InformasiLaptop = new Laptop();
 //ketika akan menggunakan method dari class Mahasiswa maka
 Data_InformasiLaptop.dataMerk("");
 Data_InformasiLaptop.dataTipe("");
 Data_InformasiLaptop.dataInternal(" ");
 Data_InformasiLaptop.dataSpek("");
 Data_InformasiLaptop.dataWarna("");
 Data_InformasiLaptop.dataGaransi("");
 System.out.println("Data Informasi Laptop");
 System.out.println("------------------------------------");
 System.out.println("Merk : "+ Data_InformasiLaptop.cetakMerk());
 System.out.println("Tipe : "+ Data_InformasiLaptop.cetakTipe());
 System.out.println("Internal : "+ Data_InformasiLaptop.cetakInternal());
 System.out.println("Spek : "+ Data_InformasiLaptop.cetakSpek());
 System.out.println("Warna : "+ Data_InformasiLaptop.cetakWarna());
 System.out.println("Garansi : "+ Data_InformasiLaptop.cetakGaransi());
 }
}

