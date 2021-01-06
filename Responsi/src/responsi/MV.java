/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsi;

/**
 *
 * dont forget to take a break and sruput a cup of a coffee ya Reyhan !!
 */
public class MV {
        ViewAuntentikasi vA = new ViewAuntentikasi();
        ModelAuntentikasi mA = new ModelAuntentikasi();
        ModelPinjam mP = new ModelPinjam();
        ModelTampil mT = new ModelTampil();
        ModelEdit mE = new ModelEdit();
        ViewDaftar vD = new ViewDaftar();
        ViewPinjam vP = new ViewPinjam();
        ViewPinjam vEdit = new ViewPinjam();
        ViewHome vH = new ViewHome();
        ViewTampil vT = new ViewTampil();
        ViewAboutUs vAU = new ViewAboutUs();
        ViewEdit vE = new ViewEdit();
         
        
                ControllerAuntentikasi cA = new ControllerAuntentikasi(vA, mA, vD, vH);
                ControllerHome cH = new ControllerHome(vH,vP,vT,vAU);
                ControllerPinjam cP = new ControllerPinjam(mP,vP);
                ControllerTampil tP = new ControllerTampil(vA,mT,vT,mE,vE);
                ControllerEdit cE = new ControllerEdit(vE,mE);
                
      
        

}
