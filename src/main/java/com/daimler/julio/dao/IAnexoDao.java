package com.daimler.julio.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.daimler.julio.model.Anexo;

public interface IAnexoDao extends JpaRepository<Anexo, Long> {

	@Query("select a from Anexo a where a.numeroSerie like '%FG45'")
	List<Anexo> findFG45();
	
}
