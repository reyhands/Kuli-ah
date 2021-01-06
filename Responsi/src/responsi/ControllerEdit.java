/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ControllerEdit {
    ViewEdit Ve;
    ModelEdit mE;
    String dataterpilih;
    
    public ControllerEdit(ViewEdit vE,ModelEdit mE)
    {
        this.Ve= vE;
        this.mE = mE;
        
        dataterpilih = vE.IDD.getText();
        vE.jbtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  mE.setid(vE.IDD.getText(), vE.getNama(), vE.getIdBuku()); 
                  System.out.println(dataterpilih);}
            
            
        });
        
        
      
        
    }
    
    
    
   

}
