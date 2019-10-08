package com.daimler.julio.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daimler.julio.dao.IContratoDao;
import com.daimler.julio.model.Contrato;
import com.daimler.julio.service.IContratoService;

@Service
public class ContratoServiceImpl implements IContratoService {

	@Autowired
	private IContratoDao contratoDao;
	
	@Override
	@Transactional(readOnly=true)
	public Contrato findById(Long id) {
		return contratoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Contrato> findAll() {
		return contratoDao.findAll();
	}

	@Override
	@Transactional()
	public Contrato save(Contrato contrato) {
		return contratoDao.save(contrato);
	}

}
