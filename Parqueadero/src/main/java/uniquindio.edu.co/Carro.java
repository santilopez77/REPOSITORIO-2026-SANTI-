package uniquindio.edu.co;

public class Carro extends Vehiculo{
    public int numeroPuertas;

    public Carro (String placa, String nombreConductor, int idConductor, double horaIngreso, String espacioAsignado,
                      int numeroPuertas){
        super(placa, nombreConductor, idConductor, horaIngreso, espacioAsignado);
        this.numeroPuertas = numeroPuertas;
}

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    }
