/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;


class Cafetera {

    int cantidadCafe;
    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;

    }

    public boolean hasCafe(int cantidadCafe) {
        return cantidadCafe <= this.cantidadCafe;
    }

    public void giveCafe(int cantidadCafe) {
        this.cantidadCafe -=cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
        
    }
    
    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
    
}
