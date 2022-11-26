/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;


class Azucarero {
   int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasAzucar(int cantidadAzucar) {
        return cantidadAzucar <= this.cantidadAzucar;
    }

    public void giveAzucar(int cantidadAzucar) {
        this.cantidadAzucar -= cantidadAzucar;

    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }
    
    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
          
          
    }
    
}
