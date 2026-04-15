package uniquindio.edu.co.model;

import java.util.List;

public class EmpleadoPlanta extends Empleado {
    private String cargo;
    private int horasExtras;
    private float valorHoraExtra;
    private float auxilioTransporte;


    public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado, List<ResumenPago> listResumenPago, String cargo, int horasExtras, float valorHoraExtra, float auxilioTransporte) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado, listResumenPago);

        if (horasExtras < 0) {
            throw new IllegalArgumentException("Horas extra no pueden ser negativas");
        }
        if (valorHoraExtra < 0) {
            throw new IllegalArgumentException("Valor de hora extra inválido");
        }
        if (auxilioTransporte < 0) {
            throw new IllegalArgumentException("Auxilio de transporte inválido");
        }

        this.cargo = cargo;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public float calcularSalarioBruto() {
        return 0;
    }

    @Override
    public String getTipoEmpleado() {
        return "";
    }
}