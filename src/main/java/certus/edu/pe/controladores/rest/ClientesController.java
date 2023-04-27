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

import certus.edu.pe.modelo.Clientes;
import certus.edu.pe.servicios.ClientesService;
 

@RestController
@RequestMapping("/clientes")
public class ClientesController{
    
    @Autowired
    private ClientesService clienteService;
    
    @GetMapping
    public List<Clientes> listarClientes() {
        return clienteService.findAll();
    }
     
    @PostMapping
    public ResponseEntity<Void> agregarCliente(@RequestBody Clientes cliente) {
        clienteService.save(cliente);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
     
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Integer id) {
        boolean eliminado = clienteService.deleteById(id);
        if (!eliminado) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarCliente(@PathVariable Integer id, @RequestBody Clientes cliente) {
        Optional<Clientes> clienteExistente = clienteService.findById(id);
        if (clienteExistente.isPresent()) {
            Clientes clienteActualizado = clienteExistente.get();

            clienteActualizado.setNombre(clienteActualizado.getNombre());
            clienteActualizado.setApellido(clienteActualizado.getApellido());
            clienteActualizado.setEdad(clienteActualizado.getEdad());
            clienteActualizado.setCelular(clienteActualizado.getCelular());
            clienteActualizado.setCorreo(clienteActualizado.getCorreo());
            clienteActualizado.setDireccion(clienteActualizado.getDireccion());
            clienteService.save(clienteActualizado);

            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> obtenerCliente(@PathVariable Integer id) {
        Optional<Clientes> clienteExistente = clienteService.findById(id);
        if (clienteExistente.isPresent()) {
            Clientes cliente = clienteExistente.get();
            return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<Clientes>(HttpStatus.NOT_FOUND);
        }
    }

   
    
}
  