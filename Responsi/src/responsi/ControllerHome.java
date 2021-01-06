/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ControllerHome {
    ViewHome viewhome;
    ViewPinjam viewpinjam;
    ViewTampil viewtampil;
    ViewAboutUs viewaboutus;
    
    public ControllerHome(ViewHome vh,ViewPinjam vp,ViewTampil vt,ViewAboutUs vau)
    {
        this.viewhome = vh;
        
        
        viewhome.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vp.setVisible(true);
                
            }
            
         
        });
        
          viewhome.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              vh.setVisible(false);
              vp.setVisible(false);
              vt.setVisible(true);
            }   
        });
          
          viewhome.jbaboutus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vh.jlaboutus.setText("About Us"); 
                vh.jlaboutuslanjut.setText("Reyhan|124190023");
              
            }
        }) ;
          
          viewhome.jbexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
        }); {
        
    }
    }
}
