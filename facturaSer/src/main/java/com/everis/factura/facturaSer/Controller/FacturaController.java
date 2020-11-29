package com.everis.factura.facturaSer.Controller;

import com.everis.factura.facturaSer.Service.FacturaService;
import everis.entidadesMongo.entidadesMongo.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/todos")
    public List<Factura> getFacturaId(String id){
        return (List<Factura>) facturaService.getFacturaSinc(id);
    }

    @GetMapping ("/{id}")
    public Mono<Factura> getFactura(@PathVariable("id") String id){
        return facturaService.getFacturaId(id);
    }

    @PostMapping("/guardar")
    public Mono<Factura> saveFactura(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @PutMapping("/modificar")
    public Mono<Factura> modifyFactura(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @DeleteMapping("/eliminar")
    public void deleteFactura(@RequestBody Factura factura){
        facturaService.delete(factura);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFacturaById(@PathVariable("id") String id){
        facturaService.deleteById(id);
    }
}
