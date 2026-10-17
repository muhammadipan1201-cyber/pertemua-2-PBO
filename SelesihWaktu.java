import java.util.Scanner;

public class SelesihWaktu {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- Waktu Pertama ---");
        System.out.print("Jam   : "); int h1 = input.nextInt();
        System.out.print("Menit : "); int m1 = input.nextInt();
        System.out.print("Detik : "); int s1 = input.nextInt();

        System.out.println("\n--- Waktu Kedua ---");
        System.out.print("Jam   : "); int h2 = input.nextInt();
        System.out.print("Menit : "); int m2 = input.nextInt();
        System.out.print("Detik : "); int s2 = input.nextInt();

        int totalDetik1 = (h1 * 3600) + (m1 * 60) + s1;
        int totalDetik2 = (h2 * 3600) + (m2 * 60) + s2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int jam = selisihDetik / 3600;
        int sisa = selisihDetik % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("\nSelisih Waktu: " + jam + " Jam " + menit + " Menit " + detik + " Detik");
        
        input.close();
    }
}
    

