import model.Dog;
import model.Farm;
import model.Sheep;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.awt.*;

public class BaseClass {

    public Farm farm = new Farm();
    public Dog dog = new Dog();
    public Sheep sheep = new Sheep();

    @BeforeClass
    public void setup() {
        farm.createFarm(new Point(0, 0), new Point(0, 80), new Point(80, 80), new Point(80, 0));
        farm.createSheepsArea(new Point(20, 20), new Point(20, 40), new Point(40, 40), new Point(40, 20));
    }

    @DataProvider
    public Object[][] kindOfAnimals() {
        return new Object[][]{
                {new Dog()},
                {new Sheep()}
        };
    }
}
