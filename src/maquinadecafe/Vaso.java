/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;

/**
 *
 * @author prisc
 */
class Vaso {
    int cantidadVasos;
    int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public boolean hasVasos(int cantidadVasos) {
        return cantidadVasos <= this.cantidadVasos;
    }

    public void giveVasos(int cantidadVasos) {
        this.cantidadVasos -= cantidadVasos;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }
    
    public void setCantidadVasos(int cantidadVasos){
    
        this.cantidadVasos = cantidadVasos;

        
    }
    public int getContenido(){
        return contenido;
        
    }
    public void setContenido(int contenido){
        this.contenido = contenido;
        
    }

    
}
