package com.DevSuperior.DSlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevSuperior.DSlist.DTO.GameDTO;
import com.DevSuperior.DSlist.DTO.GameMinDTO;
import com.DevSuperior.DSlist.service.GameListService;
import com.DevSuperior.DSlist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findGames(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByGameList(listId);
		return result;
	}
}
