package uniquindio.edu.co.model;

public class EmpleadoTemporal extends  Empleado {
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, list<ResumenPago> resumenPagolist, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, resumenPagolist);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
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
}

