package com.daimler.julio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daimler.julio.model.Contrato;

public interface IContratoDao extends JpaRepository<Contrato, Long> {

}
