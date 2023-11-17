/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author samue
 */
public class Personajes {
    
    private int id;
    private int prioridad;
    private String nombre;
    private int contador;
    private int hp;
    private int fuerza;
    private int agilidad;
    private int skill;
    private Personajes siguiente; 
    
    
    public Personajes (int id,int prioridad, String nombre, int contador, int hp, int fuerza, int agilidad, int skill){
    
        this.id=id;
        this.prioridad=prioridad;
        this.nombre=nombre;
        this.contador=contador;
        this.hp=hp;
        this.fuerza=fuerza;
        this.agilidad=agilidad;
        this.skill=skill;
        this.siguiente=null;
        
    }
    
    public int getID(){
        return id;
    }
   public int getPrioridad(){
       return prioridad;
   }
   public void setPrioridad(int prioridad){
       this.prioridad=prioridad;
   }
   public int getContador(){
       return contador;
   }
   public void setContador(int contador){
       this.contador=contador;
   }
   public int getHP(){
       return hp;
   }
   public void setHP(int hp){
       this.hp=hp;
   }
   public int getFuerza(){
       return fuerza;
   }
   public void setFuerza(int fuerza){
       this.fuerza=fuerza;
   }
   public int getAgilidad(){
       return agilidad;
   }
   public void setAgilidad(int agilidad){
       this.agilidad=agilidad;
   }
   public int getSkill(){
       return skill;
   }
   public void setSkill(int skill){
       this.skill=skill;
   }
   
   //==============================================================================================================================================================================
   
   //FUNCION PARA ELEGIR STATS DE MANERA ALEATORIA 
   
   public void AsignarStats(){
   
       Random rand = new Random();
       
       if (rand.nextDouble()<0.7){
           
           int hp = rand.nextInt(201)+800;
           setHP(hp);
       }
       
       else{
       
           int hp = rand.nextInt(800)+1;
           setHP(hp);
       
       }
       
       if (rand.nextDouble()<0.6){
           
           int skill = rand.nextInt(6)+15;
           setSkill(skill);
       
       
       }else{
           
           int skill = rand.nextInt(13)+1;
           setSkill(skill);
       
       }
       
       if(rand.nextDouble()<0.5){
           
           int fuerza = rand.nextInt(21)+50;
           setFuerza(fuerza);
       
       }else{
           
           int fuerza = rand.nextInt(48)+1;
       
       }
       
       if(rand.nextDouble()<0.4){
       
           int agilidad = rand.nextInt(6)+15;
           setAgilidad(agilidad);
           
           
       }else{
           
           int agilidad = rand.nextInt(13)+1;
           setAgilidad(agilidad);
           
       }
     
   }
   
   // FUNCION PARA SELECCIONAR PRIORIDAD ==========================================================================================================================================================
   
   public void Asignar_Prioridad(){
       
       int vida=getHP();
       int fuerza=getFuerza();
       int skill=getSkill();
       int agilidad=getAgilidad();
       int contadorUR=0;
       int contadorR=0;
       int contadorN=0;
//------------------------------------------ selecciono vida       
       if (vida>=800){
           
           contadorUR+=1;
       
       }else if(vida < 800 && vida >= 300){
           
           contadorR+=1;
           
       }
       else{
           contadorN+=1;
       }
 //----------------------------------------  selecciono fuerza
       if (fuerza>=50){
           
           contadorUR+=1;
       
       }else if(fuerza<50 && fuerza >=20){
           
           contadorR+=1;
       
       }else{
           
           contadorN+=1;
       
       }
       
//----------------------------------------- selecciono skill

    if (skill>=15){
        
        contadorUR+=1;
    
    }else if(skill<=14 && skill>=10 ){
        
        contadorR+=1;
    
    }else{
        
        contadorN+=1;
    
    }
    
//----------------------------------------- seleccione agilidad

    if(agilidad>=15){
        
        contadorUR+=1;
        
    }else if(skill<=14 && skill>=10){
        
        contadorR+=1;
    
    }else{
        
        contadorN+=1;
        
    }
//======================================= Asignacion de prioridades

    if (contadorUR>=3){
        
        setPrioridad(1);
        
    }else if(contadorR==2) {
        
        setPrioridad(2);
        
    }else if(contadorN>=3) {
        
        setPrioridad(3);
        
    }
   }
   
   
   
   
    public Personajes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Personajes siguiente) {
        this.siguiente = siguiente;
    }
    
}
