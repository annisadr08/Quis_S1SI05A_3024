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
public class dokter_3024 extends penduduk_3024 {
    int jmlPasien_3024;
    int jmlObat_3024;
    double gaji_3024;
    
    public double totalPendapatanDokter(){
        gaji_3024 = (jmlPasien_3024 * 50000) + (jmlObat_3024 * 10000);
        return gaji_3024;
    }
    public void tampilDataDokter(){
        tampilDataPenduduk();
        System.out.println("Jumlah pasien : "+jmlPasien_3024);
        System.out.println("Jumlah obat : "+jmlObat_3024);
        System.out.println("Gaji : "+gaji_3024);
    }
    
}
