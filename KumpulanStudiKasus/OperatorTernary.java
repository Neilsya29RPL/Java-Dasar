
package PresensiPRO;

import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        int input,X;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        input = inputUser.nextInt();
        
        //variable X = ekspresi? statement_true : statement_false
        
        X = (input >= 10) ? (input*input) : (input/2);
        
        System.out.println("Hasilnya :" + X);
        
    }
    
}
