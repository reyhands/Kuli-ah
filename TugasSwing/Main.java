
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reyhan
 */
public class Main {
   

    public static void main(String[] args)
    {
        int menu = 0;
        String a;
        Scanner inputmenu = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();
        Scanner backmenu = new Scanner(System.in);
        
      System.out.println("Tekan Enter Untuk Memulai");
        mhs.setData();
   do{
        System.out.println("1.Lihat Data\n 2.edit Data");
         menu = inputmenu.nextInt();
            if(menu==1)
                {
                      mhs.Tampil();
                }
            else if(menu==2)
            {
                 mhs.setData();
            }
        System.out.println("Back to menu ? (y/n)");
        a = backmenu.nextLine();
     }
   while(a.equals("y"));
    
    
    
    
    }
}



