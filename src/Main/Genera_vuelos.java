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
public class Genera_vuelos extends Aleatorio implements Estadistica_avion{
    
    final int vuelo_despegues = 10; //5 segundos cada vuelo
          
    final int cant_pasj= 200;
    final int cant_vuelos_r=3;
    
    int cantidad_despegues;
    int cantidad_pasajeros;
    
    //Estadisticas_despegues ed = new Estadisticas_despegues();
    
    int tiempo;

    public Genera_vuelos() {
        
    }
    
    public void retornatiempo(String seg){
        
        tiempo=Integer.parseInt(seg);
        System.out.println(tiempo);
        
    }
    
    public int calcula_cant_vuelos(){
        
        if (tiempo>20){
            
            cantidad_despegues=generarAleatorio(5, vuelo_despegues);
            return cantidad_despegues;
            
        }else{
        cantidad_despegues=generarAleatorio(1, 4);
        return cantidad_despegues;
        }
        
    }
    
    public int calcula_pasajeros(){
        
        if(tiempo>20 && cantidad_despegues>5){
            
            return generarAleatorio(90,cant_pasj);
            
        }else{
            
            return generarAleatorio(30,80);
        
        }
        
        
    }
    
    public int calcula_vuelos_r(){
        
        return generarAleatorio(0,cant_vuelos_r);
        
    }
    
    
    
    /*
    
    public int calcula_cant_vuelos(){
        
        if (getTiempo_despegue()>10){
            
            cantidad_despegues=getTiempo_despegue()/vuelo_despegues;
            return cantidad_despegues;
        }else 
            
            return cantidad_despegues=vuelo_despegues;
        
    }

*/
}
