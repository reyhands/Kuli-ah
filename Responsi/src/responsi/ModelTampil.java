/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class ModelTampil extends ModelAuntentikasi{
     public int getBanyakData(){
        int jmlData = 0;
        try{
                 statement = (Statement) koneksi.createStatement();

            String query = "Select * from transactions";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    public String[][] readTransactions(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][5]; //baris, kolom nya ada 4
            
            String query = "Select * from transactions"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("MemberId"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("MemberName");                
                data[jmlData][2] = resultSet.getString("BookID");
                data[jmlData][3] = resultSet.getString("BookName");
                data[jmlData][4] = resultSet.getString("Id");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
      public void hapus (String Id)
         {
           try
           {
              
               
               String query = "delete from transactions WHERE Id=" + Id;
               statement = (Statement) koneksi.createStatement();
               statement.executeUpdate(query);
           }
           
           catch(SQLException e)
           {
               System.out.println(e.getMessage());
           }
     }
    
  
    
   
}
