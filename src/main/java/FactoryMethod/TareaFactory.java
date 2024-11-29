/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryMethod;

import java.util.Date;

/**
 *
 * @author rb122
 */
public interface TareaFactory {
    
    public void crearTarea(String tipo, String descripcion, int prioridad, Date fechaVencimiento);
}
