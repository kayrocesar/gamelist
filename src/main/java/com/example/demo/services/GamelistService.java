package com.example.demo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dto.GameListDTO;
import com.example.demo.entities.Gamelist;
import com.example.demo.repositories.GamelistRepository;

@Service
public class GamelistService {
	
	@Autowired  // injetando uma instancia do gameRepository dentro do Game service
	private GamelistRepository GamelistRepository;
	

	@Transactional(readOnly = true) 
	public List<GameListDTO> findAll(){
		List<Gamelist> result = GamelistRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	

}
