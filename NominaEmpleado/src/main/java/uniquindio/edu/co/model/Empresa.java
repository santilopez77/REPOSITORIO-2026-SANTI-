package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String nit;
    private String correo;
    private String direccion;
    private List<Empleado> listEmpleados;


    public Empresa(String nombre, String nit, String correo, String direccion, List<Empleado> listEmpleados) {
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.direccion = direccion;
        this.listEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListEmpleados() {
        return listEmpleados;
    }
    public void setListEmpleados(List<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }


    public void agregarEmpleado() {

    }

    public Empleado buscarPorDocumento(String doc) {

        return null;
    }

    public void mostrarTodosLosEmpleados() {

    }

    public void mostrarEmpleadoMayorSalario() {

    }

    public void calcularNominaTotal() {

    }

    public void mostrarResumenesDePago() {

    }
}
