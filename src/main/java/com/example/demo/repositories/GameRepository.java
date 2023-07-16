package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Game;
import com.example.demo.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT table_game.id, table_game.title, table_game.game_year AS `year`, table_game.img_url AS imgUrl,
			table_game.short_description AS shortDescription, table_belonging.position
			FROM table_game
			INNER JOIN table_belonging ON table_game.id = table_belonging.game_id
			WHERE table_belonging.list_id = :listId
			ORDER BY table_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);

}
