/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ControllerPinjam {
    
    ModelPinjam modelpinjam;
    ViewPinjam viewpinjam;
    
     public ControllerPinjam(ModelPinjam mp, ViewPinjam vp) {
      this.modelpinjam = mp;
      this.viewpinjam = vp;
      
      vp.jbtambah.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             String ID = vp.getID();
             String Nama = vp.getNama();
             String IDBuku = vp.getIdBuku();
             String JudulBuku = vp.getJudul();
             
             mp.input(ID, Nama, IDBuku, JudulBuku);
           
          }
      });
      
      vp.jbbatal.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             vp.setVisible(false);
             vp.dispose();
             
          }
      });
     }
     
}


