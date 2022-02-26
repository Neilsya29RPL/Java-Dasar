
package PercabanganIF;

 import java.util.Scanner;

public class PercabanganIF2 {
    public static void main(String[] args) {        
       String nama;
       int nilai;
       
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.print("Masukkan Nilai :");
        nilai = input.nextInt();
       
       if(nilai>75){
           System.out.println("LULUS");
       }else {
           System.out.println("TIDAK LULUS");
       }
    }
    
}

