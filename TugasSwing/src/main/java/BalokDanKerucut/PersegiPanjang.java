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
public class PersegiPanjang implements MenghitungBidang
        {
    
        protected double panjang,lebar;
        
        public PersegiPanjang(double panjang,double lebar)
        {
            this.panjang = panjang;
            this.lebar   = lebar;     
        }
        
        public PersegiPanjang(double panjang)
        {
            this.panjang = panjang;
        }

        
        
        
                @Override
                public double hitungkeliling()
                {
                    return 2 * (this.panjang + this.lebar);
                }
                
                @Override
                public double hitungluas()
                {
                    return this.panjang*this.lebar;
                }
        }
