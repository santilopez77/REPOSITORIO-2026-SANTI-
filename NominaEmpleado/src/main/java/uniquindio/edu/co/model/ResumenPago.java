package uniquindio.edu.co.model;

public record ResumenPago(String documento , String nombre, String tipoEmpleado, float salarioBruto, float descuentos, float salarioNeto) {

    @Override
    public String toString() {
        return String.format(
                """
                ╔══════════════════════════════════════════╗
                  RESUMEN DE PAGO
                ╠══════════════════════════════════════════╣
                  Documento    : %s
                  Nombre       : %s
                  Tipo         : %s
                  Salario Bruto: $%.2f
                  Descuentos   : $%.2f
                  Salario Neto : $%.2f
                ╚══════════════════════════════════════════╝""",
                documento, nombre, tipoEmpleado,
                salarioBruto, descuentos, salarioNeto
        );
    }
}
