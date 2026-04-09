package uniquindio.edu.co.model;

import java.util.ArrayList;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;


    private list <Reunion>listContactoReuniones;

    public Contacto(String nombre, String alias, String direccion, String telefono, String email ) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;

    }
}
}
