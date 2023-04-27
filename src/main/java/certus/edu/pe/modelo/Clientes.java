package certus.edu.pe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCliente;
    
    private String Nombre;
    
    private String Apellido;
    
    private Integer Edad;

    private String Celular;

    private String Correo;
    
    private String Direccion;

    public Clientes() {} 
    
    public Clientes( Integer idCliente, String nombre, String apellido, Integer edad, String celular, String correo, String direccion) {
		super();
        IdCliente = idCliente;
    	Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Celular = celular;
        Correo = correo;
        Direccion = direccion;
    }


	public Integer getIdCliente() {
        return IdCliente;
    }    
    
    public void setIdCliente(Integer idCliente) {
    	IdCliente = idCliente;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}