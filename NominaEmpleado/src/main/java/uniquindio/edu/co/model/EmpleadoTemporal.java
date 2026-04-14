package uniquindio.edu.co.model;

import java.util.List;

public class EmpleadoTemporal extends  Empleado {
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado, List<ResumenPago> listResumenPago, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado, listResumenPago);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

   public float  calcularPagoDias(){
        return diasTrabajados*valorDia;
   }

    @Override
    public float calcularSalarioBruto() {
        return 0;
    }
    @Override
    public String getTipoEmpleado() {
        return "Empleado Temporal";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("  [Temporal] Días trabajados: %d | Valor/día: $%.2f | Pago días: $%.2f%n%n",
                diasTrabajados, valorDia, calcularPagoDias());
    }




    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "diasTrabajados=" + diasTrabajados +
                ", valorDia=" + valorDia +
                '}';
    }
}

