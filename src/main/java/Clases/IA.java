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
public class IA extends Thread {

    private Semaphore sema1;
    private Semaphore sema2;
    private Semaphore sema3;
    private Personajes Z;
    private Personajes SF;
    private Admin admin;
    private String status = null;
    private boolean Zwinner = false;

    public IA(Semaphore sema1, Semaphore sema2, Semaphore sema3, Admin admin ) {
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

                sleep(getAdmin().getTiming() * 1000);

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

    public void Combat() {
        Random rand = new Random();
        double prob = rand.nextDouble();
        if (prob >= 0.0 && prob < 0.4) {
            setStatus("Win");
            boolean result = Versus();
            if (result) {
                setZwinner(true);
                System.out.println("Zelda gana");
            } else {
                setZwinner(false);
                System.out.println("SF gana");
            }
        } else if (prob >= 0.4 && prob < 0.67) {
            setStatus("Tie");
            System.out.println("Empate");
        } else {
            setStatus("Unable");
            System.out.println("Combate cancelado");
        }
        getAdmin().advertise();
    }

    //Aquí haz que retorne un valor, binario preferiblemente, si es uno significa que ganaron los de Zelda, y el otro significa ganó el de Street Fighter
    public Boolean Versus() {
            Random rand = new Random();
        // por ahora el while me restara puntos de vida con la fuerza del oponente hasta que lleguen a 0
        while (Z.getVida() >= 0 && SF.getVida() >= 0) {
            
            if(rand.nextDouble()<0.1){            
                
             //Turno zelda
            int Z_vs_SF = Z.getVida() - SF.getFuerza()-20;
            Z.setVida(Z_vs_SF);
            System.out.println("CRITICAL PARA:" + SF.getNombre());
            System.out.println("Vida de Zelda: ");
            System.out.println(Z.getVida());}
            
            else{    
                
            int Z_vs_SF = Z.getVida() - SF.getFuerza();
            Z.setVida(Z_vs_SF);
            System.out.println("Vida de Zelda: ");
            System.out.println(Z.getVida());
            }
            
            //turno sf
            
            if(rand.nextDouble()<0.1){
                
            int SF_vs_Z = SF.getVida() - Z.getFuerza()-20;
            System.out.println("CRITICAL PARA:"+SF.getNombre());
            System.out.println("Vida de SF: ");
            SF.setVida(SF_vs_Z);
            System.out.println(SF.getVida());}
            else{
            int SF_vs_Z = SF.getVida() - Z.getFuerza();
            System.out.println("Vida de SF: ");
            SF.setVida(SF_vs_Z);
            System.out.println(SF.getVida());
            }
            
            //tuno zelda
            
            if(rand.nextDouble()<0.3){
               int recupera =Z.getVida()+15 ;
               Z.setVida(recupera);
                System.out.println(Z.getNombre()+ " "+"Se ha curado");
            }else{
               int sangra =Z.getVida()-4 ;
               Z.setVida(sangra);
                System.out.println(Z.getNombre()+ " "+"Herido");
            
            }
            
            //Turno sf
            
            if(rand.nextDouble()<0.3){
            int recupera =SF.getVida()+15 ;
            SF.setVida(recupera);
            System.out.println(SF.getNombre()+ " "+"Se ha curado");
            }else{
            
             int sangra =SF.getVida()-4 ;
             Z.setVida(sangra);
             System.out.println(SF.getNombre()+ " "+"Herido");
            }
            
            //turno zelda
            
            if(rand.nextDouble()<0.5){
                
                int dañoskill = 25;
                int vidaSF=SF.getVida();
                
                if (SF.getAgilidad()<Z.getAgilidad()){
                    if (rand.nextDouble()<0.1){SF.setVida(vidaSF-dañoskill-100);}
                    else{SF.setVida(vidaSF-dañoskill);}
                    
                    
                }
                else{
                    System.out.println("Fue esquivado");
                }
            
            }
            
            //turno SF
            
                if(rand.nextDouble()<0.5){
                
                int dañoskill = 25;
                int vidaZ=Z.getVida();
                
                if (SF.getAgilidad()>Z.getAgilidad()){
                    if (rand.nextDouble()<0.1){Z.setVida(vidaZ-dañoskill-100);}
                    else{SF.setVida(vidaZ-dañoskill);}
                    
                    
                }
                else{
                    System.out.println("Fue esquivado");
                }
            
            }
            
            
            
            
            
            
            

        }
        
        
        if (SF.getVida() <= 0) {
            return true;
        } else {
            return false;
        }

    }

}
