package com.daimler.julio.service;

import java.util.List;
import com.daimler.julio.model.Cliente;

public interface IClienteService {
	Cliente findById(Long id);
	List<Cliente> findAll();
	Cliente save(Cliente cliente);
	List<Cliente> findMorales();
}
