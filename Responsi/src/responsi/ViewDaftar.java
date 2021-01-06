/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ViewDaftar extends JFrame {

    JLabel jljudul = new JLabel("Login ");
    JLabel jlusername = new JLabel("Username : ");
    JTextField jtusername = new JTextField();
    JLabel jlpassword = new JLabel("Password : ");
    JTextField jtpassword = new JTextField();
  
    JButton jblogin= new JButton("Login");
    JButton jbdaftar= new JButton("Daftar");
    JButton jbbatal= new JButton("Batal");
    JButton jbinput = new JButton("Daftar");
    
     public ViewDaftar()
    {
        
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(300,210); // x , y
        
       jljudul.setText("Daftar ");
       
       add(jljudul);
       add(jlusername);
       add(jtusername);
       add(jlpassword);
       add(jtpassword);
       add(jbdaftar);
       add(jbbatal);
       
        jljudul.setBounds(125,25,50,20);
        
        jlusername.setBounds(50,50,100,20);
        jtusername.setBounds(125,50,100,20);
        
        jlpassword.setBounds(50,80,100,20);
        jtpassword.setBounds(125,80,100,20);
        
        jbdaftar.setBounds(50,120,80,20);
        jbbatal.setBounds(150,120,80,20);
     
        
    }
     
     public String getUsername()
        {
            return jtusername.getText();
        }
     
     public String getPassword()
     {
            return jtpassword.getText();
     }
    
}
