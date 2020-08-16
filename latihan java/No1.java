package tes;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("input bilangan 1 : ");
        int bil1 = scan.nextInt();
        System.out.print("input bilangan 2 : ");
        int bil2 = scan.nextInt();
        System.out.println("");
        
        if(bil1>bil2){
            System.out.println("Bilangan terkecil : "+bil2);
            System.out.println("Bilangan terbesar : "+bil1);
        }else{
            System.out.println("Bilangan terkecil : "+bil1);
            System.out.println("Bilangan terbesar : "+bil2);
        }
        
    }
    
}
