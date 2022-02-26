
package PercabanganIF;

import java.util.Scanner;

public class StudiKasusPercabanganIFKamar {
    public static void main(String[] nisa) { 
    String nama;
    double tipeKamar, noNIK,harga, total = 0, bayar, kembalian;
    int nokamar, jumlahOrang;
   
Scanner input = new Scanner (System.in);
System.out.println("DATA DIRI") ;

   System.out.print("NAMA : ");
        nama = input.nextLine ();
   System.out.print("NIK : ");
        noNIK = input.nextDouble ();
   System.out.print("Jumlah Orang : ");
        jumlahOrang = input.nextInt ();
    
        System.out.println("---------HOTEL JATRA-----------");
        System.out.println (" DATA DIRI ");
        System.out.println("NAMA: " + nama);
        System.out.println ("NIK: " + noNIK );
        System.out.println("Jumlah Orang: " + jumlahOrang );
        

     System.out.println("TIPE KAMAR") ;
if (jumlahOrang <= 2 ){
         System.out.println ("1. TIPE 1 B [ Rp 325.000] ");
         System.out.println ("2. TIPE 2 B [ Rp 250.000] ");
         System.out.println ("3. TIPE 3 B [ Rp 200.000] ");
         System.out.println ("0. Keluar Dari Program");
} else if (jumlahOrang <= 4 ){
        System.out.println ("7. TIPE 1 A [ Rp 810.000] ");
        System.out.println ("8. TIPE 2 A [ Rp 705.000] ");
        System.out.println ("9. TIPE 3 A [ Rp 675.000] ");
        System.out.println ("0. Keluar Dari Program");
}else {
        System.out.println( "Maaf Tidak Tersedia Tipe Kamar Lainnya");}
  

System.out.println ("Masukkan Tipe Kamar : ");
  tipeKamar = input.nextDouble ();
if ( tipeKamar == 1 ) {
    System.out.println("Nomor kamar yang tersedia adalah 61");
    harga = 325000;
    total = harga;
    System.out.println( "total = " + total);}
else if ( tipeKamar == 2 ) {
    System.out.println( "Nomor kamar yang tersedia adalah 72");
    harga = 250000;
    total = harga;
    System.out.println( "total = " + total);}
else if ( tipeKamar == 3 ){
    System.out.println( "Nomor kamar yang tersedia adalah 80");
    harga = 200000;
    total = harga;
    System.out.println( "total = " + total);}

  if ( tipeKamar == 7 ) {
    System.out.println("Nomor kamar yang tersedia adalah 50");
    harga = 810000;
    total = harga;
    System.out.println( "total = " + total);}
else if ( tipeKamar == 8 ) {
    System.out.println( "Nomor kamar yang tersedia adalah 42");
    
    harga = 705000;
    total = harga;
    System.out.println( "total = " + total);}
else if ( tipeKamar == 9 ) {
    System.out.println( "Nomor kamar yang tersedia adalah 30");
    harga = 675000;
    total = harga;
    System.out.println( "total = " + total);}

  //PEMBAYARAN//
  System.out.println("Pembayaran : Rp " );
      bayar = input.nextDouble ();
  
  if (bayar == total) {
    System.out.println("Terimakasih uang anda pas");
}else if (bayar > total ){
      System.out.println("Anda memiliki pengembalian sebesar : " + (bayar-total));
}
else{
    System.out.println("Maaf Uang Anda Tidak Cukup");
        }
   }
}



