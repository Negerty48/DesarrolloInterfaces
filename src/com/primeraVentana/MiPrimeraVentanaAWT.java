/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primeraVentana;

import java.awt.*;

/**
 *
 * @author tarde
 */
public class MiPrimeraVentanaAWT extends Frame{
    public MiPrimeraVentanaAWT() {
        super("Mi Primera Ventana");
        setSize(300,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MiPrimeraVentanaAWT ventana = new MiPrimeraVentanaAWT();
    }
}