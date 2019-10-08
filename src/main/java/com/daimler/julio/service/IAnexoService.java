package com.daimler.julio.service;

import java.util.List;
import com.daimler.julio.model.Anexo;

public interface IAnexoService {
	Anexo findById(Long id);
	List<Anexo> findAll();
	Anexo save(Anexo anexo);
	void actualizarPlazo();
}
