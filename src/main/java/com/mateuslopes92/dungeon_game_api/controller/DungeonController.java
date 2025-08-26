package com.mateuslopes92.dungeon_game_api.controller;

import com.mateuslopes92.dungeon_game_api.entity.Result;
import com.mateuslopes92.dungeon_game_api.service.DungeonService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/dungeon")
public class DungeonController {

    private final DungeonService service;

    public DungeonController(DungeonService service) {
        this.service = service;
    }

    @PostMapping("/solve")
    public Result solve(@RequestBody Map<String, int[][]> body) {
        int[][] dungeon = body.get("dungeon");
        return service.solve(dungeon);
    }
}