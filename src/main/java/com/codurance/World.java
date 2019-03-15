package com.codurance;

import java.util.*;

public class World {

    private Map<CellPosition, Cell> cells;

    public World() {
        this.cells = new HashMap<>();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return cells.equals(world.cells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cells);
    }

    @Override
    public String toString() {
        return "World{" +
                "cells=" + cells +
                '}';
    }

    public void tick() {
        this.cells.values().forEach(Cell::die);
    }

    public void addCell(CellPosition cellPosition, Cell cell) {
        cells.put(cellPosition, cell);
    }
}
