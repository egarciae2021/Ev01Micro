package certus.edu.pe.controladores.rest;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import certus.edu.pe.modelo.Personal;
import certus.edu.pe.modelo.Reservas;
import certus.edu.pe.repositorios.PersonalRepositorio;
import certus.edu.pe.servicios.ReservasService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class ReservasController {


    @Autowired
    private ReservasService ReservasService;

    // Obtener todos los personal
    @GetMapping
    public List<Reservas> obtenerPersonal() {
        return ReservasService.findAll();
    }

    // Obtener un Personal por ID
    @GetMapping("/{id}")
    public Reservas obtenerPersonalPorId(@PathVariable int id) {
        return ReservasService.findById(id).orElse(null);
    }

    // Crear un nuevo personal
    @PostMapping
    public Reservas crearPersonal(@RequestBody Reservas Reservas) {
        return ReservasService.save(Reservas);
    }

    // Actualizar un personal existente
    @PutMapping("/{id}")
    public Reservas actualizarPersonal(@PathVariable int id, @RequestBody Reservas personalActualizado) {
    	Reservas personal = ReservasService.findById(id).orElse(null);
        if (personal != null) {
            personal.setId_auto(personalActualizado.getId_auto());
            personal.setId_sedes(personalActualizado.getId_sedes());
            personal.setId_personal(personalActualizado.getId_personal());
            personal.setFecha(personalActualizado.getFecha()); 
            return ReservasService.save(personal);
        }
        return null;
    }

    // Borrar un personal por ID
    @DeleteMapping("/{id}")
    public void borrarPersonal(@PathVariable int id) {
    	ReservasService.deleteById(id);
    }
}