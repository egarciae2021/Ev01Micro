package certus.edu.pe.servicios;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Encuestas;
import certus.edu.pe.modelo.Personal;
import certus.edu.pe.modelo.Reservas;
import certus.edu.pe.repositorios.PersonalRepositorio;
import certus.edu.pe.repositorios.ReservasRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservasService {

    @Autowired
    private ReservasRepositorio ReservaRepo;

    public List<Reservas> findAll() {
        return ReservaRepo.findAll();
    }
    public List<Reservas> buscarTodo(){
		return (ArrayList<Reservas>) ReservaRepo.findAll();
	} 
    

    public Optional<Reservas> findById(Integer id) {
        return ReservaRepo.findById(id);
    }

    public Reservas save(Reservas Reservas) {
        return ReservaRepo.save(Reservas);
    }

    public boolean deleteById(Integer id) {
    	ReservaRepo.deleteById(id);
    	return true;
    }
   
}