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
    
        return inicioCola == null;
    
    }
    
    public void encolar(int id,int prioridad, String nombre, int contador, int hp, int fuerza, int agilidad, int skill){
    
        Personajes nuevoNodo = new Personajes(id, prioridad, nombre ,contador, hp, fuerza, agilidad, skill);
        if (ColaVacia()){
            inicioCola = nuevoNodo;
            finCola = nuevoNodo;
        }
        else{
        
            finCola.setSiguiente(nuevoNodo);
            finCola=nuevoNodo; 
        
        }
    
        
    
    }
    
    public int desencolar(){
        
        if(!ColaVacia()){
        
            int id = inicioCola.getID() ;
            
            if (inicioCola == finCola ){
                inicioCola= null;
                finCola= null;
                
            }
            else{
                inicioCola = inicioCola.getSiguiente();
            }
            return id;
            
            
        }
        else{
        return 0;
        }
        
    }
    
    public void imprimirCola(){
        
        Personajes temporal = inicioCola; 
        
        System.out.println("Cola:");
        
        while (temporal!=null){
            
            System.out.println(temporal.getID() + " ");
            temporal =  temporal.getSiguiente();
        
        }
        System.out.println("");
    }
    
}
