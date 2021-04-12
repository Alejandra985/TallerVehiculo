
package com.mycompany.vehiculo;
import javax.swing.JOptionPane;

public class Descuentos {
     public double definirDescuento(){
        Vehiculo1 imp = new Vehiculo1();
        PagoTotalVehiculo valor = new PagoTotalVehiculo();
        double impuestoFinal = valor.impuestoNN;
        JOptionPane.showMessageDialog(null, impuestoFinal);
        
        String opcion1 = imp.leerDatoTipoCadena("Usted cancelo el vehiculo a tiempo?");
        
        if (opcion1 == "si") {
            double descuento1 = valor.valorComercial * 0.01;
            impuestoFinal = impuestoFinal - descuento1;
        }
        
        String opcion2 = imp.leerDatoTipoCadena("Usted es de servicio publico?");
        
        if (opcion2 == "si") {            
            impuestoFinal = impuestoFinal - 15000;
        }
        
        String opcion3 = imp.leerDatoTipoCadena("Usted ha trasladado su cuenta?");
        
        if (opcion3 == "si") {            
            double descuento2 = valor.valorComercial * 0.02;
            impuestoFinal = impuestoFinal - descuento2;
        }
               
        
        JOptionPane.showMessageDialog(null, "El impuesto a pagar con los descuentos aplicados es de: "+impuestoFinal);                      
        
        return impuestoFinal;
    }
}
