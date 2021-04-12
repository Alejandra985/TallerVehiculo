
package com.mycompany.vehiculo;
import javax.swing.JOptionPane;

public class PagoTotalVehiculo {
     double valorComercial;
    double montoMarca;
    double montoLinea;
    double montoModelo;
    double impuestoNN;
    double impuestoFinal;
    double descuento1;
    double descuento2;
    double impuestofinal2;
    
    /*        
    Marca ob1 = new Marca();
    Linea ob2 = new Linea();
    Modelo ob3 = new Modelo();
    
    double montoMarca = ob1.IngresarMarca();
    double montoLinea = ob2.IngresarLinea();
    double montoModelo = ob3.IngresarModelo();
    
    valorComercial = montoMarca + montoLinea + montoModelo;
    */
    
    
    public void solicitarDatos(){
        
        MarcaVehiculo ob1 = new MarcaVehiculo();
        LineaVehiculo ob2 = new LineaVehiculo();
        ModeloVehiculo ob3 = new ModeloVehiculo();
    
        montoMarca = ob1.IngresarMarcaDelVehiculo();
        montoLinea = ob2.IngresarLineaDelVehiculo();
        montoModelo = ob3.IngresarModeloDelVehiculo();
        
      
        
        valorComercial = montoMarca + montoLinea + montoModelo;
        
        impuestoNN = valorComercial * 0.10;
        
    }
    /*
    public double calcularLiquidacion(){    
        double holisim;
        holisim = impuestoNN;
        JOptionPane.showMessageDialog(null, holisim);
        
        return holisim;
    }
    
    public void calImp(){
        double ayudaplox = 1;
        ayudaplox = valorComercial * 0.10;
        JOptionPane.showMessageDialog(null, ayudaplox);
        
    }
    */
    
    public void mostrarLiquidacion(){                          
        
        //Descuento descuento = new Descuento();
                                                
        JOptionPane.showMessageDialog(null, "El valor del vehiculo ingresado es: "+valorComercial);
        JOptionPane.showMessageDialog(null, "El impuesto a pagar sin descuento es: "+impuestoNN);
        Vehiculo1 imp = new Vehiculo1();
        impuestoFinal =impuestoNN;
       
        
        
        String opcion1 = imp.leerDatoTipoCadena("Usted cancelo el pago del vehiculo a tiempo?");
        
        
        if ("si".equalsIgnoreCase(opcion1)) {
            descuento1 = valorComercial * 0.01;
            impuestoFinal = impuestoFinal - descuento1;
        }
        
        String opcion2 = imp.leerDatoTipoCadena("El vehiculo es de servicio publico?");
        
        if ("si".equalsIgnoreCase(opcion2)) {            
            impuestoFinal = impuestoFinal - 15000;
        }
        
        String opcion3 = imp.leerDatoTipoCadena("Usted ha trasladado su cuenta?");
        
        if ("si".equalsIgnoreCase(opcion3)) {            
            descuento2 = valorComercial * 0.02;
            impuestoFinal = impuestoFinal - descuento2;
        }
            
        
           
        JOptionPane.showMessageDialog(null, "El impuesto a pagar con descuento es: "+impuestoFinal);
        //descuento.definirDescuento();
                
    }
}
