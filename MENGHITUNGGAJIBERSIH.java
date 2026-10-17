import java.util.Scanner;

public class MENGHITUNGGAJIBERSIH {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nomor Induk Karyawan (NPM): ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        double p1 = 2000000; // Gaji Pokok
        double p2 = 300000;  // Tunjangan Jabatan
        double p3 = 200000;  // Tunjangan Istri
        double p4 = 150000;  // Tunjangan Anak

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n--- DATA GAJI KARYAWAN ---");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : Manajer");
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajak);
        System.out.println("Gaji Bersih          : " + gajiBersih);
        
        input.close();
    }
        
    }
    

