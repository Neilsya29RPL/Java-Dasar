
package Biodata;

import java.util.Scanner;
public class InputBiodata {
    public static void main(String[] args) {
        String NamaLengkap,NamaAkrab,TempatTanggalLahir,AsalKota,AsalSMP,Hobi,KalimatMotivasi,Prestasi;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama Lengkap : ");
        NamaLengkap = input.nextLine();
        System.out.print ("Nama Akrab : ");
        NamaAkrab = input.nextLine();
        System.out.print ("Tempat Tanggal Lahir : ");
        TempatTanggalLahir = input.nextLine();
        System.out.print ("Asal Kota : ");
        AsalKota = input.nextLine();
        System.out.print ("Asal SMP : ");
        AsalSMP = input.nextLine();
        System.out.print ("Hobi  : ");
        Hobi = input.nextLine();
        System.out.print ("Kalimat Motivasi : ");
        KalimatMotivasi = input.nextLine();
        System.out.print ("Prestasi : ");
        Prestasi = input.nextLine();
        
         System.out.println ("==========BIODATA==========");
         System.out.println("Nama Lengkap : " + NamaLengkap);
         System.out.println("Nama Akrab : " + NamaAkrab);
         System.out.println("Tempat Tanggal Lahir : " + TempatTanggalLahir );
         System.out.println("Asal Kota : " + AsalKota);
         System.out.println("Asal SMP : " + AsalSMP);
         System.out.println("Hobi : " + Hobi);
         System.out.println("Kalimat Motivasi : " + KalimatMotivasi);
         System.out.println("Prestasi : " + Prestasi);      
    }   
}
