/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electricaladapter;

/**
 *
 * @author ahmad
 */
public class DriverClass {
    
    public static void main(String[] args) {
        USplug USplug = new US120plug();
        EUoutlet eSocket = new EUoutlet();
        EUplug eplug = new EroupeAdapter(USplug);
        
        eSocket.plugIN(eplug);
    }
                
}
