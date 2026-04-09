package uniquindio.edu.co.model;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private list<Empleado> listEmpleados;


    public Empresa(String nombre, list<Empleado> listEmpleados) {
        this.nombre = nombre;
        this.listEmpleados = new ArrayList<>();
    }
}
