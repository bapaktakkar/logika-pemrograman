/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan.harian.logika;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ganjil_genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int a;
            System.out.println("MENENTUKAN BILANGAN GANJIL GENAP");
            System.out.println("--------------------------------");
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan : ");
    a = scan.nextInt();
    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
      System.out.print("Bilangan " + a + " adalah ganjil.\n");
    }
    
}
}
