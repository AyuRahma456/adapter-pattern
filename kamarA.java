/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infokmr;

/**
 *
 * @author Pc
 */
public class kamarA implements kamar {
    
    @Override
    public void haveAc(){
    System.out.println("kamar A menggunakan ac ukuran standart");
    }
    
    @Override
    public void kindOfBed(){
    System.out.println("kamar A menggunakan single spring bed");
    }
    
    @Override
    public void price(){
    System.out.println("kamar A dikenakan biaya 150 ribu per malam");
    }
    
}
