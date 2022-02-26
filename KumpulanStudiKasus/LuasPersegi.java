
package PresensiPRO;

public class LuasPersegi {
    public static void main(String[] args) {
        String nama,kelas;
        Double panjang,lebar,luas;
          
        nama ="Anfif";
        kelas = "X RPL 1";
        panjang = 10.0;
        lebar = 7.5;
        luas = panjang*lebar;
        
        System.out.println("nama: "+nama);
        System.out.println("kelas: "+kelas);
        System.out.print("luas persegi: "+luas+" m ");
        
        if (luas>60){
            System.out.println("bisa digunakan untuk sepakbola");
        }        
    }   
}
