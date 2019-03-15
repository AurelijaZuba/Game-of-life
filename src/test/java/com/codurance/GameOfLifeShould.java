package com.codurance;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameOfLifeShould {
    //Any live cell with fewer than two live neighbours
    // dies, as if caused by under-population.

    @Test
    void aCellDieWhenThereAreLessThan2LiveNeighbours() {

        Cell cell = new Cell();
        assertThat(cell.status(), is (CellStatus.DEAD));
    }
}
