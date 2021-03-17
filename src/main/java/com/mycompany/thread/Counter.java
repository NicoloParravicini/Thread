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
public class Counter {
    
    static int contatore = 0; //è static per creare una variabile condivisa.
    
    //Incrementa il contatore condiviso
    public void incrementa(){
        contatore++;
    }
    
    //Decrementa il contatore condiviso
    public void decrementa(){
        contatore--;
    }
    
    //Stampa il contatore condiviso
    public void stampaContatore(){
        System.out.println("contatore: " + contatore);
    }
    
}
