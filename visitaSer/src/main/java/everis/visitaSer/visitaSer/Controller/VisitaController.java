package everis.visitaSer.visitaSer.Controller;

import everis.visitaSer.visitaSer.Service.VisitaService;
import everis.visitaSer.visitaSer.VisitaSerApplication;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Visita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VisitaController {

    @Autowired
    VisitaService visitaServicio;


    @GetMapping("/todos")
    public List<Visita> getVisita(){
        return visitaServicio.getVisita();
    }

    @GetMapping ("/{id}")
    public Optional<Visita> getVisita(@PathVariable("id") int id){
        return visitaServicio.getVisitaId(id);
    }

    @PostMapping("/guardar")
    public Visita saveVisita(@RequestBody Visita visita){

        return visitaServicio.save(visita);
    }

    @PutMapping("/modificar")
    public Visita modifyVisita(@RequestBody Visita visita){

        return visitaServicio.save(visita);
    }

    @DeleteMapping("/eliminar")
    public void deleteVisita(@RequestBody Visita visita){
        visitaServicio.delete(visita);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteVisitaById(@PathVariable("id") int id){

        visitaServicio.deleteById(id);
    }
}
