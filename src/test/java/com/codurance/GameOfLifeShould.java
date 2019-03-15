package com.codurance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameOfLifeShould {


    @Test
    public void
    a_cell_without_living_neighbours_should_die() {

        World world = new World();

        world.addCell(new CellPosition(0,0), new Cell(CellStatus.ALIVE));
        world.tick();

        World expectedWorld = new World();
        expectedWorld.addCell(new CellPosition(0,0), new Cell(CellStatus.DEAD));
        assertEquals(expectedWorld, world);
    }
}
