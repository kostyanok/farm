import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalVoiceTests extends BaseClass{

    @Test
    public void checkDogVoice(){
        Assert.assertEquals(dog.voice(),"Woof!");
    }

    @Test
    public void checkSheepVoice(){
        Assert.assertEquals(sheep.voice(),"Meeeh");
    }
}
