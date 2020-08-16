package tes;

import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
      
        int b = 2;
        System.out.print("Batas bilangan : ");
        int input = scan.nextInt();
        
        System.out.print("Bilangan prima : ");
        System.out.print(b);
        for(int x = b; x<input; x++){
            boolean isPrima = true;
//            int i = 0;
            for(int y = b; y<x; y++){
                if(x%y==0){
                    isPrima = false;
                    break;
//                    if(x!=y){
//                        i=1;
                    }
            }
            if(isPrima ==true){
                if(x>2){
                    System.out.print(", "+x);
                }
            }
            
                    
//                    if(i!=1 && x == y){
//                    System.out.print(", "+x);
                    }
                }
            }
        
               
//        char tanda[] = new char[101];
//        for(int i = 2; i<= input; i++){
//            if(tanda[i]!='*'){
//                if(i<input){
//                    
//                System.out.print(i+", ");
//                for(int j =i*2;j<=input;j+=i){
//                    tanda[j]='*';
//                    
//                }
//                }else if(i<=input){
//                System.out.println(i);
//                for(int j =i*2;j<=input;j+=i){
//                    tanda[j]='*';    
//                }
//            }
//        }
//    }    