package certus.edu.pe.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Serviciodetalle;
import certus.edu.pe.repositorios.ServicioDetalleRepositorio;

@Service
public class ServiciodetalleService {

    @Autowired
    private ServicioDetalleRepositorio ServicioDetalle;

    public List<Serviciodetalle> findAll() {
        return ServicioDetalle.findAll();
    }
    public List<Serviciodetalle> buscarTodo(){
		return (ArrayList<Serviciodetalle>) ServicioDetalle.findAll();
	} 
    

    public Optional<Serviciodetalle> findById(Integer id) {
        return ServicioDetalle.findById(id);
    }

    public Serviciodetalle save(Serviciodetalle Serviciodetalle) {
        return ServicioDetalle.save(Serviciodetalle);
    }

    public boolean deleteById(Integer id) {
    	ServicioDetalle.deleteById(id);
    	return true;
    }
}
