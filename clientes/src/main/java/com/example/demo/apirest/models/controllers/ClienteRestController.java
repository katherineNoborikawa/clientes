package com.example.demo.apirest.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.apirest.models.entity.clientes;
import com.example.demo.apirest.models.service.ClienteService;

@CrossOrigin (origins= "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<clientes> index(){
		
		return clienteService.findAll();
	}
	
}


//frontend


//controladorer (/api)
	//Index
	//save
	//calcular
//servicio
//dao
//entity