package com.daimler.julio.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daimler.julio.dao.IClienteDao;
import com.daimler.julio.model.Cliente;
import com.daimler.julio.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return clienteDao.findAll();
	}

	@Override
	@Transactional()
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findMorales(){
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String actual = format.format(new Date());
			Integer atras = Integer.valueOf(actual.substring(0, 4)) - 3;
			String lapso = atras + actual.substring(4);
			return clienteDao.findMorales(format.parse(lapso));
		} catch(Exception e) {
			return null;
		}
	}
	
}
