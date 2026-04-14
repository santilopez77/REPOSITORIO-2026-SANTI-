package uniquindio.edu.co.model;

import java.util.List;

public class EmpleadoVenta  extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado, List<ResumenPago> listResumenPago, float porcentajeComision, float totalVentas) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado, listResumenPago);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    public float calcularComision(){
        return totalVentas * porcentajeComision /100f;

    }

    @Override
    public float calcularSalarioBruto() {
        return 0;
    }
    @Override
    public String getTipoEmpleado() {
        return "Empleado de Ventas";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("  [Ventas] Total ventas: $%.2f | Comisión: %.1f%% ($%.2f)%n%n",
                totalVentas, porcentajeComision, calcularComision());
    }




    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
