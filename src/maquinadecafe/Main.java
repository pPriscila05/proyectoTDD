/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(50);
        Vaso vasosPequenos = new Vaso(5, 10);
        Vaso vasosMedianos = new Vaso(3, 20);
        Vaso vasosGrande = new Vaso(1, 30);
        Azucarero azucarero = new Azucarero(20);

        MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafe(cafetera);
        maquinaDeCafe.setVasosPequenos(vasosPequenos);
        maquinaDeCafe.setVasosMedianos(vasosMedianos);
        maquinaDeCafe.setVasosGrandes(vasosGrande);
        maquinaDeCafe.setAzucar(azucarero);
        mostrar();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escoge el tipo de vaso que deseas: Pequeno, Mediano, Grande ");
            String vaso = scanner.nextLine();
            boolean result = (vaso.equals("Pequeno") || vaso.equals("Mediano") || vaso.equals("Grande"));

            if(!result) {
                System.out.println("Debe seleccionar un tamaño para el vaso ");
                continue;
            }

            System.out.println("¿Que cantidad de azucar deseas? (En cucharadas) ");
            String cantidadDeAzucar = scanner.nextLine();

            if (!cantidadDeAzucar.matches("[0-9]+")) {
                System.out.println("Debe indicar la cantidad de azúcar que desea ");
                continue;
            }

            int azucar = Integer.parseInt(cantidadDeAzucar);
            Vaso vasoDeCafe = maquinaDeCafe.getTipoVaso(vaso);
            String resultadoMaquina = maquinaDeCafe.getVasoDeCafe(vasoDeCafe, 1, azucar);
            System.out.println(resultadoMaquina);

           
            System.out.println(" ");
            try {
                Thread.sleep(3*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
            System.out.println("Todo listo. Disfruta de tu cafe.");
            System.out.println();
            try {
                Thread.sleep(4*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
            
            System.out.println("¿Desea salir? (y/n)> ");
            String response = scanner.nextLine();

            if(response.equals("y")) {
                System.out.println("¡Gracias por preferirnos! Vuelve pronto");
                break;
            }
        }
    }

    private static void mostrar() {
        System.out.println("--SELECCIONE SU CAFE DE PREFERENCIA--");
        try {
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        System.out.println();
        System.out.println("Cantidad de cafe en la maquina: 50 unidades");
        System.out.println("Cantidad de azucar en la maquina: 20 gramos");
        System.out.println(" ");
   

        try {
            Thread.sleep(2*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        System.out.println(" --- Tipos de Vasos --- ");
        System.out.println("Vasos Pequeno: 10 unidades de cafe. Cantidad de Vasos 5");
        System.out.println("Vasos Mediano: 20 unidades de cafe. Cantidad de Vasos 3");
        System.out.println("Vasos Grande: 30 unidades de cafe. Cantidad de Vasos 1");
    }    }
    
    

