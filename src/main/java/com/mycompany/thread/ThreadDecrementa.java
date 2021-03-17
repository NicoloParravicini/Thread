/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread;

/**
 *
 * @author informatica
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDecrementa implements Runnable{
    
    Counter contatore = new Counter();
    
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            contatore.decrementa();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
