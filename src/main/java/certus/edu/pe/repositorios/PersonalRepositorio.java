package certus.edu.pe.repositorios;

  
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certus.edu.pe.modelo.Personal;

@Repository
public interface PersonalRepositorio extends JpaRepository<Personal, Integer> {

}