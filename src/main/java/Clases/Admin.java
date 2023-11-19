
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Radenixlol
 */
public class Admin extends Thread {

    private Semaphore sema1;
    private Semaphore sema2;
    private Semaphore sema3;
    private Cola Zcola1;
    private Cola Zcola2;
    private Cola Zcola3;
    private Cola Zcolar;
    private Cola SFcola1;
    private Cola SFcola2;
    private Cola SFcola3;
    private Cola SFcolar;
    private Cola winners;
    private Personajes[] Zelda;
    private Personajes[] StreetFighter;
    private IA Simulador;
    private int timing;
    private int ciclos;
    private int pointsZ;
    private int pointsSF;

    public Admin() {
        this.sema1 = new Semaphore(1);
        this.sema2 = new Semaphore(0);
        this.sema3 = new Semaphore(1);
        this.Zcola1 = new Cola();
        this.Zcola2 = new Cola();
        this.Zcola3 = new Cola();
        this.Zcolar = new Cola();
        this.SFcola1 = new Cola();
        this.SFcola2 = new Cola();
        this.SFcola3 = new Cola();
        this.SFcolar = new Cola();
        this.winners = new Cola();
        this.Zelda = new Personajes[10];
        this.StreetFighter = new Personajes[10];
        this.Simulador = new IA(this.sema1, this.sema2, this.sema3, this);
        this.timing = 10;
        this.ciclos = 0;
        this.pointsZ = 0;
        this.pointsSF = 0;
    }

    public Semaphore getSema1() {
        return sema1;
    }

    public void setSema1(Semaphore sema1) {
        this.sema1 = sema1;
    }

    public Semaphore getSema2() {
        return sema2;
    }

    public void setSema2(Semaphore sema2) {
        this.sema2 = sema2;
    }

    public Semaphore getSema3() {
        return sema3;
    }

    public void setSema3(Semaphore sema3) {
        this.sema3 = sema3;
    }

    public Cola getZcola1() {
        return Zcola1;
    }

    public void setZcola1(Cola Zcola1) {
        this.Zcola1 = Zcola1;
    }

    public Cola getZcola2() {
        return Zcola2;
    }

    public void setZcola2(Cola Zcola2) {
        this.Zcola2 = Zcola2;
    }

    public Cola getZcola3() {
        return Zcola3;
    }

    public void setZcola3(Cola Zcola3) {
        this.Zcola3 = Zcola3;
    }

    public Cola getZcolar() {
        return Zcolar;
    }

    public void setZcolar(Cola Zcolar) {
        this.Zcolar = Zcolar;
    }

    public Cola getSFcola1() {
        return SFcola1;
    }

    public void setSFcola1(Cola SFcola1) {
        this.SFcola1 = SFcola1;
    }

    public Cola getSFcola2() {
        return SFcola2;
    }

    public void setSFcola2(Cola SFcola2) {
        this.SFcola2 = SFcola2;
    }

    public Cola getSFcola3() {
        return SFcola3;
    }

    public void setSFcola3(Cola SFcola3) {
        this.SFcola3 = SFcola3;
    }

    public Cola getSFcolar() {
        return SFcolar;
    }

    public void setSFcolar(Cola SFcolar) {
        this.SFcolar = SFcolar;
    }

    public Personajes[] getZelda() {
        return Zelda;
    }

    public void setZelda(Personajes[] Zelda) {
        this.Zelda = Zelda;
    }

    public Personajes[] getStreetFighter() {
        return StreetFighter;
    }

    public void setStreetFighter(Personajes[] StreetFighter) {
        this.StreetFighter = StreetFighter;
    }

    public IA getSimulador() {
        return Simulador;
    }

    public void setSimulador(IA Simulador) {
        this.Simulador = Simulador;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public Cola getWinners() {
        return winners;
    }

    public void setWinners(Cola winners) {
        this.winners = winners;
    }

    public int getPointsZ() {
        return pointsZ;
    }

    public void setPointsZ(int pointsZ) {
        this.pointsZ = pointsZ;
    }

    public int getPointsSF() {
        return pointsSF;
    }

    public void setPointsSF(int pointsSF) {
        this.pointsSF = pointsSF;
    }
    

    public void init() {
        
    }

    @Override
    public void run() {
        init();
        while (true) {
            try {

                Work();

                sleep(getTiming() * 1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void Work() {
        try {
            Check();
            getSema3().acquire(1);
            getSema1().acquire(1);
            Select();
            getSema1().release();
            getSema2().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Select() {
        Random rand = new Random();
        if (rand.nextDouble() <= 0.8) {
//            boolean foundZ = false;
//            boolean foundSF = false;
//            int i = 0;
//            while (!foundZ && !foundSF) {
//                if (!foundZ) {
//                    Personajes temp = Zelda[i];
//                    if (!temp.isActivate()) {
//                        SelectCola(temp, true);
//                        foundZ = true;
//                    }
//                }
//                if (!foundSF) {
//                    Personajes temp = StreetFighter[i];
//                    if (!temp.isActivate()) {
//                        SelectCola(temp, false);
//                        foundSF = true;
//                    }
//                }
//                i++;
//                if (i >= 10) {
//                    foundZ = true;
//                    foundSF = true;
//                }
//            }
        }
        switch (1) {
            case 1: {
                if (!Zcola1.ColaVacia()) {
                    Personajes temp = getZcola1().getInicioCola();
                    getZcola1().desencolar_cabeza();
                    //Función de añadir a la casilla Zelda
                    break;
                }
            }
            case 2: {
                if (!Zcola2.ColaVacia()) {
                    Personajes temp = getZcola2().getInicioCola();
                    getZcola2().desencolar_cabeza();
                    //Función de añadir a la casilla Zelda
                    break;
                }
            }
            case 3: {
                if (!Zcola3.ColaVacia()) {
                    Personajes temp = getZcola3().getInicioCola();
                    getZcola3().desencolar_cabeza();
                    //Función de añadir a la casilla Zelda
                    break;
                }
            }
            default: {
                System.out.println("No hay personajes en cola");
            }
        }

        switch (1) {
            case 1: {
                if (!SFcola1.ColaVacia()) {
                    Personajes temp = getSFcola1().getInicioCola();
                    getSFcola1().desencolar_cabeza();
                    //Función de añadir a la casilla Street Fighter
                    break;
                }
            }
            case 2: {
                if (!SFcola2.ColaVacia()) {
                    Personajes temp = getSFcola2().getInicioCola();
                    getSFcola2().desencolar_cabeza();
                    //Función de añadir a la casilla Street Fighter
                    break;
                }
            }
            case 3: {
                if (!SFcola3.ColaVacia()) {
                    Personajes temp = getSFcola3().getInicioCola();
                    getSFcola3().desencolar_cabeza();
                    //Función de añadir a la casilla Street Fighter
                    break;
                }
            }
            default: {
                System.out.println("No hay personajes en cola");
            }
        }
    }

    public void Check() {
        Random rand = new Random();
        double prob = rand.nextDouble();
        if (!Zcolar.ColaVacia() && prob <= 0.4) {
            Personajes temp = getZcolar().getInicioCola();
            getZcolar().desencolar_cabeza();
            getZcola1().encolar(temp);
        }
        if (!SFcolar.ColaVacia() && prob <= 0.4) {
            Personajes temp = getSFcolar().getInicioCola();
            getSFcolar().desencolar_cabeza();
            getSFcola1().encolar(temp);
        }
        if (!Zcola2.ColaVacia()) {
            Personajes temp = getZcola2().getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    getZcola2().desencolar(temp1);
                    getZcola1().encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!Zcola3.ColaVacia()) {
            Personajes temp = getZcola3().getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    getZcola3().desencolar(temp1);
                    getZcola2().encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!SFcola2.ColaVacia()) {
            Personajes temp = getSFcola2().getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    getSFcola2().desencolar(temp1);
                    getSFcola1().encolar(temp1);
                } else {
                    count++;
                    temp.setContador(count);
                    temp = temp.getSiguiente();
                }
            }
        }
        if (!SFcola3.ColaVacia()) {
            Personajes temp = getSFcola3().getInicioCola();
            while (temp != null) {
                int count = temp.getContador();
                if (count >= 8) {
                    Personajes temp1 = temp;
                    temp = temp.getSiguiente();
                    getSFcola3().desencolar(temp1);
                    getSFcola2().encolar(temp1);
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
                    getZcola1().encolar(pj);
                case 2 ->
                    getZcola2().encolar(pj);
                case 3 ->
                    getZcola3().encolar(pj);
            }
        } else {
            switch (priori) {
                case 1 ->
                    getSFcola1().encolar(pj);
                case 2 ->
                    getSFcola2().encolar(pj);
                case 3 ->
                    getSFcola3().encolar(pj);
            }
        }
    }

    public void advertise() {
        String value = Simulador.getStatus();
        if (value == "Win") {
            boolean win = Simulador.isZwinner();
            if (win) {
                getWinners().encolar(Simulador.getZ());
                Simulador.setZ(null);
                Simulador.setSF(null);
                setPointsZ(getPointsZ() + 1);
                
            } else {
                getWinners().encolar(Simulador.getSF());
                Simulador.setZ(null);
                Simulador.setSF(null);
                setPointsSF(getPointsSF() + 1);
            }
        } else if (value == "Tie") {
            Zcola1.encolar(Simulador.getZ());
            SFcola1.encolar(Simulador.getSF());
            Simulador.setZ(null);
            Simulador.setSF(null);
        } else if (value == "Unable") {
            Zcolar.encolar(Simulador.getZ());
            SFcolar.encolar(Simulador.getSF());
            Simulador.setZ(null);
            Simulador.setSF(null);
        }
    }

}
