package certus.edu.pe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certus.edu.pe.modelo.Reservas;

@Repository
public interface ReservasRepositorio extends JpaRepository<Reservas, Integer> {

}
