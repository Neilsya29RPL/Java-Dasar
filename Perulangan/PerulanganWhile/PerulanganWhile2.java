
package PerulanganWhile;

public class PerulanganWhile2 {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;
        
        while (kondisi){
            a++;
            System.out.println("Neilsya ke-" + a);
            
            
            if(a==9){
               kondisi = false;
            }
        }
        
    }
    
}


