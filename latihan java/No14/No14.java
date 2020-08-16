package tes.No14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No14 {
    public static void main(String[] args) {
             
        Scanner scan = new Scanner(System.in);
        
        List<Integer> nilai = new ArrayList<>();
        System.out.print("Input Nilai : ");
        int input = scan.nextInt();
        nilai.add(input);
        
        System.out.print("Input Nilai : ");
        int input2 = scan.nextInt();
        nilai.add(input2);
        
        System.out.print("Input Nilai : ");
        int input3 = scan.nextInt();
        nilai.add(input3);
                
        System.out.print("Input Nilai : ");
        int input4 = scan.nextInt();
        nilai.add(input4);
        
        System.out.print("Input Nilai : ");
        int input5 = scan.nextInt();
        nilai.add(input5);
                
        System.out.println("");
//        System.out.println("Nilai : "+nilaiMx().toString());
//        nilaiMx(input);

//        String text = String.valueOf(input);
//        String[] arr = text.split(" ");       
//        
//        arr[0] =      
        Integer[] array = new Integer[nilai.size()];
        int index = 0;
        for(Object value:nilai){
            array[index] = (Integer)value;
            index++;
        }
        
        int max = 0;
        int min =1000;
        for(int a = 0;a<array.length;a++){
            if(array[a]>max){
                max=array[a];
            }else if(array[1]<min){
                min=array[a];
            }   
        }
        
        System.out.println("Nilai Maks : "+max);
        System.out.println("Nilai Min : "+min);
    }    
}