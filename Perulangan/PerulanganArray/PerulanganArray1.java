
package Perulangan.Array;

import java.util.Arrays;

public class PerulanganArray1 {
     public static void main(String[] args) {
        //tipedata [] nama = {Komponen - Komponen}
        //assignment
        int [] arrayInteger = {1,2,3,4,5};
        System.out.println(arrayInteger [0]);
        System.out.println(arrayInteger [1]);
        System.out.println(arrayInteger [2]);
        System.out.println(arrayInteger [3]);
        System.out.println(arrayInteger [4]);
        //atau
        System.out.println("Nilai yang didapat = " + Arrays.toString(arrayInteger));
        
        //Jumlah nilai
        for(int i = 0; i < arrayInteger.length ; i++);{
        System.out.println("Jumlah Nilai = " +arrayInteger.length);
        
        //looping for each
        for (int nilai : arrayInteger){
            System.out.println("Nilai = " + nilai);
        }      
    }
                      
    }
    
}

