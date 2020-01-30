package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Farm {

    private Rectangle farmArea;
    private Rectangle sheepsArea;
    private List<Animal> animals;


    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimalToTheFarm(Animal animal) throws FarmException {
        if (!isAnimalFromTheFarm(animal)) throw new FarmException(Error.WRONG_ANIMAL.toString());
        animals.add(animal);
    }

    public void moveAnimalAtTheFarm(Animal animal, Point point) throws FarmException {
        if (!isAnimalFromTheFarm(animal)) throw new FarmException(Error.WRONG_ANIMAL.toString());
        if (!isLocationIsInTheFarm(point)) throw new FarmException(Error.OUT_OF_FARM.toString());
        if (animal instanceof Dog && sheepsArea.contains(point))
            throw new FarmException(Error.DOG_IS_IN_SHEEPS_AREA.toString());
        animal.move(point);
    }

    public boolean isLocationIsInTheFarm(Point location) {
        return farmArea.contains(location);
    }

    public boolean isAnimalFromTheFarm(Animal animal) {
        return animal instanceof Dog || animal instanceof Sheep;
    }

    public Rectangle createFarm(Point point1, Point point2, Point point3, Point point4) {
        farmArea = new Rectangle((int) point1.getX(), (int) point1.getY(), 0, 0);
        farmArea.add(point2);
        farmArea.add(point3);
        farmArea.add(point4);
        return farmArea;
    }

    public Rectangle createSheepsArea(Point point1, Point point2, Point point3, Point point4) {
        sheepsArea = new Rectangle((int) point1.getX(), (int) point1.getY(), 0, 0);
        sheepsArea.add(point2);
        sheepsArea.add(point3);
        sheepsArea.add(point4);
        return sheepsArea;
    }

    public boolean searhAnimal(Animal animalToSearch) {
        return animals.stream().anyMatch(animal -> animal.equals(animalToSearch));
    }
}
