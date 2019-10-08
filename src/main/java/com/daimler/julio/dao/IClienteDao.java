package com.daimler.julio.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.daimler.julio.model.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
	
	@Query("select c from Cliente c inner join c.contratos co where c.tipoPersona = 2 and co.fechaContrato >= :dateStart")
	List<Cliente> findMorales(@Param("dateStart") Date dateStart);
	
}
