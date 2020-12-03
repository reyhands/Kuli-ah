/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Reyhan
 */
class DataMahasiswa {

    String nama;
    private int nim;
    private String alamat;
    private double nilaiuts;
    private double nilaiuas;

   
    Scanner getdata = new Scanner(System.in);

    public void setData() {
        getdata.nextLine(); 
        System.out.println("Masukkan Nama : ");
        this.nama = getdata.nextLine();
        System.out.println("Masukkan Nim : ");
        this.nim = getdata.nextInt();getdata.nextLine(); 
        System.out.println("Masukkan Alamat : ");
        this.alamat = getdata.nextLine();
        System.out.println("Masukkan Nilai UTS : ");
        this.nilaiuts = getdata.nextDouble();
        System.out.println("Masukkan Nilai UAS : ");
        this.nilaiuas = getdata.nextDouble();
    }

    public void Tampil() {
        System.out.println("Nama   :  " + this.nama);
        System.out.println("Nim  :  " + this.nim);
        System.out.println("Alamat   :  " + this.alamat);
        System.out.println("NilaiUts   :  " + this.nilaiuts);
        System.out.println("NilaiUas   :  " + this.nilaiuas);
    }
}

