package com.example.demo.apirest.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.apirest.models.entity.clientes;

public interface IClienteDao extends CrudRepository<clientes, Long>{

}