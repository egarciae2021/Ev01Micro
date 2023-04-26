package certus.edu.pe.controladores.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import certus.edu.pe.modelo.Vehiculos;
import certus.edu.pe.servicios.VehiculoService;
 

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;
    
    @GetMapping
    public List<Vehiculos> listarVehiculos() {
        return vehiculoService.findAll();
    }
     
    @PostMapping
    public ResponseEntity<Void> agregarVehiculo(@RequestBody Vehiculos vehiculo) {
        vehiculoService.save(vehiculo);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVehiculo(@PathVariable Integer id) {
        boolean eliminado = vehiculoService.deleteById(id);
        if (!eliminado) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarVehiculo(@PathVariable Integer id, @RequestBody Vehiculos vehiculo) {
        Optional<Vehiculos> vehiculoExistente = vehiculoService.findById(id);
        if (vehiculoExistente.isPresent()) {
            Vehiculos vehiculoActualizado = vehiculoExistente.get();
            vehiculoActualizado.setPlaca(vehiculo.getPlaca());
            vehiculoActualizado.setMarca(vehiculo.getMarca());
            vehiculoActualizado.setModelo(vehiculo.getModelo());
            vehiculoService.save(vehiculoActualizado);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculos> obtenerVehiculo(@PathVariable Integer id) {
        Optional<Vehiculos> vehiculoExistente = vehiculoService.findById(id);
        if (vehiculoExistente.isPresent()) {
            Vehiculos vehiculo = vehiculoExistente.get();
            return new ResponseEntity<Vehiculos>(vehiculo, HttpStatus.OK);
        } else {
            return new ResponseEntity<Vehiculos>(HttpStatus.NOT_FOUND);
        }
    }


    
    
}

    
    
    
    
    
     