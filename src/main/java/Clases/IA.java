/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Radenixlol
 */
public class IA {
    
    private Semaphore sema1;
    private Semaphore sema2;
    private Semaphore sema3;
    private Personajes Z;
    private Personajes SF;
    
    public IA(Semaphore sema1, Semaphore sema2, Semaphore sema3) {
        this.sema1 = sema1;
        this.sema2 = sema2;
        this.sema3 = sema3;
        this.Z = null;
        this.SF = null;
    }
    
}
