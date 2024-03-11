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

public class PembagiBersamaTerbesar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai A: ");
        int a = input.nextInt();
        
        System.out.println("Masukkan nilai B: ");
        int b = input.nextInt();
        
        int pbb = cariPBB(a, b);
        
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah " + pbb);
    }

    public static int cariPBB(int a, int b) {
        int pbb = 1;
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                pbb = i;
            }
        }
        return pbb;
    }
    
}
