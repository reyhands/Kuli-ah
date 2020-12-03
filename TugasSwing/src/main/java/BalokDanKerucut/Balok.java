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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    double tinggi;
    
    public Balok(double panjang,double lebar,double tinggi)
            {
                 super(panjang,lebar);
                 this.tinggi = tinggi;
            }
    
    public Balok(double panjang)
    {
            super(panjang);
    }

            @Override
                public double hitungvolume() 
                {
                     return super.panjang*super.lebar*this.tinggi;
                }
                
            @Override
                public double hitungpermukaan()
                {
                    return 2*(((super.panjang*super.lebar))+((super.panjang*this.tinggi))+(((super.lebar*this.tinggi))));
                }           
}
