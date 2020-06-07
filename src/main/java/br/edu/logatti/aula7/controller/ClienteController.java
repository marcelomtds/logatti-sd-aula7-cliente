package br.edu.logatti.aula7.controller;

import br.edu.logatti.aula7.constant.Constants;
import br.edu.logatti.aula7.model.Cliente;
import br.edu.logatti.aula7.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(Constants.CLIENTE_API)
    public ResponseEntity<Cliente> save(@RequestBody final Cliente cliente) {
        return ResponseEntity.ok().body(service.save(cliente));
    }

    @GetMapping(Constants.CLIENTE_API)
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @PutMapping(Constants.CLIENTE_API)
    public ResponseEntity<Cliente> update(@RequestBody final Cliente cliente) {
        return ResponseEntity.ok().body(service.save(cliente));
    }

    @DeleteMapping(Constants.CLIENTE_API + "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(Constants.CLIENTE_API + "/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable("id") final String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}