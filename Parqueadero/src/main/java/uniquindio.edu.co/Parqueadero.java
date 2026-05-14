package uniquindio.edu.co;

import java.util.List;

public class Parqueadero {

    private String nombre;
    private String nit;
    private int espaciosTotales;


    private List<Vehiculo> listVehiculo;
    private List<Espacio> listEspacio;
    private List<Persona> listPersona;
    private List<Registro> listRegistro;

    public Parqueadero(String nombre, String nit, int espaciosTotales) {
        this.nombre = nombre;
        this.nit = nit;
        this.espaciosTotales = espaciosTotales;
    }

    //----------------------------------------------CRUD OPERARIO-----------------------------------------

    /**
     * Metodo para buscar si un empleado ya existe en el programa
     *
     * @param id del operario
     * @return
     */
    public boolean buscarEmpleado(int id) {
        boolean existe = false;
        for (Persona persona : listPersona) {
            if (persona.getId() == id) {
                existe = true;

            }
        }
        return existe;
    }

    /**
     * Metodo para crear un operario en el programa
     *
     * @param nombre del operario
     * @param id     del operario
     * @return mensaje indicando la operación
     */
    public String crearOperario(String nombre, int id, String telefono, String email, int horasTrabajadas) {
        String respuesta = "";
        if (buscarEmpleado(id)) {
            respuesta = "El empleado con id " + id + " ya existe en el sistema.";
        } else {
            Operario nuevoOperario = new Operario(nombre, id, telefono, email, horasTrabajadas);
            listPersona.add(nuevoOperario);
            respuesta = "El operario " + nuevoOperario.getNombre() + " se registró exitosamente.";
        }
        return respuesta;
    }

    /**
     * Metodo para saber si un espacio esta disponible
     *
     * @param estadoEspacio del espacio
     * @return un booleano con el estado en falso o verdadero
     */
    public boolean encontrarEspacioDisponible(EstadoEspacio estadoEspacio) {
        boolean encontrado = false;
        for (Espacio e : listEspacio) {
            if (e.getEstadoEspacio() == EstadoEspacio.DISPONIBLE) {
                encontrado = true;

            }
        }
        return encontrado;
    }

    /**
     * Metodo para consultar cuantos espacios hay disponibles
     * @return mensaje con el total de espacios ocupados
     */

    public String consultarEspaciosDisponibles() {
        int total = listEspacio.size();
        int ocupados = 0;
        int disponibles = 0;

        for (Espacio esp : listEspacio) {
            if (esp.getEstadoEspacio() == EstadoEspacio.OCUPADO) {
                ocupados++;
            }
        }

        disponibles = total - ocupados;
        return
                "El Total de espacios es: " + total + "Los ocupados son: " + ocupados + "y los espacios disponibles: " + disponibles;
    }


    /**
     * Metodo para registrar el ingreso de los vehiculos al parqueadero

     * @param placa           del vehiculo
     * @param nombreConductor del vehiculo
     * @param idConductor     del vehiculo
     * @param horaIngreso     del vehiculo
     * @param espacioAsignado del vehiculo
     * @return mensaje indicando operación
     */
    public String registrarIngresoVehiculos(String placa, String nombreConductor, int idConductor,
                                            double horaIngreso, String espacioAsignado) {
        String respuesta = "";
        if (encontrarEspacioDisponible(EstadoEspacio.DISPONIBLE)) {
            respuesta = "El vehiculo no puede ingresar ya que el espacio esta ocupado por otro vehiculo";
        } else {
            //Falta como agregar el tipo de vehiculo
            Vehiculo newVehiculo = new Vehiculo(placa, nombreConductor, idConductor, horaIngreso, espacioAsignado);
            respuesta = "El vehiculo ha ingresado exitosamente ";
        }
        return respuesta;
    }

    /**
     * Metodo para consultar cuantos vehiculos hay dentro del parqueadero
     * @return mensaje indicando operación
     */

    public String vehiculosDentroParqueadero(String placa) {
        String respuesta = "";
        for (Vehiculo vehiculo : listVehiculo) {
            if (vehiculo.getPlaca().equals(placa)) {
            }
            if (vehiculo.getEstadoVehiculo() == EstadoVehiculo.ADENTRO) {
                respuesta = "Placa: " + vehiculo.getPlaca() + "Conductor: " + vehiculo.getNombreConductor() + "Hora ingreso: "
                        + vehiculo.getHoraIngreso() + "Espacio asignado " + vehiculo.getEspacioAsignado();

            } else {
                respuesta = "El vehiculo no esta estacionado en ningun espacio";
            }

        }
        return respuesta;
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

    public int getEspaciosTotales() {
        return espaciosTotales;
    }

    public void setEspaciosTotales(int espaciosTotales) {
        this.espaciosTotales = espaciosTotales;
    }

    public List<Vehiculo> getListVehiculo() {
        return listVehiculo;
    }

    public void setListVehiculo(List<Vehiculo> listVehiculo) {
        this.listVehiculo = listVehiculo;
    }

    public List<Espacio> getListEspacio() {
        return listEspacio;
    }

    public void setListEspacio(List<Espacio> listEspacio) {
        this.listEspacio = listEspacio;
    }

    public List<Persona> getListEmpleado() {
        return listPersona;
    }

    public void setListEmpleado(List<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public List<Registro> getListRegistro() {
        return listRegistro;
    }

    public void setListRegistro(List<Registro> listRegistro) {
        this.listRegistro = listRegistro;
    }

    @Override
    public String toString() {
        return "Parqueadero{" + "nombre='" + nombre + "', nit='" + nit + "'}";
    }
}