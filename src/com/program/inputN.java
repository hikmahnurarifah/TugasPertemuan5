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

public class inputN {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan berapa perulangan: ");
        int N = input.nextInt();
        
        cetakKalimat(N);
    }

    public static void cetakKalimat(int N) {
        for(int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java " + (i + 1));
        }
    }
    
}
