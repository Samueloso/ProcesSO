
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author Radenixlol
 */
public class Admin extends Thread {

    private Cola Zcola1;
    private Cola Zcola2;
    private Cola Zcola3;
    private Cola Zcolar;
    private Cola SFcola1;
    private Cola SFcola2;
    private Cola SFcola3;
    private Cola SFcolar;
    private Personajes[] Zelda;
    private Personajes[] StreetFighter;
    private IA Simulador;
    private int timing;
    private int ciclos;

    public Admin() {
        this.Zcola1 = new Cola();
        this.Zcola2 = new Cola();
        this.Zcola3 = new Cola();
        this.Zcolar = new Cola();
        this.SFcola1 = new Cola();
        this.SFcola2 = new Cola();
        this.SFcola3 = new Cola();
        this.SFcolar = new Cola();
        this.Zelda = new Personajes[10];
        this.StreetFighter = new Personajes[10];
        this.Simulador = new IA();
        this.timing = 10;
        this.ciclos = 0;
    }

    public void Select() {
        Random rand = new Random();
        if (rand.nextDouble() <= 0.8) {
            boolean foundZ = false;
            boolean foundSF = false;
            int i = 0;
            while (!foundZ && !foundSF) {
                if (!foundZ) {
                    Personajes temp = Zelda[i];
                    if (!temp.isActivate()) {
                        SelectCola(temp, true);
                        foundZ = true;
                    }
                }
                if (!foundSF) {
                    Personajes temp = StreetFighter[i];
                    if (!temp.isActivate()) {
                        SelectCola(temp, false);
                        foundSF = true;
                    }
                }
                i++;
                if (i >= 10) {
                    foundZ = true;
                    foundSF = true;
                }
            }
        }
        boolean Zready = false;
        boolean SFready = false;
        while(!Zready){
            
        }
        while(!SFready){
            
        }
    }

    public void Check() {
        Random rand = new Random();
        if (!Zcolar.ColaVacia() && rand.nextDouble() <= 0.4) {
            Personajes temp = Zcolar.getInicioCola();
            Zcolar.desencolar_cabeza();
            Zcola1.encolar(temp);
        }
        if (!SFcolar.ColaVacia() && rand.nextDouble() <= 0.4) {
            Personajes temp = SFcolar.getInicioCola();
            SFcolar.desencolar_cabeza();
            SFcola1.encolar(temp);
        }
        if (!Zcola2.ColaVacia()) {
            Personajes temp = Zcola2.getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    Zcola2.desencolar(temp1);
                    Zcola1.encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!Zcola3.ColaVacia()) {
            Personajes temp = Zcola3.getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    Zcola3.desencolar(temp1);
                    Zcola2.encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!SFcola2.ColaVacia()) {
            Personajes temp = SFcola2.getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    SFcola2.desencolar(temp1);
                    SFcola1.encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!SFcola3.ColaVacia()) {
            Personajes temp = SFcola3.getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    SFcola3.desencolar(temp1);
                    SFcola2.encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
    }

    public void SelectCola(Personajes pj, boolean n) {
        int priori = pj.getPrioridad();
        if (n) {
            switch (priori) {
                case 1 ->
                    Zcola1.encolar(pj);
                case 2 ->
                    Zcola2.encolar(pj);
                case 3 ->
                    Zcola3.encolar(pj);
            }
        } else {
            switch (priori) {
                case 1 ->
                    SFcola1.encolar(pj);
                case 2 ->
                    SFcola2.encolar(pj);
                case 3 ->
                    SFcola3.encolar(pj);
            }
        }
    }
}
