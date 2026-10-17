import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class HitungBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int manggaAwal = 70;
        int manggaBusuk = 15;
        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;

        int totalJambu = jumlahTetangga * jambuPerTetangga;
        int totalManggaEfektif = manggaAwal - manggaBusuk;
        int totalBuah = totalManggaEfektif + totalJambu;

        System.out.println("=== PERHITUNGAN TOTAL BUAH IBU SISCA ===");
        System.out.println("Mangga dibeli awal     : " + manggaAwal + " pcs");
        System.out.println("Mangga busuk (kembali) : " + manggaBusuk + " pcs");
        System.out.println("Total Jambu (4 tetangga): " + totalJambu + " pcs");
        System.out.println("Total Buah yang Dimiliki: " + totalBuah + " pcs");
    }
        
    
}
