package com.example.demo.dto;

import com.example.demo.entities.Gamelist;

public class GameListDTO {

	
	private Long id;
	private String name;
	
	public  GameListDTO (){
	
	}

	public GameListDTO(Gamelist entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
}
