package tes;

import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
      
        System.out.print("input : ");
        int input = scan.nextInt();
        
        System.out.print("Angka Fibonacci : ");
        long fib[] = new long[input];
            fib[0] = 0;
            fib[1] = 1;
//            System.out.print(fib[0]);
            
        for(int i = 2; i < input; i++) {
          fib[i] = fib[i-1] + fib[i-2];
            }

        for (int i = 0; i < input; i++) {
            if(i==fib.length-1){
                System.out.print(fib[i]+" ");
            }
            else{
                System.out.print(fib[i]+", ");
            }
//            if(fib[i]>0){
//            System.out.print(", "+fib[i]);                
//            }
	}

        System.out.println("");
    }
    
}
