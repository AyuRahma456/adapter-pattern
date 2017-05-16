/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infokmr;

/**
 *
 * @author Pc
 */
public class kamarB implements kamar {
    
   
     
    @Override
    public void haveAc(){
    System.out.println("kamar B menggunakan ac ukuran besar");
    }
    
    @Override
    public void kindOfBed(){
    System.out.println("kamar B menggunakan double spring bed");
    }
    
    @Override
    public void price(){
    System.out.println("kamar B dikenakan biaya 250 ribu per malam");
    }
}
