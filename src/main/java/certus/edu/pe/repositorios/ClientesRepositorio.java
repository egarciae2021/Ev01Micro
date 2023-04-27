package certus.edu.pe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certus.edu.pe.modelo.Clientes;

@Repository
public interface ClientesRepositorio extends JpaRepository<Clientes, Integer> {

}
