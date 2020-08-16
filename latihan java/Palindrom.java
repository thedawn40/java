package tes;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        
        String kata, dibalik = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        kata = scan.nextLine();
        
        for(int i = kata.length()-1; i>=0; i--){
            dibalik = dibalik + kata.charAt(i);
        }
        System.out.println("Kebalikan kata : "+dibalik);
        
        if(kata.equalsIgnoreCase(dibalik)){
            System.out.println("Kata "+dibalik+" adalah Palindrom");
        }else{
            System.out.println("Kata "+dibalik+" adalah bukan Palindrom");     
        }
        
    }
    
}
