/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ModelEdit extends ModelAuntentikasi {
    public void setid (String Id,String Nama,String IDBuku)
     {
           try
           {
             
               
               String query = "update transactions SET MemberName='" + Nama + "' , BookId = '"  + IDBuku + "' WHERE Id=" + Id;
               statement = (Statement) koneksi.createStatement();
               statement.executeUpdate(query);
           }
           
           catch(SQLException e)
           {
               System.out.println(e.getMessage());
           }
     }
    
   
}
