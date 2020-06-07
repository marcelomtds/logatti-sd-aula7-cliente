package br.edu.logatti.aula7.service;

import br.edu.logatti.aula7.model.Cliente;
import br.edu.logatti.aula7.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente save(final Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Optional<Cliente> findById(final String id) {
        return repository.findById(id);
    }

    public void delete(final String id) {
        repository.deleteById(id);
    }
}
