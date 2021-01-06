/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class ViewHome extends JFrame{
    
    JButton jbexit = new JButton("Exit");
    
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbaboutus = new JButton("About Us");
    
    JLabel jlaboutus = new JLabel("SELAMAT DATANG DI");
    JLabel jlaboutuslanjut = new JLabel ("    PERPUSTAKAAN");
    
    public ViewHome(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(700,600);
        getContentPane().setBackground(Color.YELLOW);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Exit
        add(jbexit);
        jbexit.setBounds(560,20, 100, 20);
        jbexit.setBackground(Color.RED);
        //Perpustakaan
        add(jlperpus);
        jlperpus.setBounds(320,180,100,20);
        //Home
        add(jbhome);
        jbhome.setBounds(200, 240, 100, 40);
        //Pinjam
        add(jbpinjam);
        jbpinjam.setBounds(200, 290, 100, 40);
        //Pinjam
        add(jbtampil);
        jbtampil.setBounds(200, 340, 100, 40);
        //About Us
        add(jbaboutus);
        jbaboutus.setBounds(200, 390, 100, 40);
        //Label About Us
        add(jlaboutus);
        jlaboutus.setBounds(400, 300, 300, 40);
        //Label About Us Lanjut
        add(jlaboutuslanjut);
        jlaboutuslanjut.setBounds(400, 320, 300, 40);
    }
}
