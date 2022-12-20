package set.GUI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.imageio.ImageIO;
import javax.swing.*;

import set.model.Car;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    // Just a single image, TODO: Generalize
    // To keep track of a singel cars position

    private List<Point> carPoints = new ArrayList<>();
    private List<BufferedImage> carImages = new ArrayList<>();


    // TODO: Make this genereal for all cars
    void moveit(int x, int y, int index){
        carPoints.set(index, new Point(x, y));
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, List<Car> cars) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block

        for (Car car : cars){

            carPoints.add(new Point((int) Math.round(car.getX()), (int) Math.round(car.getY())));


            try {
                // You can remove the "pics" part if running outside of IntelliJ and
                // everything is in the same main folder.
                // volvoImage = ImageIO.read(new File("Volvo240.jpg"));
    
                // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
                // if you are starting in IntelliJ.

                carImages.add(ImageIO.read(DrawPanel.class.getResourceAsStream("pics/" + car.getModelName() + ".jpg")));
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point point : carPoints){
            BufferedImage image = carImages.get(carPoints.indexOf(point));
            g.drawImage(image, point.x, point.y, null); // see javadoc for more info on the parameters
        }
    }
}
