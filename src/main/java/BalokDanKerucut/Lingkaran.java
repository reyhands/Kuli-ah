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
public class Lingkaran implements MenghitungBidang {

   
    protected double jarijari;
    
    public Lingkaran(double jarijari)
    {
        this.jarijari = jarijari;
    }
    
            @Override
                public double hitungkeliling() 
                    {
                        return Math.PI*this.jarijari*2;
                    }

            @Override
                public double hitungluas() 
                {
                        return Math.PI*this.jarijari*this.jarijari;
                }
    
}
