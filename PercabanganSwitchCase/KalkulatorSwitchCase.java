
package PercabanganSwitchCase;

import java.util.Scanner;

public class KalkulatorSwitchCase {
    public static void main(String[] args) {
        float a,b,hasil;
        String operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai A :");
        a = input.nextFloat();
        System.out.print("Operator :");
        operator = input.next();
        System.out.print("Nilai B :");
        b = input.nextFloat();
        
        switch(operator){
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasilnya :" + hasil);
            break;
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasilnya :" + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasilnya :"+ hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasilnya :" + hasil);
            default:
                System.out.println("Operator tidak ditemukan");
        }
        
       
        
    }
    
}
