package util;

import org.openqa.selenium.WebElement;

import java.awt.*;

public class colorFinder {
    public void findColorOfPixel(WebElement webElement) {
        try {
            Robot robot = new Robot();
            Integer[] locations = getElementCoordinates(webElement);
            // The pixel color information at 20, 20
            Color color = robot.getPixelColor(locations[0], locations[1]);

            // Print the RGB information of the pixel color
            System.out.println("Red   = " + color.getRed());
            System.out.println("Green = " + color.getGreen());
            System.out.println("Blue  = " + color.getBlue());

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public Integer[] getElementCoordinates(WebElement webElement) {
        System.out.println(webElement.getLocation().getX());
        System.out.println(webElement.getLocation().getY());
        Integer[] locations = new Integer[]{webElement.getLocation().getX(), webElement.getLocation().getY()};
        return locations;
    }
}
