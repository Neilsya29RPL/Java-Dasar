
package Function;


public class Function1 {
    public static void main(String[] args) {
    int y,x;
    x = 5;
    y = hitung(x);
    System.out.println("X = " + x +", Y = " + y);
    
    x = 10;
    y = hitung(x);
    System.out.println("X = " + x +", Y = " + y);
    
    x = 20;
    y = hitung(x);
    System.out.println("X = " + x +", Y = " + y);
    }
    
    private static int hitung (int input){
        int hasil;
        hasil = (input +4 )*input;
        return hasil;
    }   
}


