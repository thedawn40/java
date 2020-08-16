package tes.No15;
public class Main {
    public static void main(String[] args) {

    Persegi k = new Persegi();
    k.setSisi(10.0D);
    
    System.out.println(k);
    
    System.out.println("======================================");
    System.out.println("Sisi : " + k.getSisi());
    System.out.println("=======================================");
    System.out.println("Luas Permukaan Kubus : " + k.getLuasPemukaan());
    System.out.println("Volume kubus : " + k.getVolume());
    System.out.println("Luas Persegi : " + k.getLuasPersegi()); 
    }
    
}
