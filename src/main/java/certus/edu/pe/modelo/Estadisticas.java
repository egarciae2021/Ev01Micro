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
@Table(name = "estadisticas")
public class Estadisticas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstadisticas")
    private Integer id;

    @Column(name = "Monto")
    private Double monto;

    @ManyToOne
    @JoinColumn(name = "Id_sedes", referencedColumnName = "IdSedes")
    private Sedes sedes;

    @ManyToOne
    @JoinColumn(name = "Id_reserva", referencedColumnName = "IdReservas")
    private Reservas reservas;

    // getters y setters
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Estadisticas() {}

    public Estadisticas(Integer id, Double monto, Sedes sedes, Reservas reservas) {
		super();
		this.id = id;
		this.monto = monto;
		this.sedes = sedes;
		this.reservas = reservas;
	}

	public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Sedes getSedes() {
        return sedes;
    }

    public void setSedes(Sedes sedes) {
        this.sedes = sedes;
    }

    public Reservas getReservas() {
        return reservas;
    }

    public void setReservas(Reservas reservas) {
        this.reservas = reservas;
    }
}
