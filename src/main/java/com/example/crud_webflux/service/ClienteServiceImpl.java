package com.example.crud_webflux.service;

import com.example.crud_webflux.dao.IClienteDao;
import com.example.crud_webflux.documents.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements ClienteService{


    @Autowired
    private IClienteDao clienteDao;


    @Override
    public Flux<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public Mono<Cliente> findById(String id) {
        return clienteDao.findById(id);
    }

    @Override
    public Mono<Cliente> save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public Mono<Void> delete(Cliente cliente) {
        return clienteDao.delete(cliente);
    }
}
