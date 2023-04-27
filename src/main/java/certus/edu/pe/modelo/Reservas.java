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

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity
@Table(name = "Reserva")
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdReservas")
    private int IdReservas;

    
    @JoinColumn(name = "Id_Cliente", referencedColumnName = "IdCliente", nullable = false)
    @Column(name = "Id_Cliente")
    private Integer Id_Cliente;
    
     
    @JoinColumn(name = "Id_Auto", referencedColumnName = "IdAuto", nullable = false)
    @Column(name = "Id_Auto")
    private Integer Id_Auto;
    

    @JoinColumn(name = "Id_Sedes", referencedColumnName = "IdSedes", nullable = false)
    @Column(name = "Id_Sedes")
    private Integer Id_Sedes;
    
 
    @JoinColumn(name = "Id_Personal", referencedColumnName = "IdPersonal", nullable = false)
    @Column(name = "Id_Personal")
    private Integer Id_Personal;
    
    @Column(name = "Fecha")
    private Date Fecha;
     
     
    public Reservas() {
    }
 
    public Reservas(Integer Id_Auto, Integer Id_Sedes, Integer Id_Personal,Date Fecha) {
        this.Id_Auto = Id_Auto;
        this.Id_Sedes = Id_Sedes;
        this.Id_Personal = Id_Personal;
        this.Fecha = Fecha;
    }

	public int getIdReservas() {
		return IdReservas;
	}

	public void setIdReservas(int idReservas) {
		IdReservas = idReservas;
	}

	public Integer getId_Cliente() {
		return Id_Cliente;
	}

	public void setId_Cliente(Integer id_Cliente) {
		Id_Cliente = id_Cliente;
	}

	public Integer getId_Auto() {
		return Id_Auto;
	}

	public void setId_Auto(Integer id_Auto) {
		Id_Auto = id_Auto;
	}

	public Integer getId_Sedes() {
		return Id_Sedes;
	}

	public void setId_Sedes(Integer id_Sedes) {
		Id_Sedes = id_Sedes;
	}

	public Integer getId_Personal() {
		return Id_Personal;
	}

	public void setId_Personal(Integer id_Personal) {
		Id_Personal = id_Personal;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
 
    
    
    
}