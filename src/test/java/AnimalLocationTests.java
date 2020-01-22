import model.Dogs;
import model.Error;
import model.FarmVerification;
import model.Sheeps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.awt.Point;

public class AnimalLocationTests {

    private Dogs dog = new Dogs();
    private Sheeps sheep = new Sheeps();

    @AfterMethod
    public void tearDownAfterMethod(){
        dog.getDogLocation().setLocation(new Point(0,0));
        sheep.getSheepLocation().setLocation(new Point(0,0));
    }

    @Test
    public void checkStartDogLocation() {
        Assert.assertEquals(dog.getDogLocation(), new Point(0, 0));
    }

    @Test
    public void checkStartSheepLocation() {
        Assert.assertEquals(sheep.getSheepLocation(), new Point(0, 0));
    }

    @Test
    public void moveDogLocation() {
        dog.move(new Point(50,50));
        Assert.assertEquals(dog.getDogLocation(), new Point(50, 50));
    }

    @Test
    public void moveSheepLocation() {
        sheep.move(new Point(20,20));
        Assert.assertEquals(sheep.getSheepLocation(), new Point(20, 20));
    }

    @Test
    public void sheepIsOutOfFarm() {
        sheep.move(new Point(90,0));
        Assert.assertFalse(FarmVerification.isAnimalInTheFarm(sheep.getSheepLocation()));
        Assert.assertEquals(FarmVerification.errorMessage, Error.valueOf("OUT_OF_FARM"));
    }

    @Test
    public void dogIsOutOfFarm() {
        dog.move(new Point(90,0));
        Assert.assertFalse(FarmVerification.isAnimalInTheFarm(dog.getDogLocation()));
        Assert.assertEquals(FarmVerification.errorMessage, Error.valueOf("OUT_OF_FARM"));
    }

    @Test
    public void dogIsInTheSheepsArea() {
        dog.move(new Point(30,30));
        Assert.assertTrue(FarmVerification.isDogInTheSheepsArea(dog.getDogLocation()));
        Assert.assertEquals(FarmVerification.errorMessage, Error.valueOf("DOG_IS_IN_SHEEPS_AREA"));
    }
}
