package model;

import java.awt.*;

public class Sheeps implements Animal {

    private Point sheepCoordinates;

    public Sheeps() {
        sheepCoordinates = defaultAnimalCoordinate;
    }

    public Point getSheepLocation() {
        return sheepCoordinates;
    }

    public void move(Point sheepCoordinates) {
        this.sheepCoordinates.setLocation(sheepCoordinates);
    }

    public String voice() {
        return "Meeeh";
    }

}
