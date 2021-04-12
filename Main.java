
package com.mycompany.vehiculo;


public class Main {
    public static void main(String[] args) {
        Main main = new Main(); 
        
        main.mostrar();       
    }
    
    public void mostrar(){
        PagoTotalVehiculo mostrar = new PagoTotalVehiculo(); 
        //Vehiculo mostrar1 = new Vehiculo();
                
        mostrar.solicitarDatos();
        mostrar.mostrarLiquidacion();
    }
}
