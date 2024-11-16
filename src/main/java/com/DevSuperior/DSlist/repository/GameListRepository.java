package com.DevSuperior.DSlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.DSlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}