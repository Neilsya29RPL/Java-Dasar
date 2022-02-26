
package PresensiPRO;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        float a,b,hasil;
        char operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai A :");
        a = input.nextFloat();
        System.out.print("Operator :");
        operator = input.next().charAt(0);
        System.out.print("Nilai B :");
        b = input.nextFloat();
        
        
        if( operator == '*'){
            //perkalian
            hasil = a*b;
            System.out.println("Hasil :" + hasil);    
            
        }else if(operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("Hasil :" + hasil);
        }else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("Hasil : " + hasil);
        }else if (operator == '/'){
            //pembagian
            hasil = a / b;
            System.out.println("Hasil :" + hasil);
                    
        }else{
            System.out.println("Operator tidak ditemukan");
        }    
                
    }
}
