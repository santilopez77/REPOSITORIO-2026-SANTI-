package uniquindio.edu.co.model;

import java.util.List;

public abstract class Empleado {

    private String nombre;
    private String documento;
    private int edad;
    private float salarioBase;
    private float descuentoSalud;
    private float descuentoPension;
    private CategoriaEmpleado categoriaEmpleado;

    private  List  <ResumenPago> listResumenPago;

    public Empleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado, List<ResumenPago> listResumenPago) {

        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo");
        }
        if (descuentoSalud < 0 || descuentoSalud > 100) {
            throw new IllegalArgumentException("Descuento de salud inválido (0-100)");
        }
        if (descuentoPension < 0 || descuentoPension > 100) {
            throw new IllegalArgumentException("Descuento de pensión inválido (0-100)");
        }

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.categoriaEmpleado = categoriaEmpleado;
        this.listResumenPago = listResumenPago;
    }



    public abstract float calcularSalarioBruto();

    public abstract String getTipoEmpleado();

    public float calcularBonifiacionCategoria(){
        return salarioBase*CategoriaEmpleado.getPorcentajeBonificacion();
    }

    public float calcularDescuento (){
        float bruto = calcularSalarioBruto();
        return bruto *(descuentoSalud + descuentoPension)/100f;
    }

    public float calcularSalarioNeto(){
        return calcularSalarioBruto()- calcularDescuento();
    }

    public ResumenPago generarResumenPago(){
        return new ResumenPago(
                documento,
            nombre,
            getTipoEmpleado(),
            calcularSalarioBruto(),
            calcularDescuento(),
            calcularSalarioNeto()
        );
    }
    public void mostrarInformacion() {
        System.out.printf("""
                ┌─────────────────────────────────────────┐
                  %s
                ├─────────────────────────────────────────┤
                  Nombre       : %s
                  Documento    : %s
                  Edad         : %d años
                  Categoría    : %s
                  Salario Base : $%.2f
                  Salario Bruto: $%.2f
                  Descuentos   : $%.2f (Salud %.1f%% + Pensión %.1f%%)
                  Salario Neto : $%.2f
                └─────────────────────────────────────────┘
                %n""",
                getTipoEmpleado(),
                nombre, documento, edad, categoriaEmpleado,
                salarioBase,
                calcularSalarioBruto(),
                calcularDescuento(), descuentoSalud, descuentoPension,
                calcularSalarioNeto()
        );
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(float descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public float getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(float descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public List<ResumenPago> getListResumenPago() {
        return listResumenPago;
    }

    public void setListResumenPago(List<ResumenPago> listResumenPago) {
        this.listResumenPago = listResumenPago;
    }
}
