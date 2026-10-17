import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PEMBELANJAAN {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama Pembeli : ");
        String nama = reader.readLine();

        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(reader.readLine());

        System.out.print("Diskon (%)   : ");
        double diskon = Double.parseDouble(reader.readLine());

        double total = totalBelanja - (totalBelanja * diskon / 100);
        
        System.out.print("Bayar        : ");
        double bayar = Double.parseDouble(reader.readLine());

        double kembalian = bayar - total;

        System.out.println("\n--- STRUK PEMBELANJAAN ---");
        System.out.println("Nama         : " + nama);
        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Total        : " + total);
        System.out.println("Bayar        : " + bayar);
        System.out.println("Kembalian    : " + kembalian);
    }
}
        
    
    

