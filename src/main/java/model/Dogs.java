package model;

import java.awt.Point;

public class Dogs implements Animal {

    private Point dogCoordinates;

    public Dogs() {
        dogCoordinates = defaultAnimalCoordinate;
    }

    public Point getDogLocation() {
        return dogCoordinates;
    }

    public void move(Point dogCoordinates) {
        this.dogCoordinates = dogCoordinates;
    }

    public String voice() {
        return "Woof!";
    }
}
