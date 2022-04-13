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
public class UlanganHarianLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int pertama, kedua, ketiga, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  
 if(pertama>kedua){
     System.out.println("nilai terbesar adalah "+ pertama);
 terbesar = pertama;
 
 }else{
     System.out.println("nilai terbesar adalah "+ kedua );
 
 }
 }
  
 // System.out.println("Bilangan terbesar adalah "+terbesar);
    }
    

