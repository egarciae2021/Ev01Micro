package certus.edu.pe.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersonal")
    private int IdPersonal;

    @Column(name = "Nombre", nullable = false)
    private String Nombre;

    @Column(name = "Apellido", nullable = false)
    private String Apellido;

    @Column(name = "Edad")
    private Integer Edad;

    @Column(name = "Celular", length = 15)
    private String Celular;

    @Column(name = "Correo", length = 100)
    private String Correo;

    @Column(name = "Direccion", length = 100)
    private String Direccion;

    @Column(name = "Cargo", length = 100)
    private String Cargo;

    // Constructor vacío
    public Personal() {
    }

    // Constructor con parámetros
    public Personal(String Nombre, String Apellido, Integer Edad, String Celular, String Correo, String Direccion,String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Celular = Celular;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Cargo = Cargo;
    }

    // Getters y Setters
    public int getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.IdPersonal = idPersonal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setOcupacion(String Cargo) {
        this.Cargo = Cargo;
    }
}

