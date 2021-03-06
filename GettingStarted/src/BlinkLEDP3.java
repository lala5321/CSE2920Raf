/*

Program: BlinkLEDP3.java          Last Date of this Revision: June 9, 2022

Purpose: An application to the make the phidget LED green flash.

Author: Rafat E
School: CHHS
Course: Computer Programming 20
 

*/

//Add Phidgets Library 
import com.phidget22.*;

public class BlinkLEDP3 {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput greenLED = new DigitalOutput();


        //Address 
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open 
 
        greenLED.open(1000);
        
        //Use your Phidgets 
        while(true){
        	    
            greenLED.setState(true);
            Thread.sleep(500);
            greenLED.setState(false);
            Thread.sleep(500);
        }
    }
}
  