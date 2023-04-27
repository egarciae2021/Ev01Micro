package certus.edu.pe.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Encuestas;
import certus.edu.pe.modelo.Serviciodetalle;
import certus.edu.pe.repositorios.EncuestasRepositorio;
import certus.edu.pe.repositorios.ServicioDetalleRepositorio;

@Service
public class EncuestasService {
	   @Autowired
	    private EncuestasRepositorio EncuestaRepo;

	    public List<Encuestas> findAll() {
	        return EncuestaRepo.findAll();
	    }
	    public List<Encuestas> buscarTodo(){
			return (ArrayList<Encuestas>) EncuestaRepo.findAll();
		} 
	    

	    public Optional<Encuestas> findById(Integer id) {
	        return EncuestaRepo.findById(id);
	    }

	    public Encuestas save(Encuestas Encuestas) {
	        return EncuestaRepo.save(Encuestas);
	    }

	    public boolean deleteById(Integer id) {
	    	EncuestaRepo.deleteById(id);
	    	return true;
	    }
	}