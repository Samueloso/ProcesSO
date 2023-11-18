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

    public Cola() {

        this.inicioCola = null;
        this.finCola = null;

    }
    
    public Personajes getInicioCola() {
        return inicioCola;
    }

    public void setInicioCola(Personajes inicioCola) {
        this.inicioCola = inicioCola;
    }

    public Personajes getFinCola() {
        return finCola;
    }

    public void setFinCola(Personajes finCola) {
        this.finCola = finCola;
    }

    public boolean ColaVacia() {

        return getInicioCola() == null;

    }

    public void encolar(Personajes pj) {

        if (ColaVacia()) {
            setInicioCola(pj);
            setFinCola(pj);
            pj.setAnterior(null);
            pj.setSiguiente(null);
        } else {
            getFinCola().setSiguiente(pj);
            Personajes temp = getFinCola();
            pj.setAnterior(temp);
            pj.setSiguiente(null);
            setFinCola(pj);
        }

    }

    public void desencolar_cabeza() {

        if (!ColaVacia()) {

            if (getInicioCola() == getFinCola()) {
                setInicioCola(null);
                setFinCola(null);

            } else {
                setInicioCola(getInicioCola().getSiguiente());
                getInicioCola().setAnterior(null);
            }

        } else {

        }

    }
    
    public void desencolar(Personajes pj) {

        if (!ColaVacia()) {

            if (getInicioCola() == getFinCola()) {
                setInicioCola(null);
                setFinCola(null);
            } else if (pj == getInicioCola()){
                setInicioCola(pj.getSiguiente());
                getInicioCola().setAnterior(null);
            } else if(pj == getFinCola()){
                setFinCola(pj.getAnterior());
                getFinCola().setSiguiente(null);
            } else {
                Personajes temp1 = pj.getAnterior();
                Personajes temp2 =pj.getSiguiente();
                temp1.setSiguiente(temp2);
                temp2.setAnterior(temp1);
            }

        } else {

        }

    }

    public void imprimirCola() {

        Personajes temporal = getInicioCola();

        System.out.println("Cola:");

        while (temporal != null) {

            System.out.println(temporal.getId()+ " "+ temporal.getPrioridad() + " "+temporal.getNombre()+" "+temporal.getVida()+" "+temporal.getFuerza()+" "+temporal.getAgilidad()+" "+ temporal.getHabilidad());
            temporal = temporal.getSiguiente();

        }
        System.out.println("");
    }

}
