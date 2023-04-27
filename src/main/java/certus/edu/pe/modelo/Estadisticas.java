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
@Table(name = "estadisticas")
public class Estadisticas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstadisticas")
    private Integer id;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "Id_sedes")
    private Double Id_sedes;
    
    @Column(name = "Id_reserva")
    private Double Id_reserva;
     
    
 
    public Estadisticas(Integer id, Double monto, Double id_sedes, Double id_reserva) {
		super();
		this.id = id;
		this.monto = monto;
		Id_sedes = id_sedes;
		Id_reserva = id_reserva;
	}



	public Estadisticas() {}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Double getMonto() {
		return monto;
	}



	public void setMonto(Double monto) {
		this.monto = monto;
	}



	public Double getId_sedes() {
		return Id_sedes;
	}



	public void setId_sedes(Double id_sedes) {
		Id_sedes = id_sedes;
	}



	public Double getId_reserva() {
		return Id_reserva;
	}



	public void setId_reserva(Double id_reserva) {
		Id_reserva = id_reserva;
	}

  
}
