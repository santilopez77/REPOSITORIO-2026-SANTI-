package uniquindio.edu.co.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado> listEmpleados;


    public Empresa(String nombre, List<Empleado> listEmpleados) {
        this.nombre = nombre;
        this.listEmpleados = new ArrayList<>();
    }

    /**
     * Crea un nuevo empleado y lo agrega a la lista de empleado.
     * @param nombre del empleado
     * @param documento del empleado
     * @param edad del empleado
     * @param salarioBase del empleado
     * @param descuentoSalud del empleado
     * @param descuentoPension del empleado
     * @param resumenPagolist del empleado
     * @return
     */
    public String crearEmpleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, List<ResumenPago> resumenPagolist){
        String respuesta = "";
        if(buscarEmpleado(documento)){
            respuesta = "El cliente ya existe con el mismo numero de cedula";
        }else{
            Empleado empleadoNuevo = new Empleado(nombre,documento, edad , salarioBase, descuentoSalud,descuentoPension,resumenPagolist) {
            };
            listEmpleados.add(empleadoNuevo);
            respuesta = "El cliente " +empleadoNuevo .getNombre() + " se registro exitosamente";
        }
        return respuesta;
    }







}
