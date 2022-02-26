
package PresensiPRO;

public class OperatorPembanding {
    public static void main(String[] args) {
       int nilai1 = 9;
       int nilai2 = 6;
       boolean hasil;
      
     //apakah nilai1 lebih kecil dari nilai2?
      hasil = nilai1 < nilai2;
      System.out.println("Nilai 1 < Nilai 2 = " + hasil);
      
      //apakah nilai1 lebih besar sama dengan dari nilai2?
      hasil = nilai1 >= nilai2;
      System.out.println("Nilai 1 >= Nilai 2 = " + hasil);
      
      //apakah nilai1 lebih kecil sama dengan dari nilai2?
      hasil = nilai1 <= nilai2;
      System.out.println("Nilai 1 <= Nilai 2 = " + hasil);
      
      //apakah nilai1 sama dengan dari nilai2?
      hasil = nilai1 == nilai2;
      System.out.println("Nilai 1 == Nilai 2 = " + hasil);
      
      //apakah nilai1 tidak sama dengan nilai2?
      hasil = nilai1 != nilai2;
      System.out.println("Nilai 1 != Nilai 2 = " + hasil);
    }
}
