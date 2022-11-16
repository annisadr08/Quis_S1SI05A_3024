/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_s1si05a_3024;

/**
 *
 * @author ASUS
 * 21103024 / Annisa Dwi Rahmawati / S1SI05A
 */
public class nelayan_3024 extends penduduk_3024 {
    int jmlBeratIkan_3024;
    int jmlSolar_3024;
    double gaji_3024;
    
    public double totalPendapatanNelayan(){
        gaji_3024 = (jmlBeratIkan_3024 * 8000) - (jmlSolar_3024 * 10000);
        return gaji_3024;
    }
    public void tampilDataNelayan(){
        tampilDataPenduduk();
        System.out.println("Jumlah berat ikan : " +jmlBeratIkan_3024);
        System.out.println("Jumlah solar : "+jmlSolar_3024+ "liter");
        System.out.println("Gaji : "+gaji_3024);
    }
}
