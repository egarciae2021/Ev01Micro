package certus.edu.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Vehiculos;
import certus.edu.pe.repositorios.VehiculoRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepositorio vehiculoRepository;

    public List<Vehiculos> findAll() {
        return vehiculoRepository.findAll();
    }
    public List<Vehiculos> buscarTodo(){
		return (ArrayList<Vehiculos>) vehiculoRepository.findAll();
	} 
    

    public Optional<Vehiculos> findById(Integer id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculos save(Vehiculos vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public boolean deleteById(Integer id) {
    	vehiculoRepository.deleteById(id);
    	return true;
    }
}

