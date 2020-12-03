/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BalokDanKerucut;

/**
 *
 * @author Reyhan
 */
public class Kerucut extends Lingkaran implements MenghitungRuang
  {  
    
     double tinggi;
        
        public  Kerucut (double jarijari,double tinggi)
        {
           super(jarijari);
           this.tinggi = tinggi;
        }
    
        @Override
        public double hitungvolume() 
            {
               return (Math.PI*super.jarijari*super.jarijari*this.tinggi)/3;
            }
        
        @Override
        public double hitungpermukaan()
                {
                    double garispelukis;
                    garispelukis = Math.sqrt((super.jarijari*super.jarijari)+(this.tinggi*this.tinggi));
                    return Math.PI * super.jarijari * (super.jarijari+garispelukis);
                    
                }

     }
