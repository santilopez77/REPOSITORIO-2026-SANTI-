package uniquindio.edu.co;

public class Operario extends Persona {
    private int horasTrabajadas;

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Operario (String nombre, int id, String telefono, String email, int horasTrabajadas )
    {
        super(nombre,id,telefono, email);
        this.horasTrabajadas = horasTrabajadas;
    }
}


