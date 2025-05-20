package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
	
	// Atributos
	private Long id;
	private String name;
	
	// Metodos Especificos
	
	// Metodos Especiais
	public GameListDTO() {
		super();
	}

	public GameListDTO(GameList entity) {
		super();
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
