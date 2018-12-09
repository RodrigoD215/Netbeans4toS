/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class CarritoCompras {
    
    private List<Producto>items = new ArrayList<Producto>();
    private Promocion promocion;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void agregar(Producto producto){
        if(producto.obtenerPrecio().compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("No se puede agregar un producto de precio Negativo");
        }
        
        items.add(producto);
    }
    
    public int tamaño(){
        return items.size();
    }
    
    public BigDecimal total(){
    BigDecimal totalCarrito = new BigDecimal("0.00");
    for(Producto producto :items){
        if(promocion != null){
    totalCarrito = totalCarrito.add(promocion.applyTo(producto));
        }
        else{
    totalCarrito = totalCarrito.add(producto.obtenerPrecio());
    }
    }
    return totalCarrito;
    }

    public BigDecimal totalImpuesto() {
        return total().multiply(new BigDecimal("1.18"));
    }

    public void establecerPromocion(Promocion promocion){
        this.promocion = promocion;
    }
    }
   
