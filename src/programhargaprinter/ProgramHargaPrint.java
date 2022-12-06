/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programhargaprinter;
import java.util.Scanner;
/**
 *
 * @author Micu
 */
public class ProgramHargaPrint
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String jenis,ukuran;
        int lembar,harga;
        System.out.print("Pilih jenis printer Anda? (1. Hitam, 2. Warna, 3. Gambar) = ");
        jenis=scan.next();
        if ("Hitam".equalsIgnoreCase(jenis))
        {
            System.out.print("Apakah ukuran kertas Anda? (1. A4, 2. F4) = ");
            ukuran=scan.next();
            if ("A4".equalsIgnoreCase(ukuran))
            {
                System.out.print("Berapa lembar kertas Anda? = ");
                lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 50)
                {
                    harga=1000*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 50 )
                {
                    harga=750*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
            else if ("F4".equalsIgnoreCase(ukuran))
            {
            System.out.print("Berapa lembar kertas Anda? = ");
            lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 50)
                {
                    harga=1250*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 50 )
                {
                    harga=1000*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
        }
        else if ("Warna".equalsIgnoreCase(jenis))
        {
            System.out.print("Apakah ukuran kertas Anda? (1. A4, 2. F4) = ");
            ukuran=scan.next();
            if ("A4".equalsIgnoreCase(ukuran))
            {
            System.out.print("Berapa lembar kertas Anda? = ");
            lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 30)
                {
                    harga=1500*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 30 )
                {
                    harga=1100*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
            else if ("F4".equalsIgnoreCase(ukuran))
            {
            System.out.print("Berapa lembar kertas Anda? = ");
            lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 30)
                {
                    harga=1750*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 30 )
                {
                    harga=1550*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
        }
        else if ("Gambar".equalsIgnoreCase(jenis))
        {
            System.out.print("Apakah ukuran kertas Anda? (1. A4, 2. F4) = ");
            ukuran=scan.next();
            if ("A4".equalsIgnoreCase(ukuran))
            {
            System.out.print("Berapa lembar kertas Anda? = ");
            lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 20)
                {
                    harga=2000*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 20 )
                {
                    harga=1700*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
            else if ("F4".equalsIgnoreCase(ukuran))
            {
            System.out.print("Berapa lembar kertas Anda? = ");
            lembar=scan.nextInt();
                if (lembar > 0 && lembar <= 20)
                {
                    harga=2250*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else if (lembar > 20 )
                {
                    harga=2100*lembar;
                    System.out.println("Total harga yang harus Anda bayar adalah Rp "+harga);
                }
                else
                {
                    System.out.println("System kami tidak dapat memproses nilai negatif...");
                }
            }
        }
        else
        {
            System.out.println("System kami tidak bisa memproses jenis printer selain jenis di atas...");
        }
        
    }
    
}
