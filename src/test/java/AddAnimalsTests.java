import model.Animal;
import model.FarmException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAnimalsTests extends BaseClass {

    @Test(dataProvider = "kindOfAnimals")
    public void addAnimalToTheFarm(Animal animal) {
        try {
            farm.addAnimalToTheFarm(animal);
            Assert.assertTrue(farm.searhAnimal(animal));
        } catch (FarmException e) {

        }
    }

    @Test
    public void addAnimalToTheFarmNegativeCase() {
        Animal animal = new Animal();
        try {
            farm.addAnimalToTheFarm(animal);
        } catch (FarmException e) {
            Assert.assertFalse(farm.searhAnimal(animal));
            Assert.assertEquals(e.getMessage(), "It is a wrong kind of animals for the farm");
        }
    }
}
