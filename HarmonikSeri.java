package Donguler;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();
        double result = 0;

        for (int i = 1; i<=n; i++ ){
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
