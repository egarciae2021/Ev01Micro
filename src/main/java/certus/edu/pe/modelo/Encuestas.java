package certus.edu.pe.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import  certus.edu.pe.modelo.*;

@Entity
@Table(name = "encuestas")
public class Encuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEncunestas")
    private Integer IdEncunestas;

    @Column(name = "Calificacion")
    private Integer Calificacion;

    @Column(name = "Id_personal")
    private Integer Id_personal;
    
    @Column(name = "Id_sedes")
    private Integer Id_sedes;
    
    
    // Constructor vacío
    public Encuestas() {
    }


	public Integer getIdEncunestas() {
		return IdEncunestas;
	}


	public void setIdEncunestas(Integer idEncunestas) {
		IdEncunestas = idEncunestas;
	}


	public Integer getCalificacion() {
		return Calificacion;
	}


	public void setCalificacion(Integer calificacion) {
		Calificacion = calificacion;
	}


	public Integer getId_personal() {
		return Id_personal;
	}


	public Encuestas(Integer idEncunestas, Integer calificacion, Integer id_personal, Integer id_sedes) {
		super();
		IdEncunestas = idEncunestas;
		Calificacion = calificacion;
		Id_personal = id_personal;
		Id_sedes = id_sedes;
	}


	public void setId_personal(Integer id_personal) {
		Id_personal = id_personal;
	}


	public Integer getId_sedes() {
		return Id_sedes;
	}


	public void setId_sedes(Integer id_sedes) {
		Id_sedes = id_sedes;
	}
 
} 