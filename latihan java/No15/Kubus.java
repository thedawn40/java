/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tes.No15;

/**
 *
 * @author user
 */
public class Kubus {
   private double sisi;
  


  public Kubus() {}
  


  public double getSisi()
  {
    return sisi;
  }
  
  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
  
  public String toString()
  {
    return "Luas Permukaan Kubus sisi = " + 6.0D * sisi * sisi;
  }
  
  public String toString1() {
    return "Luas volume sisi = " + sisi * sisi * sisi;
  }
  
  public String toString2() {
    return "Luas Volume sisi = " + sisi * sisi;
  } 
}
