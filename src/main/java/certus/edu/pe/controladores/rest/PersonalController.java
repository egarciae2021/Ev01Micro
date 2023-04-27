package certus.edu.pe.controladores.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import certus.edu.pe.modelo.Personal;
import certus.edu.pe.repositorios.PersonalRepositorio;

import java.util.List;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalRepositorio personalRepository;

    // Obtener todos los personal
    @GetMapping
    public List<Personal> obtenerPersonal() {
        return personalRepository.findAll();
    }

    // Obtener un Personal por ID
    @GetMapping("/{id}")
    public Personal obtenerPersonalPorId(@PathVariable int id) {
        return personalRepository.findById(id).orElse(null);
    }

    // Crear un nuevo personal
    @PostMapping
    public Personal crearPersonal(@RequestBody Personal personal) {
        return personalRepository.save(personal);
    }

    // Actualizar un personal existente
    @PutMapping("/{id}")
    public Personal actualizarPersonal(@PathVariable int id, @RequestBody Personal personalActualizado) {
        Personal personal = personalRepository.findById(id).orElse(null);
        if (personal != null) {
            personal.setNombre(personalActualizado.getNombre());
            personal.setApellido(personalActualizado.getApellido());
            personal.setEdad(personalActualizado.getEdad());
            personal.setCelular(personalActualizado.getCelular());
            personal.setCorreo(personalActualizado.getCorreo());
            personal.setDireccion(personalActualizado.getDireccion());
            personal.setOcupacion(personalActualizado.getCargo());
            return personalRepository.save(personal);
        }
        return null;
    }

    // Borrar un personal por ID
    @DeleteMapping("/{id}")
    public void borrarPersonal(@PathVariable int id) {
        personalRepository.deleteById(id);
    }

}
