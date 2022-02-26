
package PresensiPRO;

public class Method {
    public static void ProtokolKesehatan() {
        String protokol [] = {",","Pakai masker","Jaga Jarak","Cuci tangan","Siap handsanitizer"};
        
        //Percabangan
        boolean ZonaAman = true;
        if(true){
            System.out.println("Masuk Sekolah Dan Menetapkan Protokol Kesehatan, Diantaranya : ");       
        }else{ 
            System.out.println("Di Rumah Saja! , Tetap Jaga Kesehatan ");
        }
        
        //Perulangan
         for(int i=1;i<protokol.length;i++){
            System.out.println(i+"."+protokol[i]);
            }        
        }
    public static void main(String[] args) {
        ProtokolKesehatan();
    }           
        }
        
