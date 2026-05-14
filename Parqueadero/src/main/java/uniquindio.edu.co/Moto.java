package uniquindio.edu.co;

public class Moto extends Vehiculo{

    public int cilindraje;

    public Moto (String placa, String nombreConductor, int idConductor, double horaIngreso, String espacioAsignado,
                  int cilindraje){
        super(placa, nombreConductor, idConductor, horaIngreso, espacioAsignado);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
