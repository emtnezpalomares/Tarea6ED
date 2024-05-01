/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author Emilio
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     double total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*precio1;
            mensaje(total);
        }else {
            total = precioProducto*precio2;
            mensaje(total);
        }   

    }
    private static final double precio2 = 0.95;
    private static final double precio1 = 0.8;

    private void mensaje(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
