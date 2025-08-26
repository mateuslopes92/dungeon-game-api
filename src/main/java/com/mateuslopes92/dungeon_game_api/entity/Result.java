package com.mateuslopes92.dungeon_game_api.entity;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private Instant createdAt = Instant.now();

    @Column(nullable = false)
    private int minInitialHealth;

    @Column(nullable = false)
    private int rows;

    @Column(nullable = false)
    private int cols;

    public UUID getId() { return id; }
    public Instant getCreatedAt() { return createdAt; }
    public int getMinInitialHealth() { return minInitialHealth; }
    public void setMinInitialHealth(int minInitialHealth) { this.minInitialHealth = minInitialHealth; }
    public int getRows() { return rows; }
    public void setRows(int rows) { this.rows = rows; }
    public int getCols() { return cols; }
    public void setCols(int cols) { this.cols = cols; }
}