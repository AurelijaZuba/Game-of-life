package com.codurance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeShould {


    @Test
    public void
    a_cell_without_living_neighbours_should_die() {

        World world = new World(new CellPosition(0,0), new Cell(CellStatus.ALIVE));
        assertEquals(new World(new CellPosition(0,0), new Cell(CellStatus.DEAD)), world);
    }
}
