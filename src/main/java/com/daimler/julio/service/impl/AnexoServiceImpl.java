package com.daimler.julio.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daimler.julio.dao.IAnexoDao;
import com.daimler.julio.model.Anexo;
import com.daimler.julio.service.IAnexoService;

@Service
public class AnexoServiceImpl implements IAnexoService {

	@Autowired
	private IAnexoDao anexoDao;
	
	@Override
	@Transactional(readOnly=true)
	public Anexo findById(Long id) {
		return anexoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Anexo> findAll() {
		return anexoDao.findAll();
	}

	@Override
	@Transactional()
	public Anexo save(Anexo anexo) {
		return anexoDao.save(anexo);
	}

	@Override
	@Transactional()
	public void actualizarPlazo() {
		List<Anexo> anexos = anexoDao.findFG45();
		if(anexos != null) {
			for(Anexo anexo : anexos) {
				anexo.setPlazo(48);
			}
			anexoDao.saveAll(anexos);
		}
	}
	
}
