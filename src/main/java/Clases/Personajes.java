/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class Personajes {
    
    private int dato;
    private Personajes siguiente; 
    
    
    public Personajes (int dato){
    
        this.dato=dato;
        this.siguiente=null;
        
    }
    
    public int getDato(){
        return dato;
    }
   
    public Personajes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Personajes siguiente) {
        this.siguiente = siguiente;
    }
    
}
