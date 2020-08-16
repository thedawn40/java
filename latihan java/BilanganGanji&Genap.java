package tes;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("input : ");
        int input=scan.nextInt();
        
        System.out.println("");
        System.out.print("Bilangan genap : ");
        for(int i = 2; i <= input*2; i++){
            if(i%2==0){
             if(i < input*2){
                System.out.print(i+", ");
            }else if(i==input*2){
                System.out.print(i);
            }
          }
        }
        
        System.out.println("");
        System.out.print("Bilangan ganjil : ");
        for(int i = 1; i <= input*2; i++){
           if(i%2!=0){
            if(i < input*2-1){
                System.out.print(i+", ");
            }else if(i==input*2-1){
                System.out.println(i);
            }
           }
		}
	}
}
