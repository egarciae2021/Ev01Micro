package certus.edu.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Clientes;
import certus.edu.pe.repositorios.ClientesRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepositorio ClienteRepo;

    public List<Clientes> findAll() {
        return ClienteRepo.findAll();
    }
    public List<Clientes> buscarTodo(){
	return (ArrayList<Clientes>) ClienteRepo.findAll();
    } 
    

    public Optional<Clientes> findById(Integer id) {
        return ClienteRepo.findById(id);
    }

    public Clientes save(Clientes cliente) {
        return ClienteRepo.save(cliente);
    }

    public boolean deleteById(Integer id) {
    	ClienteRepo.deleteById(id);
    	return true;
    }
}