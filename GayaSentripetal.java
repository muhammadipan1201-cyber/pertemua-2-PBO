import java.util.Scanner;



public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Massa : ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan ): ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari : ");
        double r = input.nextDouble();

        double fc = (m * v * v) / r;

        System.out.println("Gaya Sentripetal = " + fc);
        
        input.close();
    }
}
        
    
    

