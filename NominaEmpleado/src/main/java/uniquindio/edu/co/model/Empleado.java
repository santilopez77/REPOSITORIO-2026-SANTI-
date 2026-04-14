package uniquindio.edu.co.model;

import java.util.List;

import static uniquindio.edu.co.model.CategoriaEmpleado.*;

public abstract class Empleado {

    private String nombre;
    private String documento;
    private int edad;
    private float salarioBase;
    private float descuentoSalud;
    private float descuentoPension;

    private  List  <ResumenPago> resumenPagolist;


    public Empleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, List<ResumenPago> resumenPagolist) {

        if (salarioBase < 0) throw new IllegalArgumentException("Salario base inválido");
        if (descuentoSalud < 0 || descuentoSalud > 100) throw new IllegalArgumentException("Salud inválido");
        if (descuentoPension < 0 || descuentoPension > 100) throw new IllegalArgumentException("Pensión inválido");

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.resumenPagolist = resumenPagolist;
    }

    public abstract calcularSalarioBruto();

   public float calcularBonificacionCategoria(){
           switch (CategoriaEmpleado){
               case JUNIOR:
                   return salarioBase * 0.05f;
               case SEMI_SENIOR:
                   return salarioBase * 0.10f;
               case SENIOR:
                   return salarioBase * 0.15f;
               default:
                   return 0;
           }
    }

    public float calcularDescuentos(){
        float bruto = calcularSalarioBruto();
        float salud = bruto * (descuentoSalud / 100);
        float pension = bruto * (descuentoPension / 100);
        return salud + pension;
    }

    public float calcularsalarioNeto(){
        return calcularSalarioBruto() - calcularDescuentos();
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario Neto: " + calcularSalarioNeto());
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



}
