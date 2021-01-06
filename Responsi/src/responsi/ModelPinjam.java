/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static responsi.ModelAuntentikasi.DB_URL;
import static responsi.ModelAuntentikasi.JDBC_DRIVER;
import static responsi.ModelAuntentikasi.PASS;
import static responsi.ModelAuntentikasi.USER;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ModelPinjam extends ModelAuntentikasi {
    
     
     public void input(String ID,String Nama,String IDBuku,String JudulBuku)
     {
         try
         {
             String query = "insert into transactions (MemberId,MemberName,BookId,BookName) Values "
                           +"('"+ID+"','"+Nama+"','"+IDBuku+"','"+JudulBuku+"')";
              statement = (Statement) koneksi.createStatement();
              statement.executeUpdate(query);
         }
         
         catch(SQLException e)
         {
             System.out.println(e.getMessage());
         }
        
     }
     
     
}
