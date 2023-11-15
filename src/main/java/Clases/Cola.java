/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class Cola {
    
    private Personajes inicioCola;
    private Personajes finCola; 
    
    public Cola(){
    
        inicioCola=null;
        finCola=null; 
        
    }
    
    public boolean ColaVacia(){
    
        if (inicioCola == null){
        return true;
        }
        else{
        return false;
        }
    
    }
    
    public void encolar(int dato){
    
        Personajes nuevoNodo = new Personajes(dato);
        if (ColaVacia()){
            inicioCola = nuevoNodo;
            finCola = nuevoNodo;
        }
        else{
        
            finCola.setSiguiente(nuevoNodo);
            finCola=nuevoNodo; 
        
        }
    
        
    
    }
    
    public int desecolar(){
        
        if(!ColaVacia()){
        
            int dato = inicioCola.getDato() ;
            
            if (inicioCola == finCola ){
                inicioCola= null;
                finCola= null;
                
            }
            else{
                inicioCola = inicioCola.getSiguiente();
            }
            return dato;
            
            
        }
        else{
        return 0;
        }
        
    }
    
    public void imprimirCola(){
        
        Personajes temporal = inicioCola; 
        
        System.out.println("Cola:");
        
        while (temporal!=null){
            
            System.out.println(temporal.getDato() + " ");
            temporal =  temporal.getSiguiente();
        
        }
        System.out.println("");
    }
    
}
