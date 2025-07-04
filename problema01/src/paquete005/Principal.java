/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import paquete003.BilleteraPagos;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        BilleteraPagos pago = new BilleteraPagos() {
            @Override
            public double calcularPago() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        System.out.println(pago);
    }
}
