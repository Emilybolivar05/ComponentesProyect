package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuariot")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idUsuario;

    private String nombre;

    private String correo;

    private String contrasena;


    public Usuario(){}

    public Usuario(String nombre, String correo, String contrasena, String role) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        
    }

    public Usuario(String nombre, String correo, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass()!=this.getClass()) return false;

        Usuario user = (Usuario) o;
        return Objects.equals(nombre, user.nombre) &&
                Objects.equals(correo, user.correo) &&
                Objects.equals(contrasena, user.contrasena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo, contrasena);
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   
}


