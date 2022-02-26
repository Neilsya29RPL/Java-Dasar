
package PresensiPRO;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int mawar = 21, melati = 3,matahari = 5;
        double harga;
        harga = 4500.5;
        double total, bayar;
        boolean lebihBesar = true;
        
        //Oprerator Arithmatika
        total = mawar + melati+matahari;
        bayar = total*harga;
        
        System.out.println("Jumlah barang yang dibeli ="+mawar+"+"+melati+"+"+matahari+"="+total );
        System.out.println("Total yang dibayar = Rp "+ bayar);
        
        if(mawar > melati){
            System.out.println("Bunga Mawar > Bunga Melati " + lebihBesar);
        }else if(mawar > matahari){
            System.out.println("Bunga Melati < Bunga Matahari " + lebihBesar);
        }
        
        if(mawar > matahari){
            System.out.println("Pembelian bunga mawar lebih banyak dari bunga matahari dan melati " + lebihBesar);
        }
    }
    
}
