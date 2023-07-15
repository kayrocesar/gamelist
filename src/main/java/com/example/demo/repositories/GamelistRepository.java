package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Game;
import com.example.demo.entities.Gamelist;

public interface GamelistRepository extends JpaRepository<Gamelist, Long> {

}
