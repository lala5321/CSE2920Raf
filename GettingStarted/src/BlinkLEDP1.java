/*

Program: BlinkLEDP1.java          Last Date of this Revision: June 9, 2022

Purpose: An application to the make the phidget LED red stay on for 2 seconds at a time.

Author: Rafat E
School: CHHS
Course: Computer Programming 20
 

*/

//Add Phidgets Library 
import com.phidget22.*;

public class BlinkLEDP1 {
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
            Thread.sleep(2000);
            redLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
  