package tes;

import java.util.Scanner;

public class No11 {

    public static void main(String[] args) {
            Scanner baca = new  Scanner(System.in);
         long min, n, r, hasil;
         System.out.println("masukkan nilai n : ");
         n =baca.nextInt();
         System.out.println("masukkan nilai r : ");
         r = baca.nextInt();
         min=n-r;
         n=faktorial(n);
         r=faktorial(r);
         min=faktorial(min);
         hasil=n/(min*r);
         
         System.out.println("          n!   ");
         System.out.println("nCr =--------------- = "+hasil);
         System.out.println("     (n-r)! x r!   ");
         System.out.println("Maka Hasil Kombinasi adalah : "+hasil);
    }

    private static long faktorial(long x) {
            if(x==0) return (1);
            else
                return (x*faktorial(x-1));
    } 
}


