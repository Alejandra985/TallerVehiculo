/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculo;



public class MarcaVehiculo {
    public double IngresarMarcaDelVehiculo(){
        int menu;
        double monto=0;
                        
        Vehiculo1 leerDato = new Vehiculo1();
        menu = leerDato.leerDatoTipoEntero("Marca del vehiculo"+"\n"+"Digite la opcion correspondiente:"+"\n"+"1. Renault"+"\n"+"2. Toyota"+"\n"+"3. Suzuki"+"\n"+"4. Jeep"+"\n"+"5. Land Rover");
        
        switch(menu){
            case 1:
                monto = 1000000;
                break;
            case 2:
                monto = 2000000;
                break;
            case 3:
                monto = 3000000;
                break;
            case 4:
                monto = 4000000;
                break;
            case 5:
                monto = 5000000;
                break;
        }    
        return monto;
    }
}
