/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infokmr;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class InfoKmr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scaner;
      Scanner input= new Scanner(System.in);
        
        String pilih = "";          
   
      do{
        int pilihan=menu();
        
        if(pilihan==1){
            kamar_a();        
        }else if(pilihan==2)
            {
                kamar_b();
            }else if(pilihan==3)
                {
                 tambahan_a();
                }else 
                    {
                    System.out.println("pilih yang anda masukkan salah! ");
                    }
                
        System.out.print("\nApakah anda ingin mengetahui info kamar lainnya?(y/n) :  ");
        pilih=input.next();
        System.out.println("------------------------------------------------------");
      }while("y".equals(pilih));
        
        
        
    }
    
    static int menu(){
        Scanner scaner;
        Scanner input= new Scanner(System.in);    
    
       
        System.out.println("Daftar kamar :");
        System.out.println("1. Kamar A");
        System.out.println("2. Kamar B");
        System.out.println("3. Kamar tambahan A");
        
        System.out.print("pilih kamar : ");
        int pilihan=input.nextInt();
        System.out.println("--------------------------------------------");
        return pilihan;
    }
    
    static void kamar_a(){
        kamarA kmr=new kamarA();
        detail(kmr);
    }
    
     static void kamar_b(){
        kamarB kmrB=new kamarB();
        detail(kmrB);
    }
     
   static void tambahan_a(){
        tambahanA tbhA=new tambahanA();
        kamar adapter= new adapter(tbhA);
        detail(adapter);
   }
    
    
static void detail(kamar Kamar) {
Kamar.haveAc();
Kamar.kindOfBed();
Kamar.price();
}
}
