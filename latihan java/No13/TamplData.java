package tes.No13;

import java.util.ArrayList;

public class TamplData {
    
    ArrayList<Dosen> tampung;
        
    public static void main(String[] args) {
        TamplData td = new TamplData();
        
        td.add("55413743", "D01", "xyz", "Depok", "M01");
        td.add("55413743", "D01", "xyz2", "Depok", "M01");
        
        td.showData();  
    } 
    
    public TamplData(){
       tampung = new ArrayList<Dosen>();
    }
    
    public void add(String nik, String kodeDosen, String namaDosen, String alamatDosen, String kodeMk ){
        tampung.add(new Dosen(nik,kodeDosen,namaDosen,alamatDosen,kodeMk));
    }
    
    public void showData(){
        for(Dosen dosen : tampung)
        {
            System.out.println("Nik : "+dosen.getNik());
            System.out.println("Kode Dosen : "+dosen.getKodeDosen());
            System.out.println("Nama : "+dosen.getNamaDosen());
            System.out.println("Alamat : "+dosen.getAlamatDosen());
            System.out.println("kode MK : "+dosen.getKodeMk());
            System.out.println("");
        }
    }
    
}

 