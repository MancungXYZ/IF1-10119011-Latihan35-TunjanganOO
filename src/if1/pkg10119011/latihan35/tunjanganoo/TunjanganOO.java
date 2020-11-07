/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan35.tunjanganoo;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class TunjanganOO {
    public String status;
    public double gajiPokok;
    public double Tunjangan;
    
    public double menghitungTunjangan () {
        if (status.equals("Menikah")) {
            return 0.35 * gajiPokok;
        } else {
            return 0;
        }    
    }
    
    public double menghitungTotalGaji () {
        return gajiPokok + menghitungTunjangan();
    }
}
