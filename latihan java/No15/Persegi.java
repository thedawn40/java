package tes.No15;
public class Persegi extends Kubus
{
  private double sisi;
  


  public Persegi() {}
  

  public void setSisi(double sisi)
  {
    this.sisi = sisi;
  }
  
  public double getSisi() {
    return sisi;
  }
  
  public double getLuasPemukaan() {
    return 6.0D * sisi * sisi;
  }
  
  public double getVolume() {
    return sisi * sisi * sisi;
  }
  
  public double getLuasPersegi() {
    return sisi * sisi;
  }
  
  public String toString()
  {
    return "Luas Persegi sisi = " + 6.0D * sisi * sisi;
  }
  
  public String toString1()
  {
    return "Luas Volume sisi = " + sisi * sisi * sisi;
  }
  
  public String toString2()
  {
    return "Luas Volume sisi = " + sisi * sisi;
  }
}
