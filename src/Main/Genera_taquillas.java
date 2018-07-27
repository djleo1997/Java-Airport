/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Leo Family
 */
public class Genera_taquillas extends Aleatorio {
    
    private int tiempo;
    
    int Boletos_vendidos;
    int credito;
    int debito;
    int efectivo;
    int web;
    
    
    
    public void retornatiempo(String seg){
        
        tiempo=Integer.parseInt(seg);
        System.out.println(tiempo);
        
    }
    
    public int calcula_boletos(){
        
        /*
        if(tiempo <5){
            
        Boletos_vendidos = generarAleatorio(1,20);
        
        return Boletos_vendidos;
            
        }
        */
        
        if(tiempo>20){
            
            Boletos_vendidos = generarAleatorio(60,100);
        
            return Boletos_vendidos;
        }
        
            
         else
            Boletos_vendidos = generarAleatorio(20,60);
        
        return Boletos_vendidos;
            
        
        
        
        
    }
    
    // debito = 0.3
    //efectivo = 0.1
    //web = 0.2
    //credito =0.4
    
    public int calcula_debito(){
        
        return (int)(Boletos_vendidos*0.3);
    }
    
     public int calcula_credito(){
        
        return (int)(Boletos_vendidos*0.4);
    }
     
      public int calcula_web(){
        
        return (int)(Boletos_vendidos*0.2);
        
    }
      
       public int calcula_efectivo(){
        
        return (int)(Boletos_vendidos*0.1);
    }
       
       
       
       
        public int conviasa_atendidos(){
        
            return ((int)(Boletos_vendidos*0.4)+4);
        }
        
    
        public int aeropostal_atendidos(){
        
        return ((int)(Boletos_vendidos*0.3))+6;
        }
    
        public int acerca_atendidos(){
        return ((int)(Boletos_vendidos*0.3))+3;
        
        }
       
        
   
}
