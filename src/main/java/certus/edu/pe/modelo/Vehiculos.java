package certus.edu.pe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculos")
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdVehiculo;
    
    private String Placa;
    
    private String Modelo;
    
    private String Marca;
    
    
    public Vehiculos() {} 
    
    public Vehiculos(Integer idVehiculo, String placa, String modelo, String marca) {
		super();
		IdVehiculo = idVehiculo;
		Placa = placa;
		Modelo = modelo;
		Marca = marca;
	}

	public Integer getIdVehiculo() {
        return IdVehiculo;
    }
    
    public void setIdVehiculo(Integer idVehiculo) {
        IdVehiculo = idVehiculo;
    }
    
    public String getPlaca() {
        return Placa;
    }
    
    public void setPlaca(String placa) {
        Placa = placa;
    }
    
    public String getModelo() {
        return Modelo;
    }
    
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    
    public String getMarca() {
        return Marca;
    }
    
    public void setMarca(String marca) {
        Marca = marca;
    }
}
