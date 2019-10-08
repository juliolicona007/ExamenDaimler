package com.daimler.julio.service;

import java.util.List;
import com.daimler.julio.model.Contrato;

public interface IContratoService {
	Contrato findById(Long id);
	List<Contrato> findAll();
	Contrato save(Contrato contrato);
}
