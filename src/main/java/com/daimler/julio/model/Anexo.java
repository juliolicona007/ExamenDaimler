package com.daimler.julio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anexos")
public class Anexo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_anexo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnexo;
	
	private String numeroAnexo;
	
	private Integer plazo;
	
	private Double pagoMensual;
	
	private String numeroSerie;

	public Long getIdAnexo() {
		return idAnexo;
	}

	public void setIdAnexo(Long idAnexo) {
		this.idAnexo = idAnexo;
	}

	public String getNumeroAnexo() {
		return numeroAnexo;
	}

	public void setNumeroAnexo(String numeroAnexo) {
		this.numeroAnexo = numeroAnexo;
	}

	public Integer getPlazo() {
		return plazo;
	}

	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}

	public Double getPagoMensual() {
		return pagoMensual;
	}

	public void setPagoMensual(Double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
}
