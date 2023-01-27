/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra07102022;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class latihan3 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Menghitung Gaji Karyawan ##");
    System.out.println("============================================");
    System.out.println();
     
    String nama = null;
    char golongan;
    int jam_kerja = 0, gaji_per_jam = 0, total_upah;
     
    System.out.println("Pogram hitung total haji pegawai");
    System.out.println(" gol\t\tgaji pokok\t\tgaji perjam");  
    System.out.println(" 1A\t\t500000\t\t\t2000");
    System.out.println(" 2A\t\t600000\t\t\t3000");
    System.out.println(" 1B\t\t700000\t\t\t4000");
    System.out.println(" 2B\t\t800000\t\t\t5000");
    System.out.println(" 3B\t\t900000\t\t\t6000");
        
    System.out.print("Golongan: ");
    golongan = input.next().charAt(0);   
     
    System.out.print("Jumlah jam kerja: ");
    jam_kerja = input.nextInt();    
     
    System.out.println();
     
     // tentukan jumlah upah per jam berdasarkan golongan
    switch (golongan) {
      case 'A':
        gaji_per_jam = 5000;
        break;
      case 'B':
        gaji_per_jam = 7000;
        break;
      case 'C':
        gaji_per_jam = 8000;
        break;
      case 'D':
        gaji_per_jam = 10000;
        break;
    }
       
    total_upah = jam_kerja * gaji_per_jam;
      
    // cek apakah jam kerja lebih dari 48 jam
    if ( (jam_kerja - 48) > 0 ) {
       total_upah = total_upah + ((jam_kerja - 48)*4000);
    }
     
    // proses output
    System.out.println(nama + " menerima upah Rp." + total_upah + " per bulan");
  }
}
