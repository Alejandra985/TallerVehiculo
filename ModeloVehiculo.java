
package com.mycompany.vehiculo;


public class ModeloVehiculo {
    public double IngresarModeloDelVehiculo(){
        int menu;
        double monto2=0;
                        
        Vehiculo1 leerDato2 = new Vehiculo1();
        menu = leerDato2.leerDatoTipoEntero("Modelo del vehiculo"+"\n"+"Ingrese la opcion correspondiente:"+"\n"+"1. 1930 - 1950"+"\n"+"2. 1951 - 2000"+"\n"+"3. 2001 - 2022");
        
        switch(menu){
            case 1:
                monto2 = 300000;
                break;
            case 2:
                monto2 = 600000;
                break;
            case 3:
                monto2 = 900000;
                break;            
        }
        
        return monto2;
    }
}
