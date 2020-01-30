import model.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.Point;

import static org.testng.Assert.assertEquals;

public class AnimalLocationTests extends BaseClass {

    @Test(dataProvider = "kindOfAnimals")
    public void checkStartDogLocation(Animal animal) {
        assertEquals(animal.getAnimalCoordinates(), new Point(0, 0));
    }

    @Test(dataProvider = "kindOfAnimals")
    public void moveAnimal(Animal animal) {
        animal.move(new Point(50, 50));
        assertEquals(animal.getAnimalCoordinates(), new Point(50, 50));
    }

    @Test
    public void sheepIsOutOfTheFarm() {
        try {
            farm.moveAnimalAtTheFarm(new Sheep(), new Point(90, 90));
        } catch (FarmException e) {
            assertEquals(e.getMessage(), "The animal is located out of the farm");
        }
    }

    @Test
    public void dogIsInTheSheepArea() {
        try {
            farm.moveAnimalAtTheFarm(new Dog(), new Point(20, 20));
        } catch (FarmException e) {
            assertEquals(e.getMessage(), "The dog is in the sheep pen");
        }
    }
}
