package certus.edu.pe.controladores.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import certus.edu.pe.modelo.*;
import certus.edu.pe.servicios.*;


@RestController
@RequestMapping("/encuesta")
public class EncuestaController {

    @Autowired
    private EncuestasService EncuestaService;
    
    @GetMapping
    public List<Encuestas> listarServiciosDetalle() {
        return EncuestaService.findAll();
    }
     
    @PostMapping
    public ResponseEntity<Void> agregarServicio(@RequestBody Encuestas Encuesta) {
    	EncuestaService.save(Encuesta);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> EliminarServicio(@PathVariable Integer id) {
        boolean eliminado = EncuestaService.deleteById(id);
        if (!eliminado) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarVehiculo(@PathVariable Integer id, @RequestBody Encuestas EncuestaNuevo) {
        Optional<Encuestas> EncuestaExistente = EncuestaService.findById(id);
        if (EncuestaExistente.isPresent()) {
        	Encuestas EncuestaActual = EncuestaExistente.get();
        	EncuestaActual.setCalificacion(EncuestaNuevo.getCalificacion());
        	EncuestaActual.setId_sedes(EncuestaNuevo.getId_sedes());
        	EncuestaActual.setId_personal(EncuestaNuevo.getId_personal());
        	EncuestaService.save(EncuestaActual);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Encuestas> obtenerVehiculo(@PathVariable Integer id) {
        Optional<Encuestas> ServicioExistente = EncuestaService.findById(id);
        if (ServicioExistente.isPresent()) {
        	Encuestas Serviciodetalle = ServicioExistente.get();
            return new ResponseEntity<Encuestas>(Serviciodetalle, HttpStatus.OK);
        } else {
            return new ResponseEntity<Encuestas>(HttpStatus.NOT_FOUND);
        }
    }


	
}
