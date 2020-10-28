/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Ejaan Nama
 */
public class PBOIF210119060Latihan25EjaanNama {

    public static void ejaan(String nama, int jumlahKarakter) {
         for (int i= 0; i<jumlahKarakter; i++) {
            char eja = nama.charAt(i);
            int no = i + 1;
            System.out.println("Huruf ke-" + no + " :" + eja);
         }  
    }
    public static void main(String[] args) {
       String nama;
       int jumlahKarakter;
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukan nama depan anda untuk dieja : ");
        nama = input.next();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk " + "'" + nama +"'"+"adalah : ");
        ejaan(nama,jumlahKarakter);
       
        }
      }
    
  
  
