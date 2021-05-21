/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class suma {
    
    
   private int nu1;    
    private int nu2;
    private double c;

    public suma(int nu1, int nu2, double c) {
        this.nu1 = 0;
        this.nu2 = 0;
        this.c = 0;
    }

    public suma() {
    }

    public int getNu1() {
        return nu1;
    }

    public void setNu1(int nu1) {
        this.nu1 = nu1;
    }

    public int getNu2() {
        return nu2;
    }

    public void setNu2(int nu2) {
        this.nu2 = nu2;
    }


    public double guardar(int a){
        this.nu1=a;

        c+=nu1;
return c;
        
    }
    public double Sumar(){
        
        return c;
        
    }
}