
package PresensiPRO;

public class ControlFlow {
    public static void main(String[] args) {
        //break, continue, dan return
        int a = 0;
        
        while (true){
            a++;
            if(a == 10){
                break; // ini keeyword untuk memaksa keluar dari looping
            }else if(a == 5){
                continue; //ini keyword untuk memaksa keluar aksi dari awal
            }else if (a == 7){
            }
            
            
            
            System.out.println("looping ke-" + a);
            return;
        }
    }
    
}
