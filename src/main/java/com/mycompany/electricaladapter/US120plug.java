/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electricaladapter;

/**
 *
 * @author ahmad
 */
public class US120plug implements USplug {

    @Override
    public void power() {
        System.out.println("this is the 220v plug");
    }
    
}
