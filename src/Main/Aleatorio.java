/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;


public abstract class Aleatorio {
    private final Random Random;
    
    public Aleatorio(){
         Random = new Random();
    }  
    
    int generarAleatorio(int inicio, int limite){ 
        if(limite == 0) return 0;
        return (int)(Random.nextDouble()*limite+inicio);
    }

}
