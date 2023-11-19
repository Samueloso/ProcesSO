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
public class IA extends Thread{
    
    private Semaphore sema1;
    private Semaphore sema2;
    private Semaphore sema3;
    private Personajes Z;
    private Personajes SF;
    private Admin admin;
    private String status = null;
    private boolean Zwinner = false;
    
    public IA(Semaphore sema1, Semaphore sema2, Semaphore sema3, Admin admin) {
        this.sema1 = sema1;
        this.sema2 = sema2;
        this.sema3 = sema3;
        this.Z = null;
        this.SF = null;
        this.admin = admin;
        
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

    public Personajes getZ() {
        return Z;
    }

    public void setZ(Personajes Z) {
        this.Z = Z;
    }

    public Personajes getSF() {
        return SF;
    }

    public void setSF(Personajes SF) {
        this.SF = SF;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isZwinner() {
        return Zwinner;
    }

    public void setZwinner(boolean Zwinner) {
        this.Zwinner = Zwinner;
    }
    
    @Override
    public void run() {
        while (true) {
            try {

                Work();

                sleep(getAdmin().getTiming()*1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void Work() {
        try {
            getSema2().acquire(1);
            getSema1().acquire(1);
            Combat();
            getSema1().release();
            getSema3().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Combat(){
        Random rand = new Random();
        double prob = rand.nextDouble();
        if (prob >= 0.0 && prob < 0.4) {
            setStatus("Win");
            Versus();
            if (true){
                setZwinner(true);
            }else{
                setZwinner(false);
            }
        } else if(prob >= 0.4 && prob < 0.67){
            setStatus("Tie");
        }else{
            setStatus("Unable");
        }
        getAdmin().advertise();
    }
    
    //Aquí haz que retorne un valor, binario preferiblemente, si es uno significa que ganaron los de Zelda, y el otro significa ganó el de Street Fighter
    public Boolean Versus(){
    
        // por ahora el while me restara puntos de vida con la fuerza del oponente hasta que lleguen a 0
         while (Z.getVida()!=0 || SF.getVida()!=0){
             
             int Z_vs_SF = Z.getVida()-SF.getFuerza();
             Z.setVida(Z_vs_SF);
             int SF_vs_Z = SF.getVida() - Z.getFuerza();
             SF.setVida(SF_vs_Z);
             
             
         
         }
         
         if(SF.getVida()==0){
            return true;
         }
         else{
            return false;
         }
        
        
    }
    

    
    
}
