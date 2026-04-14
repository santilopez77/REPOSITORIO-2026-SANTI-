package uniquindio.edu.co.model;

import java.util.List;

public class EmpleadoPlanta extends Empleado {
    private String cargo;
    private int horasExtras;
    private float valorHoraExtra;
    private float auxilioTransporte;


    public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado, List<ResumenPago> listResumenPago, String cargo, int horasExtras, float valorHoraExtra, float auxilioTransporte) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado, listResumenPago);
        this.cargo = cargo;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporte;
    }



    @Override
    public float calcularSalarioBruto() {
        return  getSalarioBase()
                +calcularBonifiacionCategoria()
                +(horasExtras + valorHoraExtra)
                +auxilioTransporte;
    }
}

@Override
public String getTipoEmpleado() {
    return "Empleado de Planta";
}

@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    // Detalle adicional de planta
    System.out.printf("  [Planta] Cargo: %s | Horas extra: %d | Valor h/e: $%.2f | Auxilio transp.: $%.2f%n%n",
            cargo, horasExtras, valorHoraExtra, auxilioTransporte);
}




}
