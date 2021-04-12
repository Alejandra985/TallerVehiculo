
package com.mycompany.vehiculo;


public class LineaVehiculo {
     public double IngresarLineaDelVehiculo(){
        int menu;
        double monto1=0;
                        
        Vehiculo1 leerDato1 = new Vehiculo1();
        menu = leerDato1.leerDatoTipoEntero("Linea del vehiculo"+"\n"+"\n"+"1. Logan-Sandero"+"\n"+"2. Prado-Hilux"+"\n"+"3. Ertiga-Banelo Cross"+"\n"+"4. Cherokee-Gladiator"+"\n"+"5. Discovery Sport-Range Rover");
        
        switch(menu){
            case 1:
                monto1 = 500000;
                break;
            case 2:
                monto1 = 1500000;
                break;            
                        
        }  
        return monto1;
    }
}
