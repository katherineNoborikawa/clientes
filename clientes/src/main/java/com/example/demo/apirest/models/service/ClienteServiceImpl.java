package com.example.demo.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.apirest.models.dao.IClienteDao;
import com.example.demo.apirest.models.entity.clientes;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private IClienteDao clienteDAO;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<clientes> findAll() {

		return (List<clientes>) clienteDAO.findAll();
	}


}

