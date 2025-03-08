/**
 * Autor: Gerbert García
 * Clase que calcula el area de un trapecio
 */
package com.mycompany.parcialuno;

public class AreaTrapecio {
    
    /**
     * Método que calcula el area de un trapecio.
     * @param bm Base mayor
     * @param bn base menor
     * @param h altura
     * @return Resultado del calculo
     */
    public int areaTrap(int bm, int bn, int h) {
        return ( (bm + bn) / 2 ) * h;
    }
}
