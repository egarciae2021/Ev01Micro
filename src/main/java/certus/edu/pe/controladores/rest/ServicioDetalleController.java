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
@RequestMapping("/serviciodetalle")
public class ServicioDetalleController {
	 
    @Autowired
    private ServiciodetalleService ServicioService;
    
    @GetMapping
    public List<Serviciodetalle> listarServiciosDetalle() {
        return ServicioService.findAll();
    }
     
    @PostMapping
    public ResponseEntity<Void> agregarServicio(@RequestBody Serviciodetalle Serviciodetalle) {
    	ServicioService.save(Serviciodetalle);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> EliminarServicio(@PathVariable Integer id) {
        boolean eliminado = ServicioService.deleteById(id);
        if (!eliminado) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarVehiculo(@PathVariable Integer id, @RequestBody Serviciodetalle ServicioDetalleNuevo) {
        Optional<Serviciodetalle> ServicioExistente = ServicioService.findById(id);
        if (ServicioExistente.isPresent()) {
        	Serviciodetalle ServicioActual = ServicioExistente.get();
        	ServicioActual.setId_reserva(ServicioDetalleNuevo.getId_reserva());
        	ServicioActual.setId_servicio(ServicioDetalleNuevo.getId_servicio()); 
        	ServicioService.save(ServicioActual);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serviciodetalle> obtenerVehiculo(@PathVariable Integer id) {
        Optional<Serviciodetalle> ServicioExistente = ServicioService.findById(id);
        if (ServicioExistente.isPresent()) {
        	Serviciodetalle Serviciodetalle = ServicioExistente.get();
            return new ResponseEntity<Serviciodetalle>(Serviciodetalle, HttpStatus.OK);
        } else {
            return new ResponseEntity<Serviciodetalle>(HttpStatus.NOT_FOUND);
        }
    }


	
}
