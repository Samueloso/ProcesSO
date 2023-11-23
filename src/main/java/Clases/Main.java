/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

/**
 *
 * @author samue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personajes pj=new Personajes(0,0,"",0,0,0,0,0);
        Personajes pj1=new Personajes(0,0,"",0,0,0,0,0);
        pj.CrearPersonajeZ();
    
        pj1.CrearPersonajeZ();
        Cola cola = new Cola();
        cola.encolar(pj);
        cola.encolar(pj);
        cola.encolar(pj1);

  
        //cola.desencolar_cabeza();
        cola.imprimirCola();
        
        
    }
    
}
