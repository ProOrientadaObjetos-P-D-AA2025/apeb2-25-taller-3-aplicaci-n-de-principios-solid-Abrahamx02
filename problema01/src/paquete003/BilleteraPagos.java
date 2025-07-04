/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

/**
 *
 * @author reroes
 */
public abstract class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes;
    public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;
    
    public abstract double calcularPago();
    
    public String toString(){
         
        return """
               Presentar Reporte
               =================
               Nombre:"""+persona+
                "\nMes:"+mes+
                "\nPago Del Agua Potable:"+aguaCasa+
                "\nPago Del Agua Potable Del Comercio:"+aguaComercio+
                "\nPago De La Luz Electrica De Casa:"+luzCasa+
                "\nPago De La Luz Electrica De Comercio:"+luzComercio+
                "\nPago Predial:"+casa1+
                "\nPago Predial secundario:"+casa2+
                "\nPago Telefono Convencional Casa:"+telefonoCasa+
                "\nPago Telefono Convencional finca:"+telefonoFinca+
                "\nGastos de Pagos:"+gastoPagos
                ;
    }
    
}
