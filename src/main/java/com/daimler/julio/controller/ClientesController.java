package com.daimler.julio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daimler.julio.model.Cliente;
import com.daimler.julio.service.IAnexoService;
import com.daimler.julio.service.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IAnexoService anexoService;
	
	@GetMapping()
	public List<Cliente> getClientes(){
		return clienteService.findAll();
	}
	
	@GetMapping("/morales")
	public List<Cliente> getClientesMorales(){
		return clienteService.findMorales();
	}
	
	@GetMapping("/calcularEdad/{idCliente}")
	public String calcularEdad(@PathVariable Long idCliente) {
		Cliente cliente = clienteService.findById(idCliente);
		return cliente.calcularEdad();
	}
	
	@PutMapping("/actualizarPlazo")
	public String actualizarPlazo() {
		anexoService.actualizarPlazo();
		return "Plazo actualizado";
	}
	
}
