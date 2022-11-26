/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class TestAzuquero {
        Azucarero azucarero;

    @Before
    public void setUp() {
        azucarero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteCantidadDeAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(5);

        assertEquals(true, resultado);

        resultado =  azucarero.hasAzucar(10);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoHaySuficienteCantidadDeAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(15);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero() {
        azucarero.giveAzucar(5);

        assertEquals(5, azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);

        assertEquals(3, azucarero.getCantidadAzucar());
    }
}
