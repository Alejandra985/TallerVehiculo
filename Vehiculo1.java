
package com.mycompany.vehiculo;


import javax.swing.JOptionPane;

public class Vehiculo1 {
    private String Marca;
    private String Linea;
    private int Modelo;
    private double ImpuestoAPagar;
    
    
    public Vehiculo1() {
    
}

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public double getImpuestoAPagar() {
        return ImpuestoAPagar;
    }

    public void setImpuestoAPagar(double ImpuestoAPagar) {
        this.ImpuestoAPagar = ImpuestoAPagar;
    }

   
    

    
    
    public Vehiculo1 (String Marca, String Linea, int Modelo, double ImpuestoAPagar) {
        this.Marca = Marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.ImpuestoAPagar = ImpuestoAPagar;
        
    }
    
    public String getAtributos(){
        return "Marca: "+this.Marca + "Linea: "+this.Linea + "Modelo: "+this.Modelo + "Impuesto A Paga: "+this.ImpuestoAPagar ;
    }
    
    /*
    public double calcularImpuesto(){        
        Liquidacion valor = new Liquidacion();
        
        double impuesto21 = valor.calcularLiquidacion() * 0.10;        

        return impuesto21;
    }
    */
    
    /*public Carro ingresarDatos(){                
        Carro nuevoCarro = new Carro();
        Marca marca = new Marca();
        Linea linea = new Linea();
        Modelo modelo = new Modelo();
        
        JOptionPane.showMessageDialog(null, "Bienvenido al programa para calcular el impuesto de su auto"+"\n"+"Por favor digite los datos que se le van a solicitar a continuación");        
        
         
        calcularImpuesto();
        
        nuevoCarro.setMarca(Marca);
        nuevoCarro.setLinea(Linea);
        nuevoCarro.setModelo(Modelo);
        nuevoCarro.setImpuesto(Impuesto);
        
        return (nuevoCarro);
    }*/
    
    public String leerDatoTipoCadena (String mensaje){
            String valor = "";
            valor = JOptionPane.showInputDialog(null,mensaje);
            return (valor);
    }
    
    public int leerDatoTipoEntero (String mensaje){
            int valor = 0;
            try{
                valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
                return (valor);
            }
            catch (Exception errorIngreso){
                errorIngreso.printStackTrace();
                return (0);
            }
    }

}
