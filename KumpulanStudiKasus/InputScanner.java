

package PresensiPRO;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,alamat;
        int umur;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("DATA MAHASISWA");
        System.out.print("Nama Mahasiswa :");
        nama = input.nextLine();
        System.out.print("Alamat :");
        alamat = input.nextLine();
        System.out.print("Umur :");
        umur = input.nextInt();
        
        System.out.println("---------------------");
        System.out.println("Nama Mahasiswa :"+ nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("Umur :" + umur);
        
    }
}
