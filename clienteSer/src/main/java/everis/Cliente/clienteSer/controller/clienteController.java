package everis.Cliente.clienteSer.controller;

import everis.Cliente.clienteSer.service.clienteService;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class clienteController {

    @Autowired
    private clienteService clienteService;

    @GetMapping("/todos")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    @GetMapping ("/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") int id){
        return clienteService.getClienteId(id);
    }

    @PostMapping("/guardar")
    public Cliente saveCliente(@RequestBody Cliente cliente){

        return clienteService.save(cliente);
    }

    @PutMapping("/modificar")
    public Cliente modifyCliente(@RequestBody Cliente cliente){

        return clienteService.save(cliente);
    }

    @DeleteMapping("/eliminar")
    public void deleteCliente(@RequestBody Cliente cliente){
        clienteService.delete(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteClienteById(@PathVariable("id") int id){

        clienteService.deleteById(id);
    }
}
