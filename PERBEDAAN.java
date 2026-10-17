import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class PERBEDAAN {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = scan.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nama : ");
        String nama = br.readLine();
        
        System.out.println("Halo " + nama + ", umur Anda " + umur + " tahun.");
    }
}
        
    
    

