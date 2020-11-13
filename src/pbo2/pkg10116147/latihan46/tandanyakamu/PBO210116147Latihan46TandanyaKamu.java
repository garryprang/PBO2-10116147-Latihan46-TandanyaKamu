/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan46.tandanyakamu;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan keterangan sesuai umur.
 */

import java.util.Calendar;
import java.util.Scanner;
public class PBO210116147Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        System.out.print("Masukkan tahun lahir anda: ");
        age.setYearBirth(scanner.nextInt());
        
        //output
        System.out.println("\n======= Hasil Perhitungan Umur =======");
        System.out.println("Tahun lahir anda\t: " + age.getYearBirth());
        System.out.println("Hari ini tahun\t\t: " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
