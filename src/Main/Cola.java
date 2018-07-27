/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class Cola {


public final int maximo= 10;

public int[]V;
int inicio=0;
int ultimo=0;


public Cola(){
    
    
    
}

public boolean vacia(){
    
    if(inicio==ultimo){
        return true;
    }else
        return false;                
    }
    
public boolean llena(){
    
    if(ultimo==maximo){
        
        return true;
    }else
        return false;
    
}


public void encolar(int elemento){
    
    for (int i=0;i<=ultimo;i++){
        
        V[ultimo+1]=elemento;
    }
    
    
}

}
    

