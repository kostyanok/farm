package model;

import java.awt.Point;

public interface Animal {

    Point defaultAnimalCoordinate = new Point(0,0);

    void move(Point animalCoordinates);
    String voice();
}
