/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */

import java.util.Scanner;

public class deretGenap {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        System.out.println("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        deretBilGenap(batasAwal, batasAkhir);
    }

    public static void deretBilGenap(int batasAwal, int batasAkhir) {
        System.out.println("Deret Genap: ");
        for(int i = batasAwal; i <= batasAkhir; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
