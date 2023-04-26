package certus.edu.pe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certus.edu.pe.modelo.Vehiculos;

 @Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculos, Integer> {
}