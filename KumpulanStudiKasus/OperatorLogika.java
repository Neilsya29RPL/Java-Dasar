
package PresensiPRO;

public class OperatorLogika {
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = true;
        boolean b = false;
        boolean c;
        
        //konjungsi (dan)
        c = a && b;
        System.out.println("Konjungsi true && true ="+c);
        
        //Disjungsi (atau)
        c = a || b;
        System.out.println("Disjungsi true || false ="+c);
        
        //negasi (bukan)
        System.out.println("Negasi, !false = "+ !a);
        
        //negasi (bukan)
        System.out.println("Negasi, !true = "+ !a);
    }
}
