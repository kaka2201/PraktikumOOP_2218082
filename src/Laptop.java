public class Laptop extends abstract_Laptop implements laptop_informasi{
    private String spek, warna;
    String merk,tipe,internal,garansi;
    
//    public Laptop (){
//    this.merk = "Lenovo";
//    this.tipe = "X260";
//}
      @Override
    public String merk(String merk) {
       this.merk=merk;
        return this.merk;
    }
    
// void dataMerk(String Merk){
// this.merk = Merk;
// }
      @Override
    public String tipe(String tipe) {
        this.tipe=tipe;
        return this.tipe;
         }
//
// void dataTipe(String Tipe){
// this.tipe = Tipe;
// }
// void dataInternal(String Internal){
// this.internal = Internal;
// }
 void dataSpek(String Spek){
 this.spek = Spek;
 }
 void dataWarna(String Warna){
 this.warna = Warna;
 }
//  override dari class interface
 public void datagaransi(String Garansi){
    garansi = Garansi;
 }

// String cetakMerk(){
// return merk;
// }
 String cetakTipe(){
 return tipe;
 }
 String cetakInternal(){
 return internal;
 }
 String cetakSpek(){
 return spek;
 }
    @Override
 public String cetakWarna(){
 return warna;
  }
 String cetakGaransi(){
 return garansi;
}
    @Override
    public String Status() {
        return "Laptop Tersedia";
    }
    String cetak(){
        return Status();
    }
//implement interface
    public String datacetak() {
        return merk;
    }

    @Override
    public void datainternal(String Internal) {
        internal=Internal;
    }

  
  
}