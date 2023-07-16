package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GameListDTO;
import com.example.demo.dto.GameMinDTO;
import com.example.demo.services.GameService;
import com.example.demo.services.GamelistService;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {
	
	@Autowired
	private GamelistService gamelistService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gamelistService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable  Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	
} 
