/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author samue
 */
public class Personajes {
    private static int idCounter=0;
    private int id;
    private boolean activate;
    private int prioridad;
    private String nombre;
    private int contador;
    private int vida;
    private int fuerza;
    private int agilidad;
    private int habilidad;
    private Personajes siguiente;
    private Personajes anterior;

    public Personajes(int id, int prioridad, String nombre, int contador, int vida, int fuerza, int agilidad, int habilidad) {

        this.id = idCounter;
        idCounter++;
        this.activate = false;
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.contador = contador;
        this.vida = vida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.habilidad = habilidad;
        this.siguiente = null;
        this.anterior = null;

    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
    
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public Personajes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Personajes siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personajes getAnterior() {
        return anterior;
    }

    public void setAnterior(Personajes anterior) {
        this.anterior = anterior;
    }
    //==============================================================================================================================================================================

    //FUNCION PARA ELEGIR STATS DE MANERA ALEATORIA 
    public void AsignarStats() {

        Random rand = new Random();

        if (rand.nextDouble() < 0.7) {

            int hp = rand.nextInt(201) + 800;
            setVida(hp);
        } else {

            int hp = rand.nextInt(800) + 1;
            setVida(hp);

        }

        if (rand.nextDouble() < 0.6) {

            int skill = rand.nextInt(6) + 15;
            setHabilidad(skill);

        } else {

            int skill = rand.nextInt(13) + 1;
            setHabilidad(skill);

        }

        if (rand.nextDouble() < 0.5) {

            int strength = rand.nextInt(21) + 50;
            setFuerza(strength);

        } else {

            int strength = rand.nextInt(48) + 1;
            setFuerza(strength);
        }

        if (rand.nextDouble() < 0.4) {

            int agility = rand.nextInt(6) + 15;
            setAgilidad(agility);

        } else {

            int agility = rand.nextInt(13) + 1;
            setAgilidad(agility);

        }

    }

    // FUNCION PARA SELECCIONAR PRIORIDAD ==========================================================================================================================================================
    public void Asignar_Prioridad() {

        int hp = getVida();
        int strength = getFuerza();
        int skill = getHabilidad();
        int agility = getAgilidad();
        int contadorUR = 0;
        int contadorR = 0;
        int contadorN = 0;
//------------------------------------------ selecciono vida       
        if (hp >= 800) {

            contadorUR += 1;

        } else if (hp < 800 && hp >= 300) {

            contadorR += 1;

        } else {
            contadorN += 1;
        }
        //----------------------------------------  selecciono fuerza
        if (strength >= 50) {

            contadorUR += 1;

        } else if (strength < 50 && strength >= 20) {

            contadorR += 1;

        } else {

            contadorN += 1;

        }

//----------------------------------------- selecciono skill
        if (skill >= 15) {

            contadorUR += 1;

        } else if (skill <= 14 && skill >= 10) {

            contadorR += 1;

        } else {

            contadorN += 1;

        }

//----------------------------------------- seleccione agilidad
        if (agility >= 15) {

            contadorUR += 1;

        } else if (agility <= 14 && agility >= 10) {

            contadorR += 1;

        } else {

            contadorN += 1;

        }
//======================================= Asignacion de prioridades

        if (contadorUR >= 3) {

            setPrioridad(1);

        } else if (contadorR == 2  || contadorN==2 || contadorUR==2) {

            setPrioridad(2);

        } else if (contadorN >= 3) {

            setPrioridad(3);

        }
        
        System.out.println(contadorUR + "UR");
        System.out.println(contadorR + "R");
        System.out.println(contadorN + "N");
    }
    
    public String ListaNombreZ(){
        
    // CAMBIAR ESTO NO PUEDO USAR ARRAY LIST 
    
        String[] nombres = {"Link", "Ganondorf", "Zelda", "Sidon", "Riju", "Tureli", "Yunobo", "Rauru", "Zonai", "Chuchu", "Prunia", "Kolog"};
        
        //selecciono nombre al alzar
        
        Random rand = new Random();
        
        String nombre = nombres[rand.nextInt(nombres.length)];
        
    return nombre;
    }
    
    public String ListaNombreSF(){
        
    // CAMBIAR ESTO NO PUEDO USAR ARRAY LIST 
    
        String[] nombres = {"Ryu", "Akuma", "M.Bison", "Blanka", "Cammy", "Chun-Li", "Gouken", "Vega", "Viper", "Ken Masters"};
        
        //selecciono nombre al alzar
        
        Random rand = new Random();
        
        String nombreSF = nombres[rand.nextInt(nombres.length)];
        
    return nombreSF;
    }
    
    public void CrearPersonajeZ(){
    
        setId(this.id);
        setContador(0);
        setNombre(ListaNombreZ());
        AsignarStats();
        Asignar_Prioridad();
        
        
    
    
    }
    
    
    
    public void CrearPersonajeSF(){
    
        setId(this.id+100);
        setContador(0);
        setNombre(ListaNombreSF());
        AsignarStats();
        Asignar_Prioridad();
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
