
package PercabanganIF;

import java.util.Scanner;

public class StudiKasusPercabanganIFNilai {
    public static void main(String[] args) {
       String nama;
       int nilai;
       
       Scanner input = new Scanner(System.in);
       
     System.out.print("Masukkan Nama : ");
     nama = input.next();
     System.out.print("Masukkan Nilai :");
     nilai = input.nextInt();
       
       if(nilai>=80){
           System.out.println("Nilai : A");
       }
       else if (nilai>=70){
           System.out.println("Nilai : B");
       }
       else if (nilai>=60){
           System.out.println("Nilai : C");
       }
       else if (nilai>=50){
           System.out.println("Nilai : D");
       }
       else{
           System.out.println("Nilai : E dan Tidak Lulus");
       }
    }
    
}

