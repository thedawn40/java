package tes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class No3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        try{    
        System.out.print("tanggal : ");
        String tgl = scan.next();
        
        System.out.println("");
        String[] arr = tgl.split(",");
        
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
        Date tanggal1 =  (Date) date.parse(arr[0]);
        Date tanggal2 =  (Date) date.parse(arr[1]);

        long selisih = Math.abs(tanggal2.getTime()-tanggal1.getTime());
            System.out.println(TimeUnit.MILLISECONDS.toDays(selisih));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}        

            
//        System.out.print("tanggal 1 : ");
//        String tgl1=scan.next();
//        System.out.print("tanggal 2 : ");
//        String tgl2=scan.next();
//        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 
//        Date tanggal1 = (Date)date.parse(tgl1);
//        Date tanggal2 = (Date)date.parse(tgl2);
