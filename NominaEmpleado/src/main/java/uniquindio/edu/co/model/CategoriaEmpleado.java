package uniquindio.edu.co.model;

public enum CategoriaEmpleado {
    JUNIOR(0.05f,"junior"),
    SEMI_SENIOR(0.10f, "semi senior"),
    SENIOR(0.15f , "senior");


    private final float porcentajeBonificacion;
    private final  String descripcion;

    CategoriaEmpleado(float porcentajeBonificacion, String descripcion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
        this.descripcion = descripcion;
    }

    public float getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaEmpleado{" +
                "porcentajeBonificacion=" + porcentajeBonificacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
