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
@Table(name = "Encuestas")
public class Encuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEncuestas")
    private Integer IdEncuestas;

    @Column(name = "Calificacion")
    private Integer Calificacion;


    @JoinColumn(name = "Id_personal", referencedColumnName = "IdPersonal", nullable = false)
    private Integer Id_personal;


    @JoinColumn(name = "Id_sedes", referencedColumnName = "IdSedes", nullable = false)
    private Integer Id_sedes;

    
    public Encuestas() {
    }

	public Encuestas(Integer idEncuestas, Integer calificacion, Integer id_personal, Integer id_sedes) {
		super();
		IdEncuestas = idEncuestas;
		Calificacion = calificacion;
		Id_personal = id_personal;
		Id_sedes = id_sedes;
	}

	public Integer getIdEncuestas() {
		return IdEncuestas;
	}

	public void setIdEncuestas(Integer idEncuestas) {
		IdEncuestas = idEncuestas;
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