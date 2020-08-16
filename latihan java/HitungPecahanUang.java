package tes;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
            
        System.out.print("Input uang : ");
        Integer uang = Integer.parseInt(scan.nextLine());
        
        int bil = 0;
        int a = 100000;
        int b = 50000;
        int c = 20000;
        int d = 10000;
        int e = 5000;
        int j = 2000;
        int f = 1000;
        int g = 500;
        int h = 200;
        int i = 100;
        
        int m = uang.toString().length();
   
        for(int x = 0; x < m; x++) {
            if(uang >= a)
            {
                bil = uang / 100000;
                System.out.println("100000 sebananyak "+bil);
            }
            uang = uang % 100000;
            if ((uang >= b) && (uang <a))
            {
                bil = uang / 50000;
                System.out.println("50000 sebanyak "+bil);
            }
            uang = uang % 50000;
            if ((uang >= c) && (uang <b))
            {
                bil = uang / 20000;
                System.out.println("20000 sebanyak "+bil);
            }
            uang = uang % 20000;
            if ((uang >= d) && (uang <c))
            {
                bil = uang / 10000;
                System.out.println("10000 sebanyak "+bil);
            }
            uang = uang % 10000;
            if ((uang >= e) && (uang <d))
            {
                bil = uang / 5000;
                System.out.println("5000 sebanyak "+bil);
            }
            uang = uang % 5000;
            if ((uang >= j) && (uang <e))
            {
                bil = uang / 2000;
                System.out.println("2000 sebanyak "+bil);
            }
            uang = uang % 2000;
            if ((uang >= f) && (uang <j))
            {
                bil = uang / 1000;
                System.out.println("1000 sebanyak "+bil);
            }
            uang = uang % 1000;
            if ((uang >= g) && (uang <f))
            {
                bil = uang / 500;
                System.out.println("500 sebanyak "+bil);
            }
            uang = uang % 500;
            if ((uang >= h) && (uang <g))
            {
               bil = uang / 200;
               System.out.println ("200 sebanyak "+bil);
            }
            
            uang = uang % 200;
            if ((uang >= i) && (uang <h))
            {
               bil = uang / 100;
               System.out.println ("100 sebanyak "+bil);
            }
            
            
    }
    
}
}