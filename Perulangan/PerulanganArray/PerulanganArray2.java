
package Perulangan.Array;

public class PerulanganArray2 {
     public static void main(String[] args) {
        boolean zonaHijau = true;
        String arrayString [] = {",","Pakai masker","Cek suhu tubuh","Cuci tangan","Siap handsanitizer","Jaga jarak","Jaga imun"};
        
        if(true){
        System.out.println("Jika Zona Hijau Masuk Sekolah");
        }
        
        //perulangan
        for(int i=1;i<arrayString.length;i++){
            System.out.println(i+"."+arrayString[i]);
        }
    }  
}


