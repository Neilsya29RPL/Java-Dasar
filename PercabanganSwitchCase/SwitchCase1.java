
package PercabanganSwitchCase;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner (System.in);
        
        System.out.print("Masukkan Nama:");
        input = inputUser.next();
        
        switch(input){
        case "Neilsya":
            System.out.println("Saya Neilsya Hadir");
            break;
        case "Ultra":
            System.out.println("Saya Ultra Hadir");
        default:
            System.out.println("Tidak Hadir");
        
    }
      }
    
}


