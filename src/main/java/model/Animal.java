package model;

import java.awt.Point;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;

public class Animal {

    private int animalCode;
    private Point animalCoordinates;

    public Animal(){
        this.animalCode = new Random().nextInt(2000);
        this.animalCoordinates = new Point(0,0);
    }

    public void move(Point animalCoordinates){
        this.animalCoordinates.setLocation(animalCoordinates);
    }

    public Point getAnimalCoordinates(){
        return this.animalCoordinates;
    }

    public int getAnimalCode(){
        return this.animalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalCode == animal.animalCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalCode);
    }
}
