/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class Pila {
    private int P[];
    private int Indice;
    
    public Pila(int v){
        P=new int[v];
        Indice=-1;
    }
    
    public boolean INSERTAR(int v){
        if(Indice==(P.length-1)){
            return false;
        }
        Indice++;
        P[Indice]=v;
        return true;
    }
    
    public boolean ELIMINAR(){
        if(Indice==-1){
            return false;
        }
        Indice--;
        return false;
    }       
}
