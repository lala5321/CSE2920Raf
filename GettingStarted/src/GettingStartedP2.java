//Add Phidgets Library 
import com.phidget22.*;

public class GettingStartedP2 {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        while(true){
            redLED.setState(true);
            Thread.sleep(500);
            redLED.setState(false);
            Thread.sleep(500);
        }
    }
}
  