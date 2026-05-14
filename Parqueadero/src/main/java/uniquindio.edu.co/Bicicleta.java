package uniquindio.edu.co;

public class Bicicleta extends Vehiculo{
    private String marca;

    public Bicicleta (String placa, String nombreConductor, int idConductor, double horaIngreso, String espacioAsignado,
    String marca){
        super(placa, nombreConductor, idConductor, horaIngreso, espacioAsignado);
        this.marca = marca;
    }


public String getMarca (){return marca;}
    public void setMarca (String marca){this.marca  = marca;}
}
