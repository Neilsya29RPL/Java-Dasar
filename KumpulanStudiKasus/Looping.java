
package PresensiPRO;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        //program untuk menjumlahkan angka dengan rentang  
        int nilaiAwal,nilaiAkhir,total;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal : ");
        nilaiAwal= input.nextInt();
        System.out.print("Masukkan Nilai Akhir :");
        nilaiAkhir = input.nextInt();
        
        total = 0;
        //while
        while(nilaiAwal <= nilaiAkhir){
        total = total + nilaiAwal;
        System.out.println("ditambah" + nilaiAwal + "menjadi" + total);
        nilaiAwal++;
        }
        
        //DoWhile
        boolean kondisi = true;
        do{
            nilaiAwal ++;
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + "menjadi" + total);
            
            if(nilaiAwal >= nilaiAkhir){
                kondisi = false;   
            }
        }while(kondisi);

          //ForLoop
         for(total = 0; nilaiAwal <= nilaiAkhir ;nilaiAwal ++){
             total = total + nilaiAwal;
         System.out.println("ditambah" + nilaiAwal + "menjadi" + total);
         }
    }
    
}
