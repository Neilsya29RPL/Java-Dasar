
package PresensiPRO;

import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        int kehadiran, tugas , UTS, UAS;
        double Nilaiakhir;
        Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan nilai kehadiran :");
       kehadiran = input.nextInt();
       System.out.print("Masukkan nilai tugas :");
       tugas = input.nextInt();
       System.out.print("Masukkan nilai UTS :");
       UTS = input.nextInt();
       System.out.print("Masukkan nilai UAS :");
       UAS = input.nextInt();
       
       System.out.println("====================");
       Nilaiakhir = (kehadiran*0.1)+(tugas*0.2)+(UTS*0.3)+(UAS*0.4);
       System.out.println("Nilai akhir =" + Nilaiakhir);
       
    }
    
}
