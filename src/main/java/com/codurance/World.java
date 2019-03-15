package com.codurance;

import java.util.Objects;

public class World {
    private final CellPosition cellPosition;
    private final Cell cell;

    public World(CellPosition cellPosition, Cell cell) {

        this.cellPosition = cellPosition;
        this.cell = cell;
    }


    @Override
    public String toString() {
        return "World{" +
                "cellPosition=" + cellPosition +
                ", cell=" + cell +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return cellPosition.equals(world.cellPosition) &&
                cell.equals(world.cell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellPosition, cell);
    }

    public void tick() {
        this.cell.die();
    }
}
