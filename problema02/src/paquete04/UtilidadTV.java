/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author L E N O V O
 */
public class UtilidadTV {

    public static Televisor obtenerTelevisorMasCaro(ArrayList<Televisor> tvs) {
        if (tvs == null || tvs.isEmpty()) return null;

        Televisor masCaro = tvs.get(0);
        for (Televisor t : tvs) {
            if (t.obtenerPrecio() > masCaro.obtenerPrecio()) {
                masCaro = t;
            }
        }
        return masCaro;
    }
}
