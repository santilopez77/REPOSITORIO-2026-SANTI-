package uniquindio.edu.co;

import java.util.List;

public class Vehiculo implements TarifaEspacio {

    // Atributos
    private String placa;
    private String nombreConductor;
    private int idConductor;
    private double horaIngreso;
    private String espacioAsignado;

    // Relaciones
    private Parqueadero theParqueadero;
    private EstadoVehiculo estadoVehiculo;
    private Espacio theEspacioAsignado;
    private Usuario theUsuario;
    private List<Registro> listRegistro;

    public Vehiculo(String placa, String nombreConductor, int idConductor, double horaIngreso, String espacioAsignado) {
        this.placa = placa;
        this.nombreConductor = nombreConductor;
        this.idConductor = idConductor;
        this.horaIngreso = horaIngreso;
        this.espacioAsignado = espacioAsignado;
    }


    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public double getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(double horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getEspacioAsignado (){ return espacioAsignado;}

    public void setEspacioAsignado (String espacioAsignado){this.espacioAsignado = espacioAsignado;}

    public Parqueadero getTheParqueadero() {
        return theParqueadero;
    }

    public void setTheParqueadero(Parqueadero theParqueadero) {
        this.theParqueadero = theParqueadero;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public Espacio getTheEspacioAsignado() {
        return theEspacioAsignado;
    }

    public void setTheEspacioAsignado(Espacio theEspacioAsignado) {
        this.theEspacioAsignado = theEspacioAsignado;
    }

    public Usuario getTheUsuario() {
        return theUsuario;
    }

    public void setTheUsuario(Usuario theUsuario) {
        this.theUsuario = theUsuario;
    }

    public List<Registro> getListRegistro() {
        return listRegistro;
    }

    public void setListRegistro(List<Registro> listRegistro) {
        this.listRegistro = listRegistro;
    }

    @Override
    public String toString() {
        return "Vehiculo{placa='" + placa + "'}";
    }
}