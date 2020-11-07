/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan35.tunjanganoo;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan35TunjanganOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TunjanganOO tj = new TunjanganOO();
        System.out.println("======Program Tunjangan=======");
        System.out.print("Berapa gaji anda perbulan\t: Rp ");
        tj.gajiPokok = sc.nextInt();
        System.out.print("Status anda ? (Menikah/Belum)\t: ");
        Scanner st = new Scanner(System.in);
        tj.status = st.nextLine();
        
        System.out.println();
        
        System.out.println("======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji pokok\t Rp : " + tj.gajiPokok);
        System.out.println("Tunjangan\t Rp : " + tj.menghitungTunjangan());
        System.out.println("Total gaji\t Rp : " + tj.menghitungTotalGaji());
    }
    
}
