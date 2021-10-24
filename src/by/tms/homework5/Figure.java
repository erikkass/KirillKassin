package by.tms.homework5;

import java.util.Objects;

public class Figure {

    private String figureName;

    public Figure(String figureName) {
        this.figureName = figureName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return figureName.equals(figure.figureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureName);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "figureName='" + figureName + '\'' +
                '}';
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
