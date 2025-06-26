package com.DesignTicTacToe;
import java.util.Objects;
public class Symbol {
    private Character mark;
    public Symbol(Character m){
        mark=m;
    }

    public Character getMark() {
        return mark;
    }
    @Override
    public String toString() {
        return mark.toString(); // ensures clean printing
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Symbol)) return false;
        Symbol other = (Symbol) obj;
        return Objects.equals(this.mark, other.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }
}
