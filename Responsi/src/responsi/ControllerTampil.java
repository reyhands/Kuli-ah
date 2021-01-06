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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ControllerTampil extends JFrame {
     ModelTampil mt;
     ModelEdit me;
     ViewTampil vt;
     String dataterpilih,nama,idbuku,idmember,namabuku;
     ViewEdit vE;
     ViewAuntentikasi vA;
     
     public ControllerTampil(ViewAuntentikasi vA,ModelTampil modt,ViewTampil viewT,ModelEdit Me,ViewEdit vE)
     {
         this.mt = modt;
         this.vt = viewT;
         this.me = Me;
         
         if (mt.getBanyakData() != 0) {
            String dataMahasiswa[][] = mt.readTransactions();
            vt.tabel.setModel((new JTable(dataMahasiswa, vt.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
         
         
         
    vt.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = vt.tabel.getSelectedRow();
                int kolom = vt.tabel.getSelectedColumn(); // ga kepake sekarang
                nama = vt.tabel.getValueAt(baris, 1).toString();
                idmember = vt.tabel.getValueAt(baris, 0).toString();
                idbuku = vt.tabel.getValueAt(baris, 2).toString();
                namabuku = vt.tabel.getValueAt(baris, 3).toString();
                dataterpilih = vt.tabel.getValueAt(baris, 4).toString();
                System.out.println(dataterpilih);
                

                }
            
        }
        );
    
    vt.jbedit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
                 vE.jtnama.setText(nama);
                 vE.jtidbuku.setText(idbuku);
                 vE.IDD.setText(dataterpilih);
                 vE.jtidanggota.setText(idmember);
                 vE.jtjudulbuku.setText(namabuku);
                 vE.setVisible(true);
             }
         });
    vt.jbhapus.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 mt.hapus(dataterpilih);
                  if (mt.getBanyakData() != 0) {
            String dataMahasiswa[][] = mt.readTransactions();
            vt.tabel.setModel((new JTable(dataMahasiswa, vt.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
             }
         });
     
     vt.jblogout.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                vt.setVisible(false);
                vA.setVisible(true);
                vt.dispose();
                
             }
         } ) ;
     };
}

