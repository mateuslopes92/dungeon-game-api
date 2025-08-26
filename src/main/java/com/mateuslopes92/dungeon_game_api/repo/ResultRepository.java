package com.mateuslopes92.dungeon_game_api.entity;

import com.mateuslopes92.dungeon_game_api.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResultRepository extends JpaRepository<Result, UUID> {}
