package set.GUI;

import javax.swing.*;
import set.model.*;
import java.awt.*;


public class CarView extends JFrame{
    
    CarController carC;

    DrawPanel drawPanel;
    JPanel gasPanel = new JPanel();
    JPanel controlPanel = new JPanel();
    JButton startButton = new JButton();
    JButton stopButton = new JButton();



    private static final int X = 800;
    private static final int Y = 800;

    public CarView(String framename, CarController carC){
        this.carC = carC;
        drawPanel  = new DrawPanel(X, Y-240, carC.getCarsList());
        initComponents(framename);
    }
    private void initComponents(String title) {

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.add(drawPanel);

        gasPanel = carC.createGasPanel();   
        
        this.add(gasPanel);

        controlPanel = carC.createControlPanel((X/2)+4, 200);
        this.add(controlPanel);
        controlPanel.setBackground(Color.CYAN);

        startButton = carC.createStartButton(X/5-15, 200);
        this.add(startButton);

        stopButton = carC.createStopButton(X/5-15, 200);
        this.add(stopButton);

        carC.addGasListener();

        carC.addBrakeListener();

        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void update(Car car){
        int x = (int) Math.round(car.getX());
        int y = (int) Math.round(car.getY());
        drawPanel.moveit(x, y, carC.getCarsList().indexOf(car));
        // repaint() calls the paintComponent method of the panel
        drawPanel.repaint();
    }
}
