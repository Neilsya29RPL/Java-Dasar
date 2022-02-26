
package Biodata;

import java.util.Scanner;

public class BiodataDanCekSuhu {
     public static void main(String[] args) {
         
        String NamaPanggilan,SMPAsal;
        int SuhuBadan;
        
        NamaPanggilan = "Neilsya";
        SMPAsal = "MTsN 1 Tulungagung";
        
        System.out.println("Nama Panggilan :" + NamaPanggilan);
        System.out.println ("SMP Asal :" + SMPAsal);
     
        Scanner input = new Scanner (System.in);
        System.out.print ("Masukkan Suhu :" );
        SuhuBadan = input.nextInt();
           
        if(SuhuBadan<37){
        System.out.println("Saya Sehat, Saya Kuat, dan Saya Bermanfaat!!!");
        }else{
            System.out.println("Segera melakukan pemeriksaan dan tetap waspada");
            }
    }
}
