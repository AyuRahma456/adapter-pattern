/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infokmr;

/**
 *
 * @author Pc
 */
public class tambahanA implements kamarTambahan{
     
    @Override
    public void kipasAngin(){
    System.out.println("kamar tambahan A menggunakan kipas angin standart");
    }
    
    @Override
    public void jenisKasur(){
    System.out.println("kamar A menggunakan single bed");
    }
    
    @Override
    public void harga(){
    System.out.println("kamar A dikenakan biaya 100 ribu per malam");
    }
}
