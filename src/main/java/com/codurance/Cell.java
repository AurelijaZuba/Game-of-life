package com.codurance;

import java.util.Objects;

public class Cell {
    private CellStatus status;

    public Cell(CellStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return status == cell.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "status=" + status +
                '}';
    }
}
