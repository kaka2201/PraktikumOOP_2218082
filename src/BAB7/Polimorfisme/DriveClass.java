/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ASUS
 */
public class DriveClass {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        
        manusia.makanBuah(apel);
        manusia.makanBuah(pisang);
    }
}
