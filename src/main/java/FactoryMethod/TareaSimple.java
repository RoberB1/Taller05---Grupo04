/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import java.util.Date;
import Observer.Observer;

/**
 *
 * @author rb122
 */
public class TareaSimple implements Tarea, Observer{
    private int id;
    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;
    private String estado;

    @Override
    public void mostrarDetalle() {
        //Codigo
    }

    @Override
    public int getId() {
        //Codigo
        
        return 0;
    }

    @Override
    public void setEstado(String estado) {
        //Codigo
    }

    @Override
    public void update(String message) {
        System.out.println("Notificacion");
    }
}
