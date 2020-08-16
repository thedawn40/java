package tes;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("input : ");
        int input = scan.nextInt();
        
        for (int i=1;i<=input;i++){
            for(int x=input; x >= i ; x--){
                System.out.print(" ");
            }
            for(int y=1; y<=i; y++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
