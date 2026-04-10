package uniquindio.edu.co.model;

public class EmpleadoVenta  extends Empleado{
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, list<ResumenPago> resumenPagolist, float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, resumenPagolist);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
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
