/*

Program: TugOfWar.java          Last Date of this Revision: June 9, 2022

Purpose: An application to play a tug of war game on the phidget with 2 players where the first person to press the button 10 times wins and to display the winnner, both LEDS flash once and then the winners LED flashes 5 times.

Author: Rafat E
School: CHHS
Course: Computer Programming 20
 

*/


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        int redCount = 0;
        int greenCount = 0;
        
        boolean greenPlayer = false;
        boolean redPlayer = false;
        
        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        
       
       //check in the while loop whether redCount is less than 10 
        while(redCount < 10 && greenCount < 10)
        {
        	
        	
            if(redButton.getState() && !redPlayer ) //red button is pressed && redPlayer is true
            {
            	redLED.setState(true);
	            redCount++;
                
            }          
            
            else if(!redButton.getState() ) 
            {
                redLED.setState(false);
            }
            
            //Do the green button
            
            if(greenButton.getState() && !greenPlayer ) //green button is pressed && greenPlayer is true
            {
            	greenLED.setState(true);
	            greenCount++;
                
            }          
            
            else if(!greenButton.getState() ) 
            {
                greenLED.setState(false);
            }
            
             
            greenPlayer = greenButton.getState();
            redPlayer = redButton.getState();
            Thread.sleep(150);
        }   
            
            //flash all the lights
            
            
            
          greenLED.setState(false);      
          redLED.setState(false);          
          Thread.sleep(500);
          greenLED.setState(true);
          redLED.setState(true);
          greenLED.setState(false);          
          redLED.setState(false);          
          Thread.sleep(500);
            
            
            //Display the winner
            
            
            if (redCount == 10)
            {	
               while (redCount > 5)
               {  redLED.setState(true);
               	  Thread.sleep(500);
               	  redLED.setState(false);
               	  Thread.sleep(500);
               	  redCount--;
               }
            }
            
               	  else if (greenCount == 10)
               	  {
               		 while (greenCount > 5)
                     {  greenLED.setState(true);
                     	  Thread.sleep(500);
                     	  greenLED.setState(false);
                     	  Thread.sleep(500);
                     	  greenCount--;
                     }
            
               	  }
    
}}
  