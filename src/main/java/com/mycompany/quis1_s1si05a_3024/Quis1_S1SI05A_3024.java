/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_s1si05a_3024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * 21103024 / Annisa Dwi Rahmawati / S1SI05A
 */
public class Quis1_S1SI05A_3024 extends penduduk_3024{
    public static void main(String[] args) {
       nelayan_3024 A = new nelayan_3024();
       nelayan_3024 B = new nelayan_3024();
       dokter_3024 C = new dokter_3024();
       dokter_3024 D = new dokter_3024();
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            A.nik_3024 = br.readLine();
            System.out.println("Nama    : ");
            A.nama_3024 = br.readLine();
            System.out.println("Umur    : ");
            A.umur_3024 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat_3024 = br.readLine();
            System.out.println("Jumlah berat ikan : ");
            A.jmlBeratIkan_3024 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah solar : ");
            A.jmlSolar_3024 = Integer.parseInt(br.readLine());
            System.out.println();
            System.out.println("Gaji Pokok      : ");
            A.gaji_3024 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK     : ");
            B.nik_3024 = br.readLine();
            System.out.println("Nama    : ");
            B.nama_3024 = br.readLine();
            System.out.println("Umur    : ");
            B.umur_3024 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat_3024 = br.readLine();
            System.out.println("Jumlah berat ikan : ");
            A.jmlBeratIkan_3024 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah solar : ");
            A.jmlSolar_3024 = Integer.parseInt(br.readLine());
            System.out.println();
            System.out.println("Gaji Pokok      : ");
            A.gaji_3024 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            C.nik_3024 = br.readLine();
            System.out.println("Nama            : ");
            C.nama_3024 = br.readLine();
            System.out.println("Umur            : ");
            C.umur_3024 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat_3024 = br.readLine();
            System.out.println("Jumlah pasien   : ");
            C.jmlPasien_3024 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah obat        : ");
            C.jmlObat_3024 = Integer.parseInt(br.readLine());
            System.out.println("Gaji Pokok      : ");
            C.gaji_3024 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            D.nik_3024 = br.readLine();
            System.out.println("Nama            : ");
            D.nama_3024 = br.readLine();
            System.out.println("Umur            : ");
            D.umur_3024 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            D.alamat_3024 = br.readLine();
            System.out.println("Jumlah pasien   : ");
            D.jmlPasien_3024 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah obat        : ");
            D.jmlObat_3024 = Integer.parseInt(br.readLine());
            System.out.println("Gaji Pokok      : ");
            D.gaji_3024 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA NELAYAN ====");
            A.tampilDataNelayan();
            System.out.println("Total Pendapatan    : Rp "+A.totalPendapatanNelayan());
            System.out.println("");
            B.tampilDataNelayan();
            System.out.println("Total Pendapatan    : Rp "+B.totalPendapatanNelayan());
            System.out.println("====== DATA DOKTER ======");
            C.tampilDataDokter();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatanDokter());
            System.out.println("");
            D.tampilDataDokter();
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatanDokter());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
  }
        
    

