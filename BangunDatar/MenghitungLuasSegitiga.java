
package BangunDatar;

import java.util.Scanner;
public class MenghitungLuasSegitiga {
    public static void main(String[] args) {
       Double luas;
       int alas, tinggi;
       
       Scanner input = new Scanner (System.in);
       
       System.out.println("<<Program Hitung Luas Segitiga>>");
       System.out.print("Input alas: ");
       alas = input.nextInt();
       System.out.print("Input tinggi: ");
       tinggi = input.nextInt();
       
       luas = Double.valueOf((alas*tinggi)/2);
       
       System.out.println("Luasnya :"+luas);
         
     
    }
    
}


