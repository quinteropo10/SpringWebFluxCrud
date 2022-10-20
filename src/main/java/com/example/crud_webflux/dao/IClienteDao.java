package com.example.crud_webflux.dao;

import com.example.crud_webflux.documents.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClienteDao extends ReactiveMongoRepository<Cliente, String> {



}
