/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infokmr;

/**
 *
 * @author Pc
 */
public class adapter implements kamar {
    kamarTambahan kt;
    
    public adapter(kamarTambahan kt){
    this.kt=kt;
    }
    
    
    @Override
    public void haveAc() {
    kt.kipasAngin();
    }
    
    @Override
    public void kindOfBed() {
    kt.jenisKasur();
    }
    
    @Override
    public void price() {
    kt.harga();
    }
}
