/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.math.BigDecimal;

/**
 *
 * @author Rodrigo
 */
public interface Promocion {
    BigDecimal applyTo(Producto producto);
}
