/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electricaladapter;

/**
 *
 * @author ahmad
 */
public class EroupeAdapter implements EUplug{

    private USplug plug;

    public EroupeAdapter(USplug plug) {
        this.plug = plug;
    }
    
    
    @Override
    public void givePower() {
        plug.power();
    }

  

    
}
