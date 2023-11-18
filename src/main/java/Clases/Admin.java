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
}
