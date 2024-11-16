package com.DevSuperior.DSlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.DSlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
