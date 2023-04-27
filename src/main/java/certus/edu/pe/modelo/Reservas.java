package certus.edu.pe.modelo;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Reservas")
 public class Reservas {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "IdReservas")
	    private Integer idReservas;
 
		@Column(name = "Id_cliente")
	    private Integer Id_cliente;
		 
	     
	    @Column(name = "Id_auto")
	    private Integer Id_auto;
	    
 
	    @Column(name = "Id_sedes")
	    private Integer Id_sedes;
	   
	    @Column(name = "Id_personal")
	    private Integer Id_personal;
	    
	    @Column(name = "Fecha")
	    private Date Fecha;
	     
		 
	    public Reservas() {
	    }


		public Integer getIdReservas() {
			return idReservas;
		}


		public void setIdReservas(Integer idReservas) {
			this.idReservas = idReservas;
		}


		public Integer getId_cliente() {
			return Id_cliente;
		}


		public void setId_cliente(Integer id_cliente) {
			Id_cliente = id_cliente;
		}


		public Integer getId_auto() {
			return Id_auto;
		}


		public void setId_auto(Integer id_auto) {
			Id_auto = id_auto;
		}


		public Integer getId_sedes() {
			return Id_sedes;
		}


		public void setId_sedes(Integer id_sedes) {
			Id_sedes = id_sedes;
		}


		public Integer getId_personal() {
			return Id_personal;
		}


		public void setId_personal(Integer id_personal) {
			Id_personal = id_personal;
		}


		public Date getFecha() {
			return Fecha;
		}


		public void setFecha(Date fecha) {
			Fecha = fecha;
		}


		public Reservas(Integer idReservas, Integer id_cliente, Integer id_auto, Integer id_sedes, Integer id_personal,
				Date fecha) {
			super();
			this.idReservas = idReservas;
			Id_cliente = id_cliente;
			Id_auto = id_auto;
			Id_sedes = id_sedes;
			Id_personal = id_personal;
			Fecha = fecha;
		}

	   
}