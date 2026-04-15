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

        public String getNombre () {
            return nombre;
        }
        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getNit () {
            return nit;
        }
        public void setNit (String nit){
            this.nit = nit;
        }

        public String getCorreo () {
            return correo;
        }
        public void setCorreo (String correo){
            this.correo = correo;
        }

        public String getDireccion () {
            return direccion;
        }
        public void setDireccion (String direccion){
            this.direccion = direccion;
        }

        public List<Empleado> getListEmpleados () {
            return listEmpleados;
        }
        public void setListEmpleados (List < Empleado > listEmpleados) {
            this.listEmpleados = listEmpleados;

        }

        public void agregarEmpleado (Empleado empleado){
            listEmpleados.add(empleado);
            System.out.println("Empleado " + empleado.getNombre() + " registrado correctamente.");
        }

        public Empleado buscarPorDocumento (String documento){
            for (Empleado e : listEmpleados) {
                if (e.getDocumento().equals(documento)) {
                    return e;
                }
            }
            return null;
        }

        public void mostrarTodosLosEmpleados () {
            if (listEmpleados.isEmpty()) {
                System.out.println("No hay empleados registrados.");
                return;
            }
            System.out.println("\n===== LISTA DE EMPLEADOS - " + nombre + " =====");
            for (Empleado e : listEmpleados) {
                e.mostrarInformacion();
            }

        }

        public void mostrarEmpleadoMayorSalario () {
            if (listEmpleados.isEmpty()) {
                System.out.println("No hay empleados registrados.");
                return;
            }
            Empleado mayor = listEmpleados.get(0);
            for (Empleado e : listEmpleados) {
                if (e.calcularSalarioNeto() > mayor.calcularSalarioNeto()) {
                    mayor = e;
                }
            }
            System.out.println("\n===== EMPLEADO CON MAYOR SALARIO NETO =====");
            mayor.mostrarInformacion();
        }

        public void calcularNominaTotal () {
            float total = 0;
            for (Empleado e : listEmpleados) {
                total += e.calcularSalarioNeto();
            }
            System.out.println("\nNómina total de la empresa " + nombre + ": $" + total);
        }

        public void mostrarResumenesDePago () {
            if (listEmpleados.isEmpty()) {
                System.out.println("No hay empleados registrados.");
                return;
            }
            System.out.println("\n===== RESÚMENES DE PAGO =====");
            for (Empleado e : listEmpleados) {
                ResumenPago resumen = e.generarResumenPago();
                System.out.println("----------------------------------------");
                System.out.println("Documento: " + resumen.documento());
                System.out.println("Nombre: " + resumen.nombre());
                System.out.println("Tipo: " + resumen.tipoEmpleado());
                System.out.println("Salario Bruto: $" + resumen.salarioBruto());
                System.out.println("Descuentos: $" + resumen.descuentos());
                System.out.println("Salario Neto: $" + resumen.salarioNeto());
            }
            System.out.println("----------------------------------------");
        }
    }

    
