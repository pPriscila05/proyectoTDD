package maquinadecafe;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDeCafe {
    
    public Cafetera cafetera;
    public Vaso vasosPequenos;
    public Vaso vasosMedianos; 
    public Vaso vasosGrandes;
    public Azucarero azucar;
    public Map<String, Vaso> vasosTamanos;


    public MaquinaDeCafe() {
        this.vasosTamanos = new HashMap<>();

    }
    
    public Vaso getTipoVaso(String tipoDeVaso){
        return this.vasosTamanos.get(tipoDeVaso);
    }
    
    
    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
        this.vasosTamanos.put("Pequeno", vasosPequenos);
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
        this.vasosTamanos.put("Mediano", vasosMedianos);
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
        this.vasosTamanos.put("Grande", vasosGrandes);
    }

    public void setAzucar(Azucarero azucar) {
        this.azucar = azucar;
    }
    
        public void setCafe(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Cafetera getCafe() {
        return cafetera;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public Vaso getVasosPequenos() {
        return vasosPequenos;
    }

    public Azucarero getAzucar() {
        return azucar;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
         if (vaso.hasVasos(cantidadDeVasos) == false) {
             return "No tenemos vasos disponibles";  
        }
         
        if (this.cafetera.hasCafe(vaso.getContenido()) == false) {
             return "No tenemos café por el momento";  
        }
        
        if (this.azucar.getCantidadAzucar() <= cantidadDeAzucar) {
             return "No tenemos azúcar por el momento";  
        }
        
        cafetera.giveCafe(vaso.getContenido());
        azucar.giveAzucar(cantidadDeAzucar);
        vaso.giveVasos(cantidadDeVasos);

        return "Todo está siendo preparado, espere por su café.";
            
    }

}
