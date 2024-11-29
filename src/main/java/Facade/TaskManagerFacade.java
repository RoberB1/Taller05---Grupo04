/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import FactoryMethod.Tarea;
import Strategy.StrategyView;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rb122
 */
public class TaskManagerFacade {
    List<Tarea> tareas;
    StrategyView visualizacion;
    
    
    public void crearTarea(String tipo, String descripcion, int prioridad, Date fechaVencimiento){
        //Codigo
    }
    
    public void mostrarTareas(String tipoView){
        //Codigo
    }
    
    public void actualizarEstadoTarea(int id, String estado){
        //Codigo
    }
}
