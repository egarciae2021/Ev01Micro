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
@Table(name = "Servicios_maestro")
public class ServicioMaestro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMaestro")
    private Integer id;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Costo")
    private Double costo;

    @Column(name = "Repuestos")
    private String repuestos;

    @Column(name = "Id_sedes")
    private Integer sedes;
 
    public ServicioMaestro() {}
    
    public ServicioMaestro(Integer id, String descripcion, Double costo, String repuestos, Integer sedes) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.costo = costo;
		this.repuestos = repuestos;
		this.sedes = sedes;
	}

    // getters y setters
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    } 
    
	public String getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(String repuestos) {
        this.repuestos = repuestos;
    }

    public Integer getSedes() {
        return sedes;
    }

    public void setSedes(Integer sedes) {
        this.sedes = sedes;
    }
}
