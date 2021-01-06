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
 * @author reyhan
 */
public class ViewPinjam extends JFrame{
    
    JButton jblogout = new JButton("Logout");
    
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    
    JLabel jlidanggota = new JLabel("ID Anggota : ");
    JTextField jtidanggota = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlidbuku = new JLabel("ID Buku : ");
    JTextField jtidbuku = new JTextField();
    JLabel jljudulbuku = new JLabel("Judul Buku : ");
    JTextField jtjudulbuku = new JTextField();
    
    JButton jbtambah = new JButton("Tambah");
    JButton jbbatal = new JButton("Batal");
    
    public ViewPinjam(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(700,600);
        getContentPane().setBackground(Color.YELLOW);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        
        //Logout
        add(jblogout);
        jblogout.setBounds(560,20, 100, 40);
        jblogout.setBackground(Color.RED);
        //Perpustakaan10
        add(jlperpus);
        jlperpus.setBounds(320,180,0,20);
        //ID Anggota
        add(jlidanggota);
        jlidanggota.setBounds(200, 240, 100, 20);
        add(jtidanggota);
        jtidanggota.setBounds(280, 240, 150, 20);
        //Nama
        add(jlnama);
        jlnama.setBounds(200, 300, 100, 20);
        add(jtnama);
        jtnama.setBounds(280, 300, 150, 20);
        //ID Buku
        add(jlidbuku);
        jlidbuku.setBounds(200, 360, 100, 20);
        add(jtidbuku);
        jtidbuku.setBounds(280, 360, 150, 20);
        //Judul Buku
        add(jljudulbuku);
        jljudulbuku.setBounds(200, 420, 100, 20);
        add(jtjudulbuku);
        jtjudulbuku.setBounds(280, 420, 150, 20);
        //Daftar
        add(jbtambah);
        jbtambah.setBounds(220, 480, 100, 20);
        //Batal
        add(jbbatal);
        jbbatal.setBounds(340, 480, 100, 20);
        

     
        
    }
    
       public String getID()
        {
            return jtidanggota.getText();
        }
       
       public String getNama()
       {
           return jtnama.getText();
       }
       
       public String getIdBuku()
       {
           return jtidbuku.getText();
       }
       public String getJudul()
       {
           return jtjudulbuku.getText();
       }
       
}
