package testcases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
public class Trial3 {

	public static void main(String[] args) throws InterruptedException, AWTException, MalformedURLException 
	
	{
		// Setting the path to the desktop application for executing.
		String appPath ="C:/assignment/build-EmojiPicker-main-Desktop_Qt_6_5_1_MinGW_64_bit-Debug/appEmojiSelector.exe" ;
		DesktopOptions option =new DesktopOptions();
		option.setApplicationPath(appPath);
		
		
		
		// Create the WiniumDriver instance
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),option);
		System.out.println("Launched the app and now proceeding to click the smiley");
		Thread.sleep(5000);
		// Create an instance of the Robot class
        Robot robot = new Robot();

        // Set the desired coordinates for clicking the smiley
        int x =421;  // X-coordinate
        int y =912;  // Y-coordinate

        // Move the mouse cursor to the specified coordinates
        robot.mouseMove(x, y);

        // Simulate a mouse click at the current cursor position
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("Smiley Clicked !");
        Thread.sleep(3000);
        driver.quit();
    }
}