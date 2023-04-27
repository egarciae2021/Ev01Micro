package certus.edu.pe.servicios;

  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Encuestas;
import certus.edu.pe.modelo.Personal;
import certus.edu.pe.repositorios.PersonalRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepositorio personalRepository;

    public List<Personal> findAll() {
        return personalRepository.findAll();
    }
    public List<Personal> buscarTodo(){
		return (ArrayList<Personal>) personalRepository.findAll();
	} 
    

    public Optional<Personal> findById(Integer id) {
        return personalRepository.findById(id);
    }

    public Personal save(Personal Personal) {
        return personalRepository.save(Personal);
    }

    public boolean deleteById(Integer id) {
    	personalRepository.deleteById(id);
    	return true;
    }
}
