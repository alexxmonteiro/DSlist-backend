package com.DevSuperior.DSlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevSuperior.DSlist.DTO.GameMinDTO;
import com.DevSuperior.DSlist.entities.Game;
import com.DevSuperior.DSlist.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}