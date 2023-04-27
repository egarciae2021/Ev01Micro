package certus.edu.pe.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Servicios_detalle")
public class Serviciodetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetalle")
    private Integer IdDetalle;
    
    @Column(name = "Id_reserva")
    private Integer Id_reserva;

    @Column(name = "Id_servicio")
    private Integer Id_servicio;

    
    @ManyToOne
    @JoinColumn(name = "Id_reserva", referencedColumnName = "IdReservas")
    private Reservas  Reservas;

    @ManyToOne
    @JoinColumn(name = "Id_servicio", referencedColumnName = "IdMaestro")
    private Serviciodetalle  servicio;

	public Serviciodetalle(Integer idDetalle, Integer id_reserva, Integer id_servicio) {
		super(); 
		Id_reserva = id_reserva;
		Id_servicio = id_servicio;
	}

    public Serviciodetalle() {}

	public Integer getIdDetalle() {
		return IdDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		IdDetalle = idDetalle;
	}

	public Integer getId_reserva() {
		return Id_reserva;
	}

	public void setId_reserva(Integer id_reserva) {
		Id_reserva = id_reserva;
	}

	public Integer getId_servicio() {
		return Id_servicio;
	}

	public void setId_servicio(Integer id_servicio) {
		Id_servicio = id_servicio;
	}
    
    
}