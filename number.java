package com.tutorial;
import java.util.Scanner;


class perhitungan {
    int angka;

    perhitungan(int inputangka) {
    angka = inputangka;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan : ");
    angka = input.nextInt();
        if (angka % 2 == 0)
        {
        if (angka < 0)
        System.out.println ("Bilangan " + angka + " genap negatif");
        
        else
        System.out.println("Bilangan " + angka + " genap positif");
        
        }else{
        if (angka < 0)
        System.out.println ("Bilangan " + angka + " ganjil negatif");
        
        else
        System.out.println("Bilangan " + angka + " ganjil positif");
        }
    }
}

public class number {
    public static void main(String[] args) throws Exception {
        new perhitungan(0);
    }
}
