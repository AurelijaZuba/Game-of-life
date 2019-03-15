package com.codurance;

import java.util.Objects;

public class CellPosition {
    private final int n;
    private final int m;

    public CellPosition(int n, int m) {
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return "CellPosition{" +
                "n=" + n +
                ", m=" + m +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellPosition that = (CellPosition) o;
        return n == that.n &&
                m == that.m;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, m);
    }
}
