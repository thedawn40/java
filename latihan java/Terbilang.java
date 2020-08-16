package tes;

import java.util.Scanner;
public class No9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("input : ");
        int input = scan.nextInt();
        
        System.out.println(new No9().bilangx(input));
    }
    
    String[] nomina={"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
 
    public String bilangx(double angka)
    {
        if(angka<12)
        {
          return nomina[(int)angka];
        }
        
        if(angka>=12 && angka <=19)
        {
            return nomina[(int)angka%10] +" belas ";
        }
        
        if(angka>=20 && angka <=99)
        {
            return nomina[(int)angka/10] +" puluh "+nomina[(int)angka%10];
        }
        
        if(angka>=100 && angka <=199)
        {
            return "seratus "+ bilangx(angka%100);
        }
        
        if(angka>=200 && angka <=999)
        {
            return nomina[(int)angka/100]+" ratus "+bilangx(angka%100);
        }
        
        if(angka>=1000 && angka <=1999)
        {
            return "seribu "+ bilangx(angka%1000);
        }
        
        if(angka >= 2000 && angka <=999999)
        {
            return bilangx((int)angka/1000)+" ribu "+ bilangx(angka%1000);
        }
        
        if(angka >= 1000000 && angka <=999999999)
        {
            return bilangx((int)angka/1000000)+" juta "+ bilangx(angka%1000000);
        }
        
        return "";
    }
}
