import model.Dogs;
import model.Sheeps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalVoiceTests {

    private Dogs dog = new Dogs();
    private Sheeps sheep = new Sheeps();

    @Test
    public void checkDogVoice(){
        Assert.assertEquals(dog.voice(),"Woof!");
    }

    @Test
    public void checkSheepVoice(){
        Assert.assertEquals(sheep.voice(),"Meeeh");
    }
}
