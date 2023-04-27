package certus.edu.pe.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 
 
@Entity
@Table(name = "sedes")
public class Sedes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSedes")
    private int IdSedes;

    @Column(name = "Nombre", nullable = false)
    private String Nombre;
 
    @Column(name = "Direccion", length = 100)
    private String direccion;

    // Constructor vacío
    public Sedes() {
    }

	public Sedes(int idSedes, String nombre, String direccion) {
		super();
		IdSedes = idSedes;
		Nombre = nombre;
		this.direccion = direccion;
	}

	public int getIdSedes() {
		return IdSedes;
	}

	public void setIdSedes(int idSedes) {
		IdSedes = idSedes;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 
}