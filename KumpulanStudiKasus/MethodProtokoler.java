
package PresensiPRO;

public class MethodProtokoler {
    public static void main(String[] args) {
        boolean ZonaAman = true;
        String protokol [] = {",","Pakai masker","Jaga Jarak","Cuci tangan","Siap handsanitizer"};
        
        if(true){
            System.out.println(aturan("Covid-19")); 
            System.out.println("Masuk Sekolah Dan Menetapkan Protokol Kesehatan, Antara Lain : ");       
        }else{ 
            System.out.println("Di Rumah Saja! , Tetap Jaga Kesehatan ");
        }
        
        //perulangan
        for(int i=1;i<protokol.length;i++){
            System.out.println(i+"."+protokol[i]);
            }
        }
     
     static String aturan(String protokol){
         String aturan = protokol;
         return aturan;
     }
     
}
